package com.huateng.weixin.material.service;

import java.util.List;

import com.huateng.wxmgr.common.entity.TemplateMessageContent;
import com.huateng.wxmgr.common.entity.TemplateMessageModel;
import com.huateng.wxmgr.common.entity.TemplateSendModel;
import com.huateng.wxmgr.common.entity.UserModel;

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
