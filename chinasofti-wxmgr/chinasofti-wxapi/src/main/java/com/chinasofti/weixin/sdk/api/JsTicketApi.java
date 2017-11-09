/**
 * Copyright (c) 2011-2014, lianghuan  @author 王侣为(newey@vip.qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package com.chinasofti.weixin.sdk.api;

import java.util.Map;

import com.chinasofti.weixin.sdk.kit.ParaMap;
import com.jfinal.kit.HttpKit;

/**
 * 认证并获取 页面卡券api_ticket API
 */
public class JsTicketApi {

    // private static String url =
    // "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";

    private static String url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket";
    private static JsTicket jsTicket;

    public static JsTicket getJsTicket() {
        WxAccessToken wxaccessToken = WxAccessTokenService.service.getWxJsTicket(ApiConfigKit.getApiConfig().getAppId());
        jsTicket = new JsTicket();
        if (wxaccessToken != null) {
        	jsTicket = new JsTicket(wxaccessToken.getStr("apiticket"), wxaccessToken.getBigDecimal("ticketexpiredtime")==null?0:wxaccessToken.getBigDecimal("ticketexpiredtime").intValue());
            if (jsTicket.isAvailable()) {
                return jsTicket;
            }
        }

        refreshJsTicket();
        return jsTicket;
    }

    public static void refreshJsTicket() {
    	jsTicket = requestJsTicket();
    }

    private static JsTicket requestJsTicket() {
    	JsTicket result = null;
        String accessToken = AccessTokenApi.getAccessToken().getAccessToken();
        for (int i = 0; i < 3; i++) {
            Map<String, String> queryParas = ParaMap.create("type", "wx_card").put("access_token", accessToken).getData();
            String json = HttpKit.get(url, queryParas);
            result = new JsTicket(json);

            if (result.isAvailable())
                break;
        }
        return result;
    }
}
