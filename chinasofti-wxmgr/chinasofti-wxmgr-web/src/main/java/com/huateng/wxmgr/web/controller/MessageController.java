package com.huateng.wxmgr.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huateng.wxmgr.web.feign.MessageFeignClient;
import com.huateng.wxmgr.web.model.TemplateMessageModel;

@RestController
@RequestMapping("/message")
public class MessageController {
	@Autowired
	private MessageFeignClient messageFeignClient;
	@RequestMapping("/tmpMessage")
	public ModelAndView getView(){
		//message文件下,tmpMessage.ftl
			return new ModelAndView("message/tmpMessage");
	}
	@RequestMapping("/templateMessage")
	public ModelAndView getTmplate(){
		return new ModelAndView("message/templateMessage");
		
	}
	/**
	 * 获取页面数据
	 * @return
	 */
	@RequestMapping(value="/getList",method=RequestMethod.POST)
	@ResponseBody
	public List listAll(){
		List listAll=messageFeignClient.listAll();
		System.out.println(listAll);
		return listAll;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	@ResponseBody
	public void add(@RequestParam(value="rulename") String rulename,@RequestParam(value="keywords") String keywords,@RequestParam(value="content") String content ){
		messageFeignClient.add(rulename, keywords, content);
	}
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public void delete(@RequestParam(value="message_id") String message_id){
		messageFeignClient.delete(message_id);
	}
	
	@RequestMapping(value="/edit",method=RequestMethod.POST)
	@ResponseBody
	public void edit(@RequestParam(value="message_id") String message_id,@RequestParam(value="rulename") String rulename,@RequestParam(value="keywords") String keywords,@RequestParam(value="content") String content ){
		messageFeignClient.edit(message_id, rulename, keywords, content);
	}
	
	/**
	 * 同步微信服务端上的模板消息到本地数据库
	 */
	@RequestMapping(value="/refresh",method=RequestMethod.POST)
	public void refresh(){
		 messageFeignClient.refresh();
	}
	
	/**
	 * 获取模板消息列表
	 */
	@RequestMapping(value="/getTemplateList",method=RequestMethod.POST)
	@ResponseBody
	public List getTemplateList(){
		return messageFeignClient.getTemplateList();
	}
	
	/**
	 * 获取模板消息详细内容
	 */
	@RequestMapping(value="/getTemplateContent",method=RequestMethod.POST)
	@ResponseBody
	public List getTemplateContent(@RequestParam(value="template_id")String template_id){
		return messageFeignClient.getTemplateContent(template_id);
		
	}
	
	/**
	 * 发送模板消息
	 */
	@RequestMapping(value="/sendTemplateInfo",method=RequestMethod.POST)
	public Map sendTemplateInfo(@RequestParam Map<String, String> map){
		
		return messageFeignClient.sendTemplateInfo(map);
		
	}
	
	/**
	 * 用户列表
	 */
	@RequestMapping(value="/userList",method=RequestMethod.POST)
	public List userList(){
		return messageFeignClient.userList();
		
	}
}
