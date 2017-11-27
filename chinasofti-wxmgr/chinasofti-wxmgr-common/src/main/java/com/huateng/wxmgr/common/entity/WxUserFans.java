package com.huateng.wxmgr.common.entity;

import java.util.List;

public class WxUserFans {
    private String ids;

    private String urltoken;

    private String appid;

    private String openid;

    private String subscribe;

    private String subscribeTime;

    private String nickname;

    private String sex;

    private String country;

    private String province;

    private String city;

    private String language;

    private String headimgurl;

    private String groupid;

    private String unionid;

    private String tagidList;

    private String black;

    private String remark;
    
    //接收返回的数据，封装入tagidList
    public void setTagid_list(List<?> tagidList) {
		this.tagidList = tagidList.toString();
	}


	public String getIds() {
        return ids;
    }
    

    public void setIds(String ids) {
        this.ids = ids == null ? null : ids.trim();
    }

    public String getUrltoken() {
        return urltoken;
    }

    public void setUrltoken(String urltoken) {
        this.urltoken = urltoken == null ? null : urltoken.trim();
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe == null ? null : subscribe.trim();
    }

    public String getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(String subscribeTime) {
        this.subscribeTime = subscribeTime == null ? null : subscribeTime.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl == null ? null : headimgurl.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public String getTagidList() {
        return tagidList;
    }

    public void setTagidList(String tagidList) {
        this.tagidList = tagidList == null ? null : tagidList.trim();
    }

    public String getBlack() {
        return black;
    }

    public void setBlack(String black) {
        this.black = black == null ? null : black.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

	@Override
	public String toString() {
		return "WxUserFans [ids=" + ids + ", urltoken=" + urltoken + ", appid=" + appid + ", openid=" + openid
				+ ", subscribe=" + subscribe + ", subscribeTime=" + subscribeTime + ", nickname=" + nickname + ", sex="
				+ sex + ", country=" + country + ", province=" + province + ", city=" + city + ", language=" + language
				+ ", groupid=" + groupid + ", unionid=" + unionid + ", tagidList=" + tagidList + ", black=" + black
				+ ", remark=" + remark + "]";
	}
    
}