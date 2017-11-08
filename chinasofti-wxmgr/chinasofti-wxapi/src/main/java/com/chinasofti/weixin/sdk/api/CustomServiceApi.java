/**
 * Copyright (c) 2011-2015, Unas 小强哥 (unas@qq.com).
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package com.jfinal.weixin.sdk.api;

import java.util.HashMap;
import java.util.Map;

import com.jfinal.kit.HttpKit;
import com.jfinal.kit.JsonKit;
import com.jfinal.weixin.sdk.kit.ParaMap;
import com.jfinal.weixin.sdk.msg.out.OutTextMsg;

/**
 * 多客服功能</br>
 * 仅支持获取客服聊天记录接口，其他功能可以使用微信官方的多客服客户端软件来完成。
 */
public class CustomServiceApi
{
    private static String getRecordUrl = "https://api.weixin.qq.com/customservice/msgrecord/getrecord?access_token=";
    private static String sendMsgUrl = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=";
    /**
     * 获取客服聊天记录
     */
    public static ApiResult getRecord(String jsonStr)
    {
        String jsonResult = HttpKit.post(getRecordUrl + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
        return new ApiResult(jsonResult);
    }
    
    /**
     * 客服接口发送消息
     * @param jsonStr
     * @return
     */
    public static ApiResult sendMsg(String jsonStr){
        String jsonResult = HttpKit.post(sendMsgUrl+AccessTokenApi.getAccessToken().getAccessToken(),jsonStr);
        return new ApiResult(jsonResult);
    }
}
