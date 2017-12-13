package com.huateng.weixin.material.service;

import java.util.List;

import com.huateng.weixin.material.model.ReplyMessage;

public interface MessageService {

	public List<ReplyMessage> getMessageList();
	
	public String add(ReplyMessage replyMessage);
	
	public void delete(String message_id);
	
	public void edit(ReplyMessage replyMessage);
	
	public List searchByKey(String keyText);
}
