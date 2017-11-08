/**
 * Copyright (c) 2011-2014, lianghuan  @author 王侣为(newey@vip.qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package com.jfinal.weixin.sdk.api;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jfinal.kit.StrKit;
import com.huateng.weixin.model.WxAccessToken;
import com.huateng.weixin.service.WxAccessTokenService;

/**
 * @author wanglvwei 封装 access_token
 */
public class JsToken {

    private String ticket; // 正确获取到 ticket 时有值
    private Integer expires_in; // 正确获取到 ticket 时有值
    private Integer errcode; // 出错时有值
    private String errmsg; // 出错时有值

    private Integer expiredTime; // 正确获取到 access_token 时有值，存放过期时间
    private String json;

    public JsToken(String jsonStr) {
        this.json = jsonStr;

        try {
            @SuppressWarnings("rawtypes")
            Map map = new ObjectMapper().readValue(jsonStr, Map.class);
            ticket = (String) map.get("ticket");
            expires_in = (Integer) map.get("expires_in");
            errcode = (Integer) map.get("errcode");
            errmsg = (String) map.get("errmsg");

            if (expires_in != null)
                expiredTime = Integer.valueOf((System.currentTimeMillis() / 1000) + "") + expires_in - 200;

            WxAccessToken wxAccessToken = new WxAccessToken();
            wxAccessToken.set("appid", ApiConfigKit.getApiConfig().getAppId());
            wxAccessToken.set("jstoken", ticket);
            wxAccessToken.set("jsexpiredtime", expiredTime);

            WxAccessTokenService.service.saveOrUpdateJsToken(wxAccessToken);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public JsToken(String jsticket, Integer expiredtime) {
        ticket = jsticket;
        expiredTime = expiredtime;
    }

    public JsToken() {
    }

    public String getJson() {
        return json;
    }

    public boolean isAvailable() {
        if (expiredTime == null)
            return false;
        if (!StrKit.isBlank(errmsg))
            return false;
        if (expiredTime < System.currentTimeMillis() / 1000)
            return false;
        return !StrKit.isBlank(ticket);
    }

    public String getJsToken() {
        return ticket;
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

    public void setJsToken(String jstoken) {
        this.ticket = jstoken;
    }

    public Integer getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Integer expiredTime) {
        this.expiredTime = expiredTime;
    }
}
