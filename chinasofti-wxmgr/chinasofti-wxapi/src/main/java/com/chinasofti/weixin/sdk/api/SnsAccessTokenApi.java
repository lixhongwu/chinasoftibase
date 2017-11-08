/**
 * Copyright (c) 2011-2015, Unas 小强哥 (unas@qq.com).
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package com.jfinal.weixin.sdk.api;

import com.jfinal.kit.HttpKit;
import com.jfinal.weixin.sdk.kit.ParaMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 网页授权获取 access_token API
 */
public class SnsAccessTokenApi {
	private static Logger logger = LogManager.getLogger(SnsAccessTokenApi.class);
	// https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code
	private static String url = "https://api.weixin.qq.com/sns/oauth2/access_token?grant_type=authorization_code";

	// 利用 appId 与 accessToken 建立关联，支持多账户
	private static Map<String, SnsAccessToken> map = new ConcurrentHashMap<String, SnsAccessToken>(); // private
																										// static
																										// AccessToken
																										// accessToken;

	/**
	 * 从缓存中获取 access token，如果未取到或者 access token 不可用则先更新再获取
	 */
	public static SnsAccessToken getAccessToken(String code) {
		String appId = ApiConfigKit.getApiConfig().getAppId();
		SnsAccessToken result = map.get(appId);
		if (result != null && result.isAvailable())
			return result;

		refreshAccessToken(code);
		return map.get(appId);
	}

	/**
	 * 强制更新 access token 值
	 */
	public static synchronized void refreshAccessToken(String code) {
		ApiConfig ac = ApiConfigKit.getApiConfig();
		SnsAccessToken result = null;
		for (int i = 0; i < 3; i++) { // 最多三次请求
			String appId = ac.getAppId();
			String appSecret = ac.getAppSecret();
			Map<String, String> queryParas = ParaMap.create("appid", appId).put("secret", appSecret).put("code", code)
					.getData();
			try {
				String json = HttpKit.get(url, queryParas);
				result = new SnsAccessToken(json);
				if (result.isAvailable()) {
					break;
				}
			} catch (Exception e) {
				logger.error("获取用户信息出错:" + i + e.getMessage(), e);
			}
		}

		// 三次请求如果仍然返回了不可用的 access token 仍然 put 进去，便于上层通过 AccessToken 中的属性判断底层的情况
		map.put(ac.getAppId(), result);
	}

	/**
	 * @date 2016年1月8日
	 * @auther 王侣为
	 * @param code
	 * @return
	 */
	public static ApiResult getSnsUserInfo(String code) {
		SnsAccessToken snsToken = null;
		ApiConfig ac = ApiConfigKit.getApiConfig();

		String appId = ac.getAppId();
		String appSecret = ac.getAppSecret();
		Map<String, String> queryParas = ParaMap.create("appid", appId).put("secret", appSecret).put("code", code)
				.getData();
		ApiResult result = null;
		try {
			String json = HttpKit.get("https://api.weixin.qq.com/sns/oauth2/access_token?grant_type=authorization_code",
					queryParas);
			snsToken = new SnsAccessToken(json);
			if (!snsToken.isAvailable()) {
				logger.warn("重复获取snsToken信息 json=" + json);
			} else {
				for (int i = 0; i < 3; i++) {
					try {
						String getUserInfo = "https://api.weixin.qq.com/sns/userinfo";
						ParaMap pm = ParaMap.create("access_token", snsToken.getAccessToken())
								.put("openid", snsToken.getOpenid()).put("lang", "zh_CN");
						result = new ApiResult(HttpKit.get(getUserInfo, pm.getData()));
						if (result != null) {
							break;
						}
					} catch (Exception e) {
						logger.error("获取UserInfo出错:" + i + e.getMessage(), e);
					}
				}
			}
		} catch (Exception e) {
			logger.error("获取snsToken信息出错:" + e.getMessage(), e);
		}

		return result;
	}
}
