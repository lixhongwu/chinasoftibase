package com.huateng.weixin.batch.interfaces;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huateng.weixin.batch.service.AccessTokenService;
import com.huateng.weixin.batch.util.WxUtil;

import net.sf.json.JSONObject;

@Component("kefuMessageSend")
public class KefuMessageSend {

	@Autowired
	WxUtil wxUtil;
	private static Logger logger = LoggerFactory.getLogger(KefuMessageSend.class);
	
	@Autowired
	private AccessTokenService accessTokenService;
	//发送消息
	private String kfaccount_send_url = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";
	
	/*public void sendMessage(String touser,String content,String accessToken){
		//拼接发送消息的url
		String url = kfaccount_send_url.replace("ACCESS_TOKEN", accessToken);
		String json = "{\"touser\":\""+touser+"\",\"msgtype\":\"text\",\"text\":{\"content\":\""+content+"\"}}";
		logger.info("json>>>>>>"+json);
		//调接口
		JSONObject jsonObject = WeixinUtil.httpRequest(url, "POST", json);
		logger.info("jsonobejct>>>>>"+jsonObject);
		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				logger.error("发送消息失败 errcode : {} errmsg : {}", jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
		} else {
			logger.error("jsonObject为空");
		}
	}*/
	public void sendMessage(String body){
		String token = accessTokenService.getAccessToken();
		logger.info("accessToken>>>>>>>>> {} ",token);
//		String token = "jYdz_PmBjo3k7Q5PrYszcd-mAmVdNt5ycp39GKKB33G5D9Ica8luQSBUiat-sbHYVFDxULMaqJrL0MoNS89UkGzxnZUPS6ediuAzAF1DJctWV2lQ9DpvbpAQRYJz6hEsHIOfAAAUVB";
		String url = kfaccount_send_url.replace("ACCESS_TOKEN", token);
		JSONObject jsonObject = wxUtil.doPostStr(url, body);
		logger.info("jsonobejct>>>>>"+jsonObject);
		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				logger.error("发送消息失败 errcode : {} errmsg : {}", jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
		} else {
			logger.error("jsonObject为空");
		}
	}
}
