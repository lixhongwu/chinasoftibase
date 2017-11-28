package com.huateng.weixin.kefu.service.impl;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.huateng.weixin.kefu.model.Kefu;
import com.huateng.weixin.kefu.service.KefuService;
import com.huateng.weixin.kefu.util.WeixinUtil;

import net.sf.json.JSONObject;

@Component("KefuService")
public class KefuServiceImpl implements KefuService {

	// 添加客服
	private String kfaccount_add_url = "https://api.weixin.qq.com/customservice/kfaccount/add?access_token=ACCESS_TOKEN";

	// 修改客服信息
	private String kfaccount_update_url = "https://api.weixin.qq.com/customservice/kfaccount/update?access_token=ACCESS_TOKEN";

	// 删除客服
	private String kfaccount_delete_url = "https://api.weixin.qq.com/customservice/kfaccount/del?access_token=ACCESS_TOKEN";

	// 获取所有客服账号
	private String kfaccount_get_url = "https://api.weixin.qq.com/cgi-bin/customservice/getkflist?access_token=ACCESS_TOKEN";
	
	//发送消息
	private String kfaccount_send_url = "https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN";

	private static Logger logger = LoggerFactory.getLogger(KefuServiceImpl.class);

	@Override
	public void add(Kefu kefu, String accessToken) {

		// 拼接添加客服的url
		String url = kfaccount_add_url.replace("ACCESS_TOKEN", accessToken);
		// 将客服对象转换成json字符串
		String jsonKefu = JSONObject.fromObject(kefu).toString();
		logger.info("添加客服："+jsonKefu);
		// 调用接口
		JSONObject jsonObject = WeixinUtil.httpRequest(url, "POST", jsonKefu);
		logger.info("添加客服：JSONObject"+jsonObject);
		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				logger.error("添加客服失败 errcode:{} errmsg:{}", jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
		} else {
			logger.error("jsonObject为空");
		}
	}

	@Override
	public void update(Kefu kefu, String accessToken) {
		// 拼接添加客服的url
		String url = kfaccount_update_url.replace("ACCESS_TOKEN", accessToken);
		// 将客服对象转换成json字符串
		String jsonKefu = JSONObject.fromObject(kefu).toString();
		// 调用接口
		JSONObject jsonObject = WeixinUtil.httpRequest(url, "POST", jsonKefu);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				logger.error("编辑客服失败 errcode : {} errmsg : {}", jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
		} else {
			logger.error("jsonObject为空");
		}
	}

	@Override
	public void delete(String kf_account, String accessToken) {
		// 拼接删除客服的url
		String url = kfaccount_delete_url.replace("ACCESS_TOKEN", accessToken);
		// 调用接口
		JSONObject jsonObject = WeixinUtil.httpRequest(url, "GET", null);

		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				logger.error("删除客服失败 errcode:{} errmsg:{}", jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
		} else {
			logger.error("jsonObject为空");
		}
	}

	@Override
	public JSONObject get(String accessToken) {
		// 拼接查询客服的url
		String url = kfaccount_get_url.replace("ACCESS_TOKEN", accessToken);
		// 调用接口
		JSONObject jsonObject = WeixinUtil.httpRequest(url, "GET", null);
		if (null != jsonObject) {
			if (0 != jsonObject.getInt("errcode")) {
				logger.error("查询客服失败 errcode:{} errmsg:{}", jsonObject.getInt("errcode"), jsonObject.getString("errmsg"));
			}
		} else {
			logger.error("jsonObject为空");
		}

		return jsonObject;
	}

	@Override
	public void sendText(String touser,String content,String accessToken) {
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
	}

	@Override
	public void sendImage(String touser, String media_id, String accessToken) {
		//拼接发送消息的url
		String url = kfaccount_send_url.replace("ACCESS_TOKEN", accessToken);
		String json =  "{\"touser\":\""+touser+"\",\"msgtype\":\"image\",\"image\":{\"media_id\":\""+media_id+"\"}}";
		logger.info("json>>>>>>>>>>>"+json);
		//调接口
		JSONObject jsonObject = WeixinUtil.httpRequest(url, "POST", json);
		logger.info("jsonobject>>>>>>>>>>>>"+jsonObject);
		if(null != jsonObject){
			if(0 != jsonObject.getInt("errcode")){
				logger.error("发送消息失败 errcode : {} errmsg : {}",jsonObject.getInt("errcode"),
						jsonObject.getString("errmsg"));
			}
		}else {
			logger.error("jsonnObject为控");
		}
	}

}
