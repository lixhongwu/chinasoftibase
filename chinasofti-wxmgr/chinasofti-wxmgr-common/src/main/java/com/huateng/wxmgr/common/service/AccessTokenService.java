package com.huateng.wxmgr.common.service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import net.sf.json.JSONObject;



/**
 * 
 * @ClassName:			AccessTokenService.java
 * @Description: 		access_token服务，负责access_token的获取以及保存
 * @author:				ghost
 * @version:			V1.0
 * @Date:				2017年11月7日 下午2:19:44
 */
@Component("accessTokenService")
@Scope("singleton")
public class AccessTokenService {
	
	private final static Logger logger = LoggerFactory.getLogger(AccessTokenService.class);
	
	/**
	 * 获取access_token
	 */
	public final static String GET_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${access.appId}")
	private String appId;
	
	@Value("${access.appSecret}")
	private String appSecret;
	
	@Value("${custom.connection.retry-time}")
	private int retryTime;
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;
	
	/**
	 * access_token存放在redis中的key
	 */
	private final static String KEY = "access_token";
	
	/**
	 * 从微信获取的access_token，每次请求都需要带上这个access_token
	 */
	private volatile String accessToken;
	
	private ReentrantReadWriteLock lock;
	
	private AtomicInteger counter;
	
	public AccessTokenService() {
		lock = new ReentrantReadWriteLock();
		counter = new AtomicInteger(0);
	}
	
	/**
	 * 获取一个access_token
	 * @return
	 */
	public String getAccessToken() {
		final ReadLock readLock = lock.readLock();
		if(keyExist()) {
			readLock.lock();
			String tmpKey = null;
			try {
				tmpKey = redisTemplate.opsForValue().get(KEY);
			} finally {
				readLock.unlock();
			}
			// 可能由于网络原因，导致在access_token在判断和获取的时间段之间失效
			return StringUtils.isEmpty(tmpKey)?refreshAndGet():tmpKey;
		} else {
			return refreshAndGet();
		}
	}
	
	/**
	 * 刷新并获取access_token
	 * @return
	 */
	public String refreshAndGet() {
		setToken();
		return accessToken;
	}
	
	/**
	 * 获取一个access_token并保存进redis中
	 */
	private void setToken() {
		final WriteLock writeLock = lock.writeLock();
		// 首先保存counter的值
		final int localCounter = counter.get();
		writeLock.lock();
		try {
			// 如果localCounter和counter的值不相等，说明其它线程已经获取并修改过access_token的值了
			// 这样就不需要重新再去微信服务器获取新的access_token并保存至redis中
			if(localCounter != counter.get()) {
				logger.info("其它线程已经刷新过access_token，无需再次获取");
				return;
			} else {
				int times = retryTime;
				while(times-- > 0) {
					if(doGetToken()) {
						// 更新counter的值
						counter.incrementAndGet();
						break;
					}
				}
			}
		} finally {
			writeLock.unlock();
		}
	}
	
	/**
	 * 实际获取accessToken的方法
	 */
	private boolean doGetToken() {
		try {
			// 首先向微信服务器发送请求
			JSONObject response = restTemplate.getForEntity(String.format(GET_ACCESS_TOKEN, appId, appSecret), JSONObject.class).getBody();
			if(response == null || response.size() == 0) {
				logger.error("获取access_token的响应为空!");
				return false;
			}
			// 获取到access_token则保存到本地以及redis
			if(response.has("access_token")) {
				String token = response.get("access_token").toString();
				if(token.startsWith("\"") && token.endsWith("\"")) {
					token = token.substring(1, token.length() - 1);
				}
				accessToken = token;
				// 获取过期时间
				long expire = Long.parseLong(response.get("expires_in").toString());
				// 然后将其保存进redis中
				saveAccessToken(accessToken, expire);
				return true;
			} else {
				if(response.has("errormsg")) {
					logger.error("请求access_token响应了一个错误： " + response.get("errormsg").toString());
				} else {
					logger.error("未知响应：" + response.toString());
				}
				return false;
			}
		} catch (RestClientException e) {
			logger.error("请求access_token时出现异常: " + e.getMessage(), e);
			return false;
		}
	}
	
	
	/**
	 * 判断KEY是否存在于REDIS中
	 * @return
	 */
	private boolean keyExist() {
		return redisTemplate.hasKey(KEY);
	}
	
	/**
	 * 设置ACCESS_TOKEN以及其过期时间
	 * @param value
	 * @param expire
	 */
	private void saveAccessToken(String value, long expire) {
		redisTemplate.opsForValue().set(KEY, value, expire, TimeUnit.SECONDS);
	}
	
}
