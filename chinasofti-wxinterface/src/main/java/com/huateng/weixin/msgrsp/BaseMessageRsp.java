package com.huateng.weixin.msgrsp;
/**
 * 基础回复消息模板
 * @author husong
 * 2017年11月2日
 */
public class BaseMessageRsp {
    //接收方帐号（收到的OpenID）
	private String ToUserName;
	//开发者微信号
	private String FromUserName;
	//消息创建时间 （整型）
	private long CreateTime;
	// 消息类型（text/music/news）分别是文本、音频、图文
	private String MsgType;
	//标识
	private int FuncFlag;
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	
	public long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public int getFuncFlag() {
		return FuncFlag;
	}
	public void setFuncFlag(int funcFlag) {
		FuncFlag = funcFlag;
	}
	

}
