package com.huateng.wxmgr.common.entity;

import java.sql.Timestamp;

public class Material {

	private String media_id;
	private String name;
	private Timestamp update_time;
	private String url;
	public String getMedia_id() {
		return media_id;
	}
	public void setMedia_id(String media_id) {
		this.media_id = media_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Material(String media_id, String name, Timestamp update_time, String url) {
		super();
		this.media_id = media_id;
		this.name = name;
		this.update_time = update_time;
		this.url = url;
	}
	public Material() {
		super();
	}
	@Override
	public String toString() {
		return "Material [media_id=" + media_id + ", name=" + name + ", update_time=" + update_time + ", url=" + url
				+ "]";
	}
	
	
	
}
