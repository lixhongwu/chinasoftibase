package com.huateng.weixin.msg;
/**
 * 图片消息
 * @author husong
 * 2017年11月2日
 */
public class ImageMessage extends BaseMessage{
    //图片链接（由系统生成）
	private String PicUrl;
	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	//图片消息媒体id，可以调用多媒体文件下载接口拉取数据。
	private String MediaId;

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String PicUrl) {
		this.PicUrl = PicUrl;
	}
	
}
