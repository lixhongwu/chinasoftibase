package com.huateng.weixin.msg;
/**
 * 文本消息
 * @author husong
 * 2017年11月2日
 */
public class TextMessage extends BaseMessage{
    //文本消息内容
	private String context;

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
	
}
