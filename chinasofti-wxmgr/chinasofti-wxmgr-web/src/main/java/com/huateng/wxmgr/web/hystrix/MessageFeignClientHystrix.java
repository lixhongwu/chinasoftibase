package com.huateng.wxmgr.web.hystrix;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.huateng.wxmgr.web.feign.MessageFeignClient;

@Component
public class MessageFeignClientHystrix implements MessageFeignClient {

	@Override
	public List listAll() {
		return null;
	}

	public String add(@RequestParam String rulename, @RequestParam String keywords, @RequestParam String content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(@RequestParam String message_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit(@RequestParam(value="message_id") String message_id ,
			@RequestParam String rulename, @RequestParam String keywords, @RequestParam String content) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getTemplateList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getTemplateContent(@RequestParam(value="template_id")String template_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map sendTemplateInfo(@RequestParam Map<String, String> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void refresh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List userList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List searchBykey(String keyText) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
