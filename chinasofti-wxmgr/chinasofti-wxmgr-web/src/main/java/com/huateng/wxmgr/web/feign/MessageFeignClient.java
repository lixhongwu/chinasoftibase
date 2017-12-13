package com.huateng.wxmgr.web.feign;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.huateng.wxmgr.web.hystrix.MessageFeignClientHystrix;

@FeignClient(name="chinasofti-wxmgr-materialservice",fallback=MessageFeignClientHystrix.class)
public interface MessageFeignClient {
	/**
	 * 获取消息列表
	 * @return
	 */
	@RequestMapping(value="/message/getList",method=RequestMethod.POST)
	public List listAll();
	
	/**
	 * 
	 */
	@RequestMapping(value="/message/add",method=RequestMethod.POST)
	public String add(@RequestParam(value="rulename") String rulename,@RequestParam(value="keywords") String keywords,@RequestParam(value="content") String content);
	
	@RequestMapping(value="/message/delete",method=RequestMethod.POST)
	public String delete(@RequestParam(value="message_id") String message_id );
	
	@RequestMapping(value="/message/edit",method=RequestMethod.POST)
	public String edit(@RequestParam(value="message_id") String message_id ,@RequestParam(value="rulename") String rulename,@RequestParam(value="keywords") String keywords,@RequestParam(value="content") String content);
	
	@RequestMapping(value="/message/searchByKey",method=RequestMethod.POST)
	public List searchBykey(@RequestParam(value="keyText")String keyText);
	
	/**
	 * 同步微信服务器上的模板列表到本地数据库
	 */
	@RequestMapping(value="/message/refresh",method=RequestMethod.POST)
	public void refresh();
	
	/**
	 * 从本地数据库获取模板消息列表
	 */
	@RequestMapping(value="/message/getTemplateList",method=RequestMethod.POST)
	public List getTemplateList();
	
	
	/**
	 * 获取模板消息详细内容
	 */
	@RequestMapping(value="/message/getTemplateContent",method=RequestMethod.POST)
	public List getTemplateContent(@RequestParam(value="template_id") String template_id);
	
	/**
	 * 发送模板消息
	 */
	@RequestMapping(value="/message/sendTemplateInfo",method=RequestMethod.POST)
	public Map sendTemplateInfo(@RequestParam Map<String, String> map);
	
	@RequestMapping(value="/message/userList",method=RequestMethod.POST)
	public List userList();
	
	@RequestMapping(value="/message/searchByTitle",method=RequestMethod.POST)
	public List searchByTitle(@RequestParam(value="titleText") String titleText);
}
