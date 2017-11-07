package com.huateng.weixin.msgrsp;
/**
 * 回复图片信息
 * @author husong
 * 2017年11月2日
 */
public class ImageMessageRsp extends BaseMessageRsp{
    
	//通过素材管理中的接口上传多媒体文件，得到的id。  必须
	private String MediaId;

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	
}
