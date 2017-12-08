package com.huateng.weixin.batch.model;

import java.sql.Timestamp;

public class TemplateMessageModel {
	private String template_id;
	private String title;
	private String primary_industry;
	private String deputy_industry;
	private String content;
	private Timestamp create_time;
	private Timestamp update_time;
	public String getTemplate_id() {
		return template_id;
	}
	public void setTemplate_id(String template_id) {
		this.template_id = template_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrimary_industry() {
		return primary_industry;
	}
	public void setPrimary_industry(String primary_industry) {
		this.primary_industry = primary_industry;
	}
	public String getDeputy_industry() {
		return deputy_industry;
	}
	public void setDeputy_industry(String deputy_industry) {
		this.deputy_industry = deputy_industry;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public Timestamp getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	
}
