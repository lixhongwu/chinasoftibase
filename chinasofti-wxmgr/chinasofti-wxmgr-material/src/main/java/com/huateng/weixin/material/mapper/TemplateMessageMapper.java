package com.huateng.weixin.material.mapper;

import java.util.List;

import com.huateng.weixin.material.model.TemplateMessageContent;
import com.huateng.weixin.material.model.TemplateMessageModel;
import com.huateng.weixin.material.model.TemplateSendModel;
import com.huateng.weixin.material.model.UserModel;


public interface TemplateMessageMapper {
	
	List<TemplateMessageModel> getTemplateMessageList();
	
	List<TemplateMessageContent> getTemplateMessageContent(String template_id);
	
	void addTemplateFromWx(List list);
	void deleteTemplate();
	void addContentFromWx(List list);
	void deleteContent();
	
	void addTemplateFromSend(TemplateSendModel templateSendModel);
	List<UserModel> userList();
	
	List searchByTitle(String titleText);
}
