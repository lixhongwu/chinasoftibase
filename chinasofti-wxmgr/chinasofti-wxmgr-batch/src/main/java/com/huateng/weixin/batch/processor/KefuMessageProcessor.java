package com.huateng.weixin.batch.processor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huateng.weixin.batch.interfaces.KefuMessageSend;
import com.huateng.weixin.batch.model.MessageContent;

@Component("kefuMessageProcessor")
public class KefuMessageProcessor implements ItemProcessor<MessageContent, MessageContent>{

	@Autowired
	private KefuMessageSend kefuMessageSend;
	@Override
	public MessageContent process(MessageContent item) throws Exception {
		String touser = item.getTouser();
		String content = item.getContent();
		String body = "{\"touser\":\""+touser+"\",\"msgtype\":\"text\",\"text\":{\"content\":\""+content+"\"}}";
		kefuMessageSend.sendMessage(body);
		return null;
	}

}
