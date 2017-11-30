package com.huateng.weixin.message.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.huateng.weixin.message.model.TemplateMessageContent;
import com.huateng.weixin.message.model.TemplateMessageModel;
import com.huateng.weixin.message.model.TemplateSendModel;
import com.huateng.weixin.message.model.UserModel;

public interface TemplateMessageSevice {
	void refresh(String accessToken);
	
	List<TemplateMessageModel> getTemplateMessageList();
	
	List<TemplateMessageContent> getTemplateMessageContent(String template_id);
	
	void addTemplateFromWx(List list);
	void deleteTemplate();//删除模板
	void addContentFromWx(List list);
	void deleteContent();//删除内容
	void addTemplateFromSend(TemplateSendModel templateSendModel);
	
	List<UserModel> userList();
}
