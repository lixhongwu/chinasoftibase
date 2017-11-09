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
 * 认证并获取 页面jstiket API
 */
public class JsTokenApi {

    // private static String url =
    // "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";

    private static String url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket";
    private static JsToken jsToken;

    public static JsToken getJsToken() {
        WxAccessToken wxaccessToken = WxAccessTokenService.service.getWxJsToken(ApiConfigKit.getApiConfig().getAppId());
        jsToken = new JsToken();
        if (wxaccessToken != null) {
            jsToken = new JsToken(wxaccessToken.getStr("jstoken"), wxaccessToken.getBigDecimal("jsexpiredtime")==null?0:wxaccessToken.getBigDecimal("jsexpiredtime").intValue());
            if (jsToken.isAvailable()) {
                return jsToken;
            }
        }

        refreshJsToken();
        return jsToken;
    }

    public static void refreshJsToken() {
        jsToken = requestJsToken();
    }

    private static JsToken requestJsToken() {
        JsToken result = null;
        String accessToken = AccessTokenApi.getAccessToken().getAccessToken();
        for (int i = 0; i < 3; i++) {
            Map<String, String> queryParas = ParaMap.create("type", "jsapi").put("access_token", accessToken).getData();
            String json = HttpKit.get(url, queryParas);
            result = new JsToken(json);

            if (result.isAvailable())
                break;
        }
        return result;
    }
}
