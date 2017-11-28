package com.huateng.weixin.message.model;

public class TemplateMessageContent extends TimeModel{
private String detail_id;
private String templateID;
private String templateContent;
public String getDetail_id() {
	return detail_id;
}
public void setDetail_id(String detail_id) {
	this.detail_id = detail_id;
}
public String getTemplateID() {
	return templateID;
}
public void setTemplateID(String templateID) {
	this.templateID = templateID;
}
public String getTemplateContent() {
	return templateContent;
}
public void setTemplateContent(String templateContent) {
	this.templateContent = templateContent;
}
}
