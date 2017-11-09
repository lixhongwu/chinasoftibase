package com.huateng.weixin.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import net.sf.json.JSONObject;

/**
 * 全局定时器
 * 
 * @author qiqj
 *
 */
@Component
public class Scheduler {

	private final Logger logger = Logger.getRootLogger();

	@Resource
	private RedisTokenHelper redisTokenHelper;// redis帮助类定义redis的端口ip等信息

	public static String APPID = "wx46a11776c72d6875";

	public static String APPSERCERT = "e01f1123edbdfad66a8a28a94c634c89";

	/**
	 * 定时获取access_token
	 * 
	 * @throws SQLException
	 */
	@Scheduled(fixedDelay = 7180000)
	public void getAccessToken() throws SQLException {
		logger.info("==============开始获取access_token===============");
		String access_token = null;
		String grant_type = "client_credential";
		String AppId = APPID;
		String secret = APPSERCERT;
		// 拼接urlhttps请求方式: GET
		// https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=" + grant_type + "&appid=" + AppId + "&secret="
				+ secret;

		try {
			URL urlGet = new URL(url);
			HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
			http.setRequestMethod("GET"); // 必须是get方式请求
			http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			http.setDoOutput(true);
			http.setDoInput(true);
			http.connect();
			InputStream is = http.getInputStream();
			int size = is.available();
			byte[] jsonBytes = new byte[size];
			is.read(jsonBytes);
			String message = new String(jsonBytes, "UTF-8");
			JSONObject demoJson = JSONObject.fromObject(message);
			// System.out.println("JSON字符串："+demoJson);
			access_token = demoJson.getString("access_token");
			is.close();
			logger.info("==============结束获取access_token===============");
		} catch (Exception e) {
			e.printStackTrace();
		}
		logger.info("==============开始写入access_token===============");
		redisTokenHelper.set("global_token", access_token);
		logger.info("==============写入access_token成功===============");
	}

	public static void main(String[] args) throws IOException {

		String access_token = null;
		String grant_type = "client_credential";
		String AppId = APPID;
		String secret = APPSERCERT;
		// 拼接urlhttps请求方式: GET
		// https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET
		String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=" + grant_type + "&appid=" + AppId + "&secret="
				+ secret;

		URL urlGet = new URL(url);
		HttpURLConnection http = (HttpURLConnection) urlGet.openConnection();
		http.setRequestMethod("GET"); // 必须是get方式请求
		http.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		http.setDoOutput(true);
		http.setDoInput(true);
		http.connect();
		InputStream is = http.getInputStream();
		int size = is.available();
		byte[] jsonBytes = new byte[size];
		is.read(jsonBytes);
		String message = new String(jsonBytes, "UTF-8");
		JSONObject demoJson = JSONObject.fromObject(message);
		// System.out.println("JSON字符串："+demoJson);
		access_token = demoJson.getString("access_token");
		System.out.println(access_token);
		is.close();
	}
}