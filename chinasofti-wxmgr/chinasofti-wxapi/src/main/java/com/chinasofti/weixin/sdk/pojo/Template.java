package com.chinasofti.weixin.sdk.pojo;

import java.util.HashMap;
import java.util.Map;
/**
 * 
* @ClassName: Template
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 李中武
* @date 2016年6月22日 上午10:51:02 
*
 */
public class Template {
	private String urlToken;
	private String userIds;//发送者userids
	private String toUser;//发送者openId
	private String templateId; //模板Id
	private String url;//跳转url
	private String title;//模板消息名称（日志使用）
	Map<String, Object> dataMap = new HashMap<String, Object>();//消息内容
	/**
	 * ex:
	Map<String, Object> dataMap = new HashMap<String, Object>();
	Map<String, Object> first = new HashMap<String, Object>();
	first.put("value", firstValue);
	dataMap.put("first", first);
	Map<String, Object> keynote1 = new HashMap<String, Object>();
	keynote1.put("value", "优惠券");//礼券类别:优惠券
	dataMap.put("keyword1", keynote1);
	Map<String, Object> keynote2 = new HashMap<String, Object>();
	keynote2.put("value",code.getStr("COUPON_CODE"));	//礼券券码:1000003
	dataMap.put("keyword2", keynote2);
	String time = CommonHelper.getForamtDate(new Date(),"yyyy-MM-dd HH:mm:ss");
	Map<String, Object> keynote3 = new HashMap<String, Object>();
	keynote3.put("value", time);
	dataMap.put("keyword3", keynote3);
	Map<String, Object> remark = new HashMap<String, Object>();
	remark.put("value", remarkValue);
	dataMap.put("remark", remark);
	 */
	public String getUserIds() {
		return userIds;
	}
	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}
	public String getUrlToken() {
		return urlToken;
	}
	public void setUrlToken(String urlToken) {
		this.urlToken = urlToken;
	}
	public String getToUser() {
		return toUser;
	}
	public void setToUser(String toUser) {
		this.toUser = toUser;
	}
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Map<String, Object> getDataMap() {
		return dataMap;
	}
	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

}
