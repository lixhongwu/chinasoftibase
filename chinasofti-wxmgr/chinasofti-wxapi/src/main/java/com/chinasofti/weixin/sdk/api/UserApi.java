/**
 * Copyright (c) 2011-2014, lianghuan  梁欢(lianghuan1314@163.com).
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package com.jfinal.weixin.sdk.api;

import com.jfinal.kit.HttpKit;
import com.jfinal.weixin.sdk.kit.ParaMap;

/**
 * 用户管理 API
 * https://api.weixin.qq.com/cgi-bin/user/info?access_token=ACCESS_TOKEN
 * &openid=OPENID&lang=zh_CN
 */
public class UserApi {

    private static final String getUserInfo = "https://api.weixin.qq.com/cgi-bin/user/info";
    private static final String getFollowers = "https://api.weixin.qq.com/cgi-bin/user/get";
    private static final String batchGetUserInfo = "https://api.weixin.qq.com/cgi-bin/user/info/batchget?access_token=";
    /**
     * 获取用户基本信息
     * 
     * @param openId
     * 
     * @return { "subscribe": 1, "openid": "o6_bmjrPTlm6_2sgVt7hMZOPfL2M",
     *         "nickname": "Band", "sex": 1, "language": "zh_CN", "city": "广州",
     *         "province": "广东", "country": "中国", "headimgurl":
     *         "http://wx.qlogo.cn/mmopen/g3MonUZtNHkdmzicIlibx6iaFqAc56vxLSUfpb6n5WKSYVY0ChQKkiaJSgQ1dZuTOgvLLrhJbERQQ4eMsv84eavHiaiceqxibJxCfHe/0"
     *         , "subscribe_time": 1382694957, "unionid":
     *         " o6_bmasdasdsad6_2sgVt7hMZOPfL" "remark": "", "groupid": 0 }
     */
    public static ApiResult getUserInfo(String openId) {
        ParaMap pm = ParaMap.create("access_token", AccessTokenApi.getAccessToken().getAccessToken()).put("openid", openId).put("lang", "zh_CN");
        return new ApiResult(HttpKit.get(getUserInfo, pm.getData()));
    }

    /**
     * 获取所有关注者
     * 
     * @param nextOpenid
     * @return { "total":23000, "count":10000, "data":{" openid":[ "OPENID1",
     *         "OPENID2", ..., "OPENID10000" ] }, "next_openid":"OPENID10000" }
     */
    public static ApiResult getFollowers(String nextOpenid) {
        ParaMap pm = ParaMap.create("access_token", AccessTokenApi.getAccessToken().getAccessToken());
        if (nextOpenid != null)
            pm.put("next_openid", nextOpenid);
        return new ApiResult(HttpKit.get(getFollowers, pm.getData()));
    }

    public static ApiResult getFollows() {
        return getFollowers(null);
    }

    /**
     * 批量获取用户基本信息
     * 
     * @param jsonStr
     *            { "user_list": [ { "openid": "otvxTs4dckWG7imySrJd6jSi0CWE",
     *            "lang": "zh_CN" , { "openid": "otvxTs_JZ6SEiP0imdhpi50fuSZg",
     *            "lang": "zh_CN" ] }
     * @return { "user_info_list": [ { "subscribe": 1, "openid":
     *         "otvxTs4dckWG7imySrJd6jSi0CWE", "nickname": "iWithery", "sex": 1,
     *         "language": "zh_CN", "city": "Jieyang", "province": "Guangdong",
     *         "country": "China", "headimgurl":
     *         "http://wx.qlogo.cn/mmopen/xbIQx1GRqdvyqkMMhEaGOX802l1CyqMJNgUzKP8MeAeHFicRDSnZH7FY4XB7p8XHXIf6uJA2SCunTPicGKezDC4saKISzRj3nz/0"
     *         , "subscribe_time": 1434093047, "unionid":
     *         "oR5GjjgEhCMJFyzaVZdrxZ2zRRF4", "remark": "", "groupid": 0 }, {
     *         "subscribe": 0, "openid": "otvxTs_JZ6SEiP0imdhpi50fuSZg",
     *         "unionid": "oR5GjjjrbqBZbrnPwwmSxFukE41U", } ] }
     */

    public static ApiResult batchGetUserInfo(String jsonStr) {
        String jsonResult = HttpKit.post(batchGetUserInfo + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
        return new ApiResult(jsonResult);
    }

}
