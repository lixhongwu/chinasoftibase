package com.huateng.weixin.material.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huateng.weixin.material.model.ReplyMessage;
import com.huateng.weixin.material.model.TemplateMessageContent;
import com.huateng.weixin.material.model.TemplateMessageModel;
import com.huateng.weixin.material.model.TemplateSendModel;
import com.huateng.weixin.material.service.AccessTokenService;
import com.huateng.weixin.material.service.MessageService;
import com.huateng.weixin.material.service.TemplateMessageSevice;
import com.huateng.weixin.material.util.WxUtil;

import net.sf.json.JSONObject;


@RestController
@RequestMapping("/message")
public class MessageController {
	//模板消息url
	private static final String TMP_URL="https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";

	@Autowired
	private MessageService messageService;
	
	@Autowired
	private AccessTokenService accessTokenService;
	@Autowired
	private TemplateMessageSevice tms;
	
	@Autowired
	private WxUtil wxUtil;
	
	/**
	 * 查询消息列表
	 * @return
	 */
	@RequestMapping(value="/getList", method = RequestMethod.POST)
	public List listAll(){
		System.out.println("=========");
		List<ReplyMessage> list = messageService.getMessageList();
		return list;
	}
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String add(@RequestParam(value="rulename") String rulename,@RequestParam(value="keywords") String keywords,@RequestParam(value="content") String content){
		ReplyMessage replyMessage = new ReplyMessage();
		replyMessage.setContent(content);
		replyMessage.setKey_words(keywords);
		replyMessage.setRule_name(rulename);
		String result = "";
		result = messageService.add(replyMessage);
		return result;
		
	}
	@RequestMapping(value="/delete", method = RequestMethod.POST)
	public void delete(@RequestParam(value="message_id") String message_id){
		messageService.delete(message_id);
	}
	
	@RequestMapping(value="/edit", method = RequestMethod.POST)
	public void edit(@RequestParam(value="message_id") String message_id,@RequestParam(value="rulename") String rulename,@RequestParam(value="keywords") String keywords,@RequestParam(value="content") String content ){
		ReplyMessage replyMessage = new ReplyMessage();
		replyMessage.setContent(content);
		replyMessage.setKey_words(keywords);
		replyMessage.setRule_name(rulename);
		replyMessage.setMessage_id(message_id);
		messageService.edit(replyMessage);
	}
	
	@RequestMapping(value="/searchByKey",method=RequestMethod.POST)
	public List searchByKey(@RequestParam(value="keyText")String keyText){
		@SuppressWarnings("unchecked")
		List<ReplyMessage> list =messageService.searchByKey(keyText);
		return list;
	}
	/**
	 * 同步模板消息到本地数据库
	 */
	@RequestMapping(value="/refresh",method=RequestMethod.POST)
	public void refresh(){
		String accessToken = accessTokenService.getAccessToken();
		tms.refresh(accessToken);
	}
	
	
	/**
	 * 查询模板消息列表
	 */
	@RequestMapping(value="/getTemplateList",method=RequestMethod.POST)
	public List getTemplateList(){
		List<TemplateMessageModel> list = null;
		try{
			 list = tms.getTemplateMessageList();
		}catch(Exception e){
			
		}
		System.out.println();
		return list;
	}
	
	/**
	 * 查询消息模板详细内容
	 */
	@RequestMapping(value="/getTemplateContent",method=RequestMethod.POST)
	public List getTemplateMessageContent(@RequestParam(value="template_id")String template_id){
		List<TemplateMessageContent> list = null;
		try{
			list = tms.getTemplateMessageContent(template_id);
		}catch(Exception e){
			
		}
		return list;
		
	}
	
	/**
	 * 发送模板消息
	 */
	@RequestMapping(value="/sendTemplateInfo",method=RequestMethod.POST)
	public Map sendTemplateInfo(@RequestParam Map<String, String> map){
		String token = accessTokenService.getAccessToken();
		System.out.println("获取到的accessToken："+token);
		String url = TMP_URL.replace("ACCESS_TOKEN", token);
		Map sendMap = new HashMap();
		Map<Object,Object> keyMap = new HashMap();
		for(Map.Entry<String, String> dataMap : map.entrySet()){
			if(dataMap.getKey().equals("template_id")||
					dataMap.getKey().equals("openid")||
					dataMap.getKey().equals("url")||
					dataMap.getKey().equals("username")){
				continue;
			}
			Map batMap = new HashMap();
			batMap.put("value", "  "+dataMap.getValue());
			batMap.put("color", "#173177");
			keyMap.put(dataMap.getKey(), batMap);
		}
		sendMap.put("data", keyMap);
		String template_id=map.get("template_id");
		String touser=map.get("openid");
		String turl =map.get("url");
		sendMap.put("template_id", template_id);
		sendMap.put("touser", touser);
		sendMap.put("url", turl);
		JSONObject json = JSONObject.fromObject(sendMap);
		String outStr =json.toString();

		JSONObject jsonObject = wxUtil.doPostStr(url, outStr);
		if(jsonObject!=null){
			TemplateSendModel templateSendModel = new TemplateSendModel();
			templateSendModel.setSend_body(JSONObject.fromObject(keyMap).toString());
			templateSendModel.setTemplate_id(template_id);
			templateSendModel.setTouser(touser);
			templateSendModel.setUrl(turl);
			tms.addTemplateFromSend(templateSendModel);
		}
		System.out.println(jsonObject);
		return map;
		
	}
	
	/**
	 * 获取用户列表
	 */
	@RequestMapping(value="/userList",method=RequestMethod.POST)
	public List userList(){
		return tms.userList();
	}
	
	/**
	 * 根据标题过来模板消息
	 */
	@RequestMapping(value="/searchByTitle",method=RequestMethod.POST)
	public List searchByTitle(@RequestParam(value="titleText") String titleText){
		return tms.searchByTitle(titleText);
	}
}
