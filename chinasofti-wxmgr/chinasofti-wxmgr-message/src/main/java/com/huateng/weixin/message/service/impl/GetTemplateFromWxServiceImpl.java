package com.huateng.weixin.message.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huateng.weixin.message.model.TemplateMessageModel;
import com.huateng.weixin.message.service.GetTemplateFromWxService;
import com.huateng.weixin.message.util.WxUtil;

@Service
public class GetTemplateFromWxServiceImpl implements GetTemplateFromWxService{

	private  static final String TEMPLATE_RUL="https://api.weixin.qq.com/cgi-bin/template/get_all_private_template?access_token=ACCESS_TOKEN";
	
	@Autowired
	private TemplateMessageServiceImpl templateMessageSevice = new TemplateMessageServiceImpl();
	@Autowired
	private WxUtil wxUtil;
	/**
	 * 获取微信服务器消息模板列表
	 */
	@Override
	public String getTemplateFromWX(String accessToken) {
		accessToken="YzqPnS0bibQ_OQdyG6ADn_lJI51YScK5To9XQOgxJoFWT2F2nekFRyxBTXb4xeOJsB_iZbiukbR4d7gIkQqEEnrwcGD1zuFhU0Z7nRE1IIZqy4RZxY0Qs0D2kVSOjsa-WXZbACAEFH";
		String url = TEMPLATE_RUL.replace("ACCESS_TOKEN", accessToken);
		JSONObject jsObject = wxUtil.doGetStr(url);
		String result = JSONObject.fromObject(jsObject).toString();
		result = result.substring(result.indexOf("[")+1, result.indexOf("]"));
		String str[] = result.split("},");
		List list = new ArrayList<>();
		for(String ms : str){
			ms = ms+"}";
			JSONObject jo = JSONObject.fromObject(ms);
			TemplateMessageModel templateMessageModel = (TemplateMessageModel) JSONObject.toBean(jo, TemplateMessageModel.class);
			list.add(templateMessageModel);
		}
		//先删除
		
		templateMessageSevice.deleteTemplate();
		templateMessageSevice.deleteContent();
		
		//再添加
		templateMessageSevice.addTemplateFromWx(list);
		templateMessageSevice.addContentFromWx(list);
		return result;
	}

}
