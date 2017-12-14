package com.huateng.weixin.material.mapper;

import java.util.List;

import com.huateng.wxmgr.common.entity.TemplateMessageContent;
import com.huateng.wxmgr.common.entity.TemplateMessageModel;
import com.huateng.wxmgr.common.entity.TemplateSendModel;
import com.huateng.wxmgr.common.entity.UserModel;


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
