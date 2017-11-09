
package com.chinasofti.weixin.sdk.api;

import java.util.Map;

import com.chinasofti.weixin.sdk.kit.StrKit;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 封装 access_token
 */
public class AccessToken {
	
	private String access_token;	// 正确获取到 access_token 时有值
	private Integer expires_in;		// 正确获取到 access_token 时有值
	private Integer errcode;		// 出错时有值
	private String errmsg;			// 出错时有值
	
	private Integer expiredTime;		// 正确获取到 access_token 时有值，存放过期时间
	private String json;
	
	public AccessToken(String jsonStr) {
		this.json = jsonStr;
		
		try {
			@SuppressWarnings("rawtypes")
			Map map = new ObjectMapper().readValue(jsonStr, Map.class);
			access_token = (String)map.get("access_token");
			expires_in = (Integer)map.get("expires_in");
			errcode = (Integer)map.get("errcode");
			errmsg = (String)map.get("errmsg");
			
			if (expires_in != null)
				expiredTime = Integer.valueOf((System.currentTimeMillis()/1000)+"") +expires_in-200;
			
			WxAccessToken wxAccessToken = new WxAccessToken();
			wxAccessToken.set("appid", ApiConfigKit.getApiConfig().getAppId());
			wxAccessToken.set("accesstoken", access_token);
			wxAccessToken.set("expiredtime", expiredTime);
			
			WxAccessTokenService.service.saveOrUpdateAccessToken(wxAccessToken);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public AccessToken(String accessstoken, Integer expiredtime) {
		access_token = accessstoken;
		expiredTime = expiredtime;
	}

	public AccessToken() {
	}

	public String getJson() {
		return json;
	}
	
	public boolean isAvailable() {
		if (expiredTime == null)
			return false;
		if (!StrKit.isBlank(errmsg))
			return false;
		if (expiredTime < System.currentTimeMillis()/1000)
			return false;
		return !StrKit.isBlank(access_token);
	}
	
	public String getAccessToken() {
		return access_token;
	}
	
	public Integer getExpiresIn() {
		return expires_in;
	}
	
	public Integer getErrorCode() {
		return errcode;
	}
	
	public String getErrorMsg() {
		if (errcode != null) {
			String result = ReturnCode.get(errcode);
			if (result != null)
				return result;
		}
		return errmsg;
	}

 
	public void setAccesstoken(String access_token) {
		this.access_token = access_token;
	}

	public Integer getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(Integer expiredTime) {
		this.expiredTime = expiredTime;
	}
}
