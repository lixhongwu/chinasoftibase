package com.huateng.weixin.material.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huateng.weixin.material.mapper.ReplyMessageMapper;
import com.huateng.weixin.material.model.ReplyMessage;
import com.huateng.weixin.material.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	@Autowired
	private ReplyMessageMapper replyMessageMapper;
	@Override
	public List<ReplyMessage> getMessageList() {
		List<ReplyMessage> list = replyMessageMapper.getMessageList();
		return list;
	}
	@Override
	public String add(ReplyMessage replyMessage) {
		String result = "";
		try{
			 replyMessageMapper.insert(replyMessage);
			 result ="ok";
		}catch(Exception e){
			result ="0001";
		}
		return result;
		
	}
	@Override
	public void delete(String message_id) {
		replyMessageMapper.delete(message_id);
	}
	
	@Override
	public void edit(ReplyMessage replyMessage) {
		replyMessageMapper.edit(replyMessage);
	}
	@Override
	public List searchByKey(String keyText) {
		// TODO Auto-generated method stub
		return replyMessageMapper.searchByKey(keyText);
	}
	

}
