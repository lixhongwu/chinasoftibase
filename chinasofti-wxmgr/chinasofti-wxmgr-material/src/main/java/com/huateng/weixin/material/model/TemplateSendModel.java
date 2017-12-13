package com.huateng.weixin.material.model;

public class TemplateSendModel {
private Integer id;
private String template_id;
private String touser;
private String url;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTemplate_id() {
	return template_id;
}
public void setTemplate_id(String template_id) {
	this.template_id = template_id;
}
public String getTouser() {
	return touser;
}
public void setTouser(String touser) {
	this.touser = touser;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getSend_body() {
	return send_body;
}
public void setSend_body(String send_body) {
	this.send_body = send_body;
}
private String send_body;
}
