package com.huateng.weixin.material.model;

/**
 * 客服的基类
 */
public class Kefu {

    private String kf_account ; //完整客服账号，格式为：账号前缀@公众号微信号
    //private String kf_id ;//客服工号
    private String  nickname;//	客服昵称，最长6个汉字或12个英文字符
    //private String  password;//客服账号登录密码，格式为密码明文的32位加密MD5值。该密码仅用于在公众平台官网的多客服功能中使用，若不使用多客服功能，则不必设置密码

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

  /*  public String getPassword() {
    	return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getKf_id() {
        return kf_id;
    }
    
    public void setKf_id(String kf_id) {
        this.kf_id = kf_id;
    }*/
    
    public String getKf_account() {
        return kf_account;
    }
    
    public void setKf_account(String kf_account) {
        this.kf_account = kf_account;
    }

   
}
