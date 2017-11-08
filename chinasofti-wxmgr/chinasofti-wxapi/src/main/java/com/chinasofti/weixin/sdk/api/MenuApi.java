/**
 * Copyright (c) 2011-2014, lianghuan  梁欢(lianghuan1314@163.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

package com.chinasofti.weixin.sdk.api;


/**
 * menu api
 */
public class MenuApi {

    private static String getMenu = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=";
    private static String createMenu = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=";

    /**
     * 查询菜单
     * 
     * @return {"menu":{"button":[{"type":"click","name":"今日歌曲","key":
     *         "V1001_TODAY_MUSIC"
     *         ,"sub_button":[]},{"type":"click","name":"歌手简介"
     *         ,"key":"V1001_TODAY_SINGER"
     *         ,"sub_button":[]},{"name":"菜单","sub_button"
     *         :[{"type":"view","name"
     *         :"搜索","url":"http://www.soso.com/","sub_button"
     *         :[]},{"type":"view"
     *         ,"name":"视频","url":"http://v.qq.com/","sub_button"
     *         :[]},{"type":"click"
     *         ,"name":"赞一下我们","key":"V1001_GOOD","sub_button":[]}]}]}}
     */
    public static ApiResult getMenu() {
        String jsonResult = HttpKit.get(getMenu + AccessTokenApi.getAccessToken().getAccessToken());
        return new ApiResult(jsonResult);
    }

    /**
     * 创建菜单
     * 
     * @param jsonStr
     *            { "button":[ { "type":"click", "name":"今日歌曲",
     *            "key":"V1001_TODAY_MUSIC" , { "name":"菜单", "sub_button":[ {
     *            "type":"view", "name":"搜索", "url":"http://www.soso.com/" , {
     *            "type":"view", "name":"视频", "url":"http://v.qq.com/" , {
     *            "type":"click", "name":"赞一下我们", "key":"V1001_GOOD" ] ]
     * @return
     */
    public static ApiResult createMenu(String jsonStr) {
        String jsonResult = HttpKit.post(createMenu + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
        return new ApiResult(jsonResult);
    }
}
