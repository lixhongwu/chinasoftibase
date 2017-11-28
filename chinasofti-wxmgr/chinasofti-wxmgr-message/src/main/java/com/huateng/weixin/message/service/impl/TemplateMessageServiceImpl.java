package com.huateng.weixin.message.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huateng.weixin.message.mapper.TemplateMessageMapper;
import com.huateng.weixin.message.model.TemplateMessageContent;
import com.huateng.weixin.message.model.TemplateMessageModel;
import com.huateng.weixin.message.model.TemplateSendModel;
import com.huateng.weixin.message.model.UserModel;
import com.huateng.weixin.message.service.GetTemplateFromWxService;
import com.huateng.weixin.message.service.TemplateMessageSevice;
/**
 * 操作数据库
 * @author Memoa
 *
 */
@Service
public class TemplateMessageServiceImpl implements TemplateMessageSevice{
	@Autowired
	TemplateMessageMapper tmm;
	@Autowired
	GetTemplateFromWxService gtfs;
	@Override
	public List getTemplateMessageList() {
		List<TemplateMessageModel> list = null;
		try{
			 list = tmm.getTemplateMessageList();
		}catch(Exception e){
			
		}
		return list;
	}
	@Override
	public List<TemplateMessageContent> getTemplateMessageContent(
			String template_id) {
		// TODO Auto-generated method stub
		List<TemplateMessageContent> list = null;
		try{
			 list = tmm.getTemplateMessageContent(template_id);
		}catch(Exception e){
			
		}
		return list;
	}
	@Override
	public void addTemplateFromWx(List list) {
		try{
			tmm.addTemplateFromWx(list);
			System.out.println("111");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	@Override
	public void addContentFromWx(List list) {
		tmm.addContentFromWx(list);
	}
	@Override
	public void addTemplateFromSend(TemplateSendModel templateSendModel) {
		// TODO Auto-generated method stub
		tmm.addTemplateFromSend(templateSendModel);
	}
	
	/**
	 * 同步数据库
	 */
	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
		String accessToken ="m2qJ0M_Vx7Dm2bLXb_sIDR-LZl5Ka1-gcjDH6waz7IS93pGPnewMgNXwEt3MPDDnSq6dp62e2X23v_9Q-pP8yrTrrZ6KK4jXWfzFpZN_daWhE2Cp5c5wV6s8uRp1NxSvHBWhAJAOID-Zt-DVMz0Yf_whl1ZZ27mteI6xGGajoKftQKbw17-60JnE9cMRs6Qp6bVaginhUqmFQSszoIy3RBOjAJALVI";
		//从微信获取模板消息
		gtfs.getTemplateFromWX(accessToken);
	}
	/**
	 * 删除本地模板
	 */
	@Override
	public void deleteTemplate() {
		// TODO Auto-generated method stub
		tmm.deleteTemplate();
	}
	/**
	 * 删除本地模板详情内容
	 */
	@Override
	public void deleteContent() {
		// TODO Auto-generated method stub
		tmm.deleteContent();
	}
	@Override
	public List<UserModel> userList() {
		// TODO Auto-generated method stub
		return tmm.userList();
	}

}
