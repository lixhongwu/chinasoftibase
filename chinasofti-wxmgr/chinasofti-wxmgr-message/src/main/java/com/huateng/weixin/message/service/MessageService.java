package com.huateng.weixin.message.service;

import java.util.List;

import com.huateng.weixin.message.model.ReplyMessage;

public interface MessageService {

	public List<ReplyMessage> getMessageList();
	
	public String add(ReplyMessage replyMessage);
	
	public void delete(String message_id);
	
	public void edit(ReplyMessage replyMessage);
}
