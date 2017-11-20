package com.huateng.wxmgr.common.entity;

import java.util.List;

public class SynMenu {
	
	private String name;
	
	private String type;
	
	private String url;
	
	private String key;
	
	private List<SynMenu> sub_button;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public List<SynMenu> getSub_button() {
		return sub_button;
	}

	public void setSub_button(List<SynMenu> sub_button) {
		this.sub_button = sub_button;
	}

	@Override
	public String toString() {
		return "GetMenu [name=" + name + ", type=" + type + ", url=" + url + ", key=" + key + ", sub_button="
				+ sub_button + "]";
	}
	

}
