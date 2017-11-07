package com.huateng.weixin.msg;
/**
 * 链接消息
 * @author husong
 * 2017年11月2日
 */
public class LinkMessage extends BaseMessage{
    //消息描述
	private String Description;
	//消息链接
	private String Url;
	//消息标题
	private String Title;

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	
}
