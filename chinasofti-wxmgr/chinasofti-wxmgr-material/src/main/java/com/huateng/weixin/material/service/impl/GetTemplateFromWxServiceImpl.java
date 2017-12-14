package com.huateng.weixin.material.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.huateng.weixin.material.service.GetTemplateFromWxService;
import com.huateng.wxmgr.common.entity.TemplateMessageModel;
import com.huateng.wxmgr.common.utils.WeixinUtil;

import net.sf.json.JSONObject;

@Service
public class GetTemplateFromWxServiceImpl implements GetTemplateFromWxService{

	private  static final String TEMPLATE_RUL="https://api.weixin.qq.com/cgi-bin/template/get_all_private_template?access_token=ACCESS_TOKEN";
	
	@Autowired
	private TemplateMessageServiceImpl templateMessageSevice = new TemplateMessageServiceImpl();
	/**
	 * 获取微信服务器消息模板列表
	 */
	@Override
	@Transactional
	public String getTemplateFromWX(String accessToken) {
		String result = null;
		String url = TEMPLATE_RUL.replace("ACCESS_TOKEN", accessToken);
		JSONObject jsObject = WeixinUtil.doGetStr(url);
		//JSONObject jsObject = wxUtil.doGetStr(url);
		if(jsObject.get("errcode")!=null){
			return result;
		}
	    result = JSONObject.fromObject(jsObject).toString();
		result = result.substring(result.indexOf("[")+1, result.indexOf("]"));
		String str[] = result.split("},");
		List list = new ArrayList<>();
		for(String ms : str){
			ms = ms+"}";
			JSONObject jo = JSONObject.fromObject(ms);
			TemplateMessageModel templateMessageModel = (TemplateMessageModel) JSONObject.toBean(jo, TemplateMessageModel.class);
			list.add(templateMessageModel);
		}
		try{
			//先删除
			templateMessageSevice.deleteTemplate();
			templateMessageSevice.deleteContent();
			//再添加
			templateMessageSevice.addTemplateFromWx(list);
			templateMessageSevice.addContentFromWx(list);
		}catch(Exception e){
			//异常则回滚
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		}
		
		return result;
	}

}
