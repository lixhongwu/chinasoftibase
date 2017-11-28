package com.huateng.weixin.message.mapper;

import java.util.List;

import com.huateng.weixin.message.model.ReplyMessage;

public interface ReplyMessageMapper {
	List<ReplyMessage> getMessageList();
	void insert(ReplyMessage replyMessage);
	void delete(String message_id);
	void edit(ReplyMessage replyMessage);
}
