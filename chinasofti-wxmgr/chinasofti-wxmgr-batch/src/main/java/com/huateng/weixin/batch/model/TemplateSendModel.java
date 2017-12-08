package com.huateng.weixin.batch.model;

import java.sql.Timestamp;

public class TemplateSendModel {
private int id;
private String template_id;
private String touser;
private String url;
private String send_body;
private Timestamp create_time;
public int getId() {
	return id;
}
public void setId(int id) {
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
public Timestamp getCreate_time() {
	return create_time;
}
public void setCreate_time(Timestamp create_time) {
	this.create_time = create_time;
}

}
