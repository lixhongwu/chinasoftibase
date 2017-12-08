package com.huateng.weixin.batch.processor;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huateng.weixin.batch.interfaces.SendTemplateMessage;
import com.huateng.weixin.batch.model.TemplateSendModel;
import com.huateng.weixin.batch.model.UserModel;
import com.huateng.weixin.batch.util.DataMapInstance;

@Component("templateMessageProcessor")
public class TemplateMessageProcessor implements ItemProcessor<TemplateSendModel, TemplateSendModel>{

	@Autowired
	SendTemplateMessage sendTemplateMessage;
	@Override
	public TemplateSendModel process(TemplateSendModel item)
			throws Exception {
		Map sendMap = new HashMap();
		String touser = item.getTouser();
		String contents = item.getSend_body();
		JSONObject jObject = JSONObject.fromObject(contents);
		Map<String, Map> contentMap = (Map) jObject;
		sendMap.put("data", contentMap);
		sendMap.put("touser", touser);
		sendMap.put("template_id", item.getTemplate_id());
		sendMap.put("url", item.getUrl());
		String body = JSONObject.fromObject(sendMap).toString();
		sendTemplateMessage.send(body);
		return null;
	}

}
