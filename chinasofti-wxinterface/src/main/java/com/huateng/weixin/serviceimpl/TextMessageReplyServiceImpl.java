package com.huateng.weixin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huateng.weixin.mapper.ReplyMessageMapper;
import com.huateng.weixin.msg.ReplyMessage;
import com.huateng.weixin.service.TextMessgaeReplyService;

@Service
public class TextMessageReplyServiceImpl implements TextMessgaeReplyService{

	@Autowired
	private ReplyMessageMapper rem;
	@Override
	public String textMessgageReply(String key_words) {
		String content = "";
		try{
			List<ReplyMessage> list  = rem.getMessageByKey(key_words);
			for(ReplyMessage re : list){
				content = re.getContent();
			}
		}catch(Exception e){
			
		}
		return content;
	}

}
