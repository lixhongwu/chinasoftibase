package com.huateng.wxmgr.common.entity;

/**
 * 客服回复消息
 */
public class ResKefu extends Kefu{
    private String  touser ;//普通用户openid
    private String   msgtype;//	消息类型，文本为text，图片为image，语音为voice，视频消息为video，音乐消息为music，图文消息（点击跳转到外链）为news，图文消息（点击跳转到图文消息页面）为mpnews，卡券为wxcard
    private String   content	;//文本消息内容
    private String   media_id;//发送的图片/语音/视频/图文消息（点击跳转到图文消息页）的媒体ID
}
