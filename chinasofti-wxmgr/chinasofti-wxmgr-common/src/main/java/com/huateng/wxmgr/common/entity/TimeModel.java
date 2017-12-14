package com.huateng.wxmgr.common.entity;

import java.sql.Timestamp;

public class TimeModel {
	private Timestamp create_time;//创建时间
	private Timestamp update_time;//更新时间
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
