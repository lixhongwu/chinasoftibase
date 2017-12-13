package com.huateng.weixin.material.mapper;

import java.util.List;

import com.huateng.weixin.material.model.ReplyMessage;


public interface ReplyMessageMapper {
	List<ReplyMessage> getMessageList();
	void insert(ReplyMessage replyMessage);
	void delete(String message_id);
	void edit(ReplyMessage replyMessage);
	List searchByKey(String keyText);
}
