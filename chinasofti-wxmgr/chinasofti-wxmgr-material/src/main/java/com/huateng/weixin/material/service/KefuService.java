package com.huateng.weixin.material.service;


import com.huateng.wxmgr.common.entity.Kefu;

import net.sf.json.JSONObject;

public interface KefuService {

	//添加客服账号
	public void add(Kefu kefu,String accessToken);
	//设置客服
	public void update(Kefu kefu,String accessToken);
	//删除客服账号
	public void delete(String kf_account,String accessToken);
	//获取客服信息
	public JSONObject get(String accessToken);
	//发送文本消息
	public void sendText(String touser,String content,String accessToken);
	//发送图片
	public void sendImage(String touser,String media_id,String accessToken);
}
