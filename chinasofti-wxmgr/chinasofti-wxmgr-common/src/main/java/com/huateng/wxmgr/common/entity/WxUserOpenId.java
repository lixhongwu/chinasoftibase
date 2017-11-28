package com.huateng.wxmgr.common.entity;

import java.util.List;

public class WxUserOpenId {

	private int total;
	private int count;
	private String next_openid;
	private List<String> openidList;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getNext_openid() {
		return next_openid;
	}

	public void setNext_openid(String next_openid) {
		this.next_openid = next_openid;
	}

	public List<String> getOpenidList() {
		return openidList;
	}

	public void setOpenidList(List<String> openidList) {
		this.openidList = openidList;
	}

	@Override
	public String toString() {
		return "WxUserOpenId [total=" + total + ", count=" + count + ", next_openid=" + next_openid + ", openidList="
				+ openidList + "]";
	}
	

}
