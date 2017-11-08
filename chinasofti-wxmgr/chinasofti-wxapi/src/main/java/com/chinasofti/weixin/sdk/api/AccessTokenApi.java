/**
 * Copyright (c) 2011-2014, lianghuan  梁欢(lianghuan1314@163.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package com.jfinal.weixin.sdk.api;

import java.io.IOException;
import java.util.Map;

import org.apache.logging.log4j.LogManager;import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.jfinal.kit.HttpKit;
import com.jfinal.weixin.sdk.kit.ParaMap;
import com.huateng.weixin.model.WxAccessToken;
import com.huateng.weixin.service.WxAccessTokenService;

/**
 * 认证并获取 access_token API
 * http://mp.weixin.qq.com/wiki/index.php?title=%E8%8E%B7%E5%8F%96access_token
 */
public class AccessTokenApi {
	private static Logger logger = LogManager.getLogger(AccessTokenApi.class);
	// "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
	private static String url = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential";
	private static AccessToken accessToken;
	
	public static AccessToken getAccessToken() {
		WxAccessToken wxaccessToken = WxAccessTokenService.service.getWxAccessToken(ApiConfigKit.getApiConfig().getAppId());
		accessToken = new AccessToken();
		if (wxaccessToken != null){
			accessToken = new AccessToken(wxaccessToken.getStr("accesstoken"),wxaccessToken.getBigDecimal("expiredtime")==null?0:wxaccessToken.getBigDecimal("expiredtime").intValue());
			if (accessToken.isAvailable()) {
				return accessToken;
			}
		}
		
		refreshAccessToken();
		return accessToken;
	}
	
	public static void refreshAccessToken() {
		accessToken = requestAccessToken();
	}
	
	private static AccessToken requestAccessToken() {
		AccessToken result = null;
		ApiConfig ac = ApiConfigKit.getApiConfig();
		for (int i=0; i<3; i++) {
			String appId = ac.getAppId();
			String appSecret = ac.getAppSecret();
			Map<String, String> queryParas = ParaMap.create("appid", appId).put("secret", appSecret).getData();
			try {
				String json = HttpKit.get(url, queryParas);
				result = new AccessToken(json);
				if (result.isAvailable()){
					break;
				}
			} catch (Exception e) {
				logger.error("获取AccessToken出错:"+i+e.getMessage(),e);
			}
		}
		return result;
	}
	
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ApiConfig ac = new ApiConfig();
		ac.setAppId("wx9803d1188fa5fbda");
		ac.setAppSecret("db859c968763c582794e7c3d003c3d87");
		ApiConfigKit.setThreadLocalApiConfig(ac);
		
		AccessToken at = getAccessToken();
		if (at.isAvailable())
			System.out.println("access_token : " + at.getAccessToken());
		else
			System.out.println(at.getErrorCode() + " : " + at.getErrorMsg());
	}
}
