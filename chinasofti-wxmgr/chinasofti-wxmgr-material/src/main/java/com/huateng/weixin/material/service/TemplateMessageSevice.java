package com.huateng.weixin.material.service;

import java.util.List;

import com.huateng.weixin.material.model.TemplateMessageContent;
import com.huateng.weixin.material.model.TemplateMessageModel;
import com.huateng.weixin.material.model.TemplateSendModel;
import com.huateng.weixin.material.model.UserModel;

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
	List searchByTitle(String titleText);
}
