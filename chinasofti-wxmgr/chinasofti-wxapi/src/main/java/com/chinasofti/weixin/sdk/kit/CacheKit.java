/**
 * 
 */
package com.chinasofti.weixin.sdk.kit;

import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.PropertiesPlugin;

import com.jfinal.plugin.redis.Redis;

/**
 * @author it-wb-n2-068
 *
 */
public class CacheKit {

	private static final Logger log = LogManager.getLogger(CacheKit.class);
	
	private static String cache_type = (String)PropertiesPlugin.getParamMapValue(DictKeys.cache_type);
	
	public static final Integer invalid_sec = 60*60;//单位秒
	
	private static String  getKey(String cacheName, Object key){
		return cacheName + "_" + key;
	}
	
	public static boolean isRedis(){
		boolean flag = false;
		if("redis".equalsIgnoreCase(cache_type)||"redissentinel".equalsIgnoreCase(cache_type)){
			flag = true;
		}
		return flag;
	}
	
	/**
	 * 放入缓存，请使用此方法，设置缓存失效时间，以免缓存过多
	 * @param cacheName
	 * @param key
	 * @param value
	 * @param seconds -1:永久不失效,服务器重启也不会失效,其它就按传入的多少秒才失效
	 */
	public static void put(String cacheName, Object key, Object value, int seconds) {
		if(isRedis()){
			String pky = getKey(cacheName,key);
			if(seconds==-1){
				Redis.use(cacheName).set(pky, value); 
			}else{
				Redis.use(cacheName).setex(pky,seconds, value); 
			}
		}else{
			ECacheKit.put(cacheName, key, value);
		}
	}
	
	public static Long incr(String cacheName,Object key) {
		Long incrValue = 0L;
		if(isRedis()){
			String pky = getKey(cacheName,key);
			incrValue = Redis.use(cacheName).incr(pky); 
		}else{
			throw new BusinessException("incr 暂不支持ECache");
		}
		return incrValue;
	}
	
	public static Long decr(String cacheName,Object key) {
		Long decrValue = 0L;
		if(isRedis()){
			String pky = getKey(cacheName,key);
			decrValue = Redis.use(cacheName).decr(pky); 
		}else{
			throw new BusinessException("decr 暂不支持ECache");
		}
		return decrValue;
	}
	/**
	 * 放入缓存，设置缓存失效时间，失效时间为默认失效时间
	 * @param cacheName
	 * @param key
	 * @param value
	 */
	public static void putNoSerialization(String cacheName, Object key, Object value) {
		if(isRedis()){
			String pky = getKey(cacheName,key);
			Redis.use(cacheName).setNoSerialization(pky, value); 
		}else{
			ECacheKit.put(cacheName, key, value);
		}
	}
	
	/**
	 * 放入缓存，设置缓存失效时间，需要传入缓存失败时间
	 * @param cacheName
	 * @param key
	 * @param value
	 * @param invalid_sec
	 */
	public static void putex(String cacheName, Object key, Object value,int invalid_sec) {
		if(isRedis()){
			String pky = getKey(cacheName,key);
			Redis.use(cacheName).setex(pky,invalid_sec, value); 
		}else{
			ECacheKit.put(cacheName, key, value);
		}
	}
	
	/**
	 * 放入缓存，设置缓存失效时间，失效时间为默认失效时间
	 * @param cacheName
	 * @param key
	 * @param value
	 */
	public static void put(String cacheName, Object key, Object value) {
		if(isRedis()){
			String pky = getKey(cacheName,key);
			Redis.use(cacheName).setex(pky,invalid_sec, value); 
		}else{
			ECacheKit.put(cacheName, key, value);
		}
	}
	
	public static <T> T get(String cacheName, Object key) {
		if(isRedis()){
			String pky="";
			try {
				pky = getKey(cacheName,key);
				return Redis.use(cacheName).get(pky);
			} catch (Exception e) {
				log.error("cahceName="+cacheName+",key="+key+",pky="+pky+"！异常", e);
				return null;
			}
		}else{
			return ECacheKit.get(cacheName, key);
		}
	}
	
	public static void remove(String cacheName, Object key) {
		if(isRedis()){
			String pky = getKey(cacheName,key);
			Redis.use(cacheName).del(pky);
		}else{
			ECacheKit.remove(cacheName, key);
		}
	}
	
	public static void removeAll(String cacheName) {
		if(isRedis()){
			String pattern = cacheName + "_*";
			Set<String> keys = Redis.use(cacheName).keys(pattern);
			if(keys!=null){
				for(String key:keys){
					Redis.use(cacheName).del(key);
				}
			}
		}else{
			ECacheKit.removeAll(cacheName);
		}
	}
}
