package com.huateng.weixin.message.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huateng.weixin.message.mapper.TemplateMessageMapper;
import com.huateng.weixin.message.model.TemplateMessageContent;
import com.huateng.weixin.message.model.TemplateMessageModel;
import com.huateng.weixin.message.model.TemplateSendModel;
import com.huateng.weixin.message.model.UserModel;
import com.huateng.weixin.message.service.AccessTokenService;
import com.huateng.weixin.message.service.GetTemplateFromWxService;
import com.huateng.weixin.message.service.TemplateMessageSevice;
/**
 * 操作数据库
 * @author Memoa
 *
 */
@Service
public class TemplateMessageServiceImpl implements TemplateMessageSevice{
	@Autowired
	TemplateMessageMapper tmm;
	@Autowired
	GetTemplateFromWxService gtfs;
	@Override
	public List getTemplateMessageList() {
		List<TemplateMessageModel> list = null;
		try{
			 list = tmm.getTemplateMessageList();
		}catch(Exception e){
			
		}
		return list;
	}
	@Override
	public List<TemplateMessageContent> getTemplateMessageContent(
			String template_id) {
		// TODO Auto-generated method stub
		List<TemplateMessageContent> list = null;
		try{
			 list = tmm.getTemplateMessageContent(template_id);
		}catch(Exception e){
			
		}
		return list;
	}
	@Override
	public void addTemplateFromWx(List list) {
		try{
			tmm.addTemplateFromWx(list);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Override
	public void addContentFromWx(List list) {
		tmm.addContentFromWx(list);
	}
	@Override
	public void addTemplateFromSend(TemplateSendModel templateSendModel) {
		// TODO Auto-generated method stub
		tmm.addTemplateFromSend(templateSendModel);
	}
	
	/**
	 * 同步数据库
	 */
	@Override
	public void refresh(String accessToken) {
		// TODO Auto-generated method stub
		
		//从微信获取模板消息
		gtfs.getTemplateFromWX(accessToken);
	}
	/**
	 * 删除本地模板
	 */
	@Override
	public void deleteTemplate() {
		// TODO Auto-generated method stub
		tmm.deleteTemplate();
	}
	/**
	 * 删除本地模板详情内容
	 */
	@Override
	public void deleteContent() {
		// TODO Auto-generated method stub
		tmm.deleteContent();
	}
	@Override
	public List<UserModel> userList() {
		// TODO Auto-generated method stub
		return tmm.userList();
	}
	@Override
	public List searchByTitle(String titleText) {
		// TODO Auto-generated method stub
		return tmm.searchByTitle(titleText);
	}

}
