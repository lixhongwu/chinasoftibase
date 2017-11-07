package com.huateng.weixin.msg;
/**
 * 语音消息
 * @author husong
 * 2017年11月2日
 */
public class VoiceMessage extends BaseMessage {
	
    //语音消息媒体id，可以调用多媒体文件下载接口拉取该媒体
	private String MediaID;
	//语音格式：amr
	private String Format;
	public String getMediaID() {
		return MediaID;
	}
	public void setMediaID(String mediaID) {
		MediaID = mediaID;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	
}
