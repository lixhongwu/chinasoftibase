/**
 * Copyright (c) 2011-2014, lianghuan  @author 王侣为(newey@vip.qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package com.chinasofti.weixin.sdk.api;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jfinal.kit.StrKit;

/**
 * @author wanglvwei 封装 access_token
 */
public class JsTicket {

    private String ticket; // 正确获取到 ticket 时有值
    private Integer expires_in; // 正确获取到 ticket 时有值
    private Integer errcode; // 出错时有值
    private String errmsg; // 出错时有值

    private Integer expiredTime; // 正确获取到 access_token 时有值，存放过期时间
    private String json;

    public JsTicket(String jsonStr) {
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
            wxAccessToken.set("apiticket", ticket);
            wxAccessToken.set("ticketexpiredtime", expiredTime);

            WxAccessTokenService.service.saveOrUpdateJsTicket(wxAccessToken);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public JsTicket(String jsticket, Integer expiredtime) {
        ticket = jsticket;
        expiredTime = expiredtime;
    }

    public JsTicket() {
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

    public String getJsTicket() {
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
