package com.huateng.weixin.msgrsp;
/**
 * 回复文本消息
 * @author husong
 * 2017年11月2日
 */
public class TextMessageRsp extends BaseMessageRsp{
	//回复的消息内容（换行：在content中能够换行，微信客户端就支持换行显示）  必须（不能为空）
    private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
    
}
