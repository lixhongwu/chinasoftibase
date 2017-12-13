package com.huateng.weixin.material.model;

public class UserModel {
private int ids;
private String openid;
private String nickname;
public String getOpenid() {
	return openid;
}
public int getIds() {
	return ids;
}
public void setIds(int ids) {
	this.ids = ids;
}
public void setOpenid(String openid) {
	this.openid = openid;
}
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}
}
