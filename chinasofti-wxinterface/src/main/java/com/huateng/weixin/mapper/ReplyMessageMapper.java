package com.huateng.weixin.mapper;

import java.util.List;

import com.huateng.weixin.msg.ReplyMessage;

public interface ReplyMessageMapper {
	List<ReplyMessage>  getMessageByKey(String key_words);
}
