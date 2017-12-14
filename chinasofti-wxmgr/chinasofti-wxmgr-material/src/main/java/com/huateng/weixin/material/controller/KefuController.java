package com.huateng.weixin.material.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huateng.weixin.material.service.AccessTokenService;
import com.huateng.weixin.material.service.KefuService;
import com.huateng.wxmgr.common.entity.Kefu;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/kefu")
public class KefuController {

	private static Logger logger = LoggerFactory.getLogger(KefuController.class);
	
	@Autowired
	private KefuService kefuService;
	@Autowired
	private AccessTokenService accessTokenService;
	
	//查询全部客服
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public String get(){
		//调用接口获取access_token 
		String at = accessTokenService.getAccessToken();
		if(at != null){
			JSONObject jsonObject = kefuService.get(at);
			return String.valueOf(jsonObject);
		}else {
			logger.error("查询客服失败");
			return "没数据";
		}
	}
	
	//添加客服
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public void add(){
		//调用接口获取access_token
		String at = accessTokenService.getAccessToken();
		if(at != null){
			kefuService.add(new Kefu(), at);
		}else {
			logger.error("添加客服失败");
		}
	}
	
	//编辑客服
	@RequestMapping(value="/update",method = RequestMethod.POST)
	public void update(){
		//调用接口获取access_token
		String at = accessTokenService.getAccessToken();
		if(at != null){
			kefuService.update(new Kefu(), at);
		}else {
			logger.error("编辑客服失败");
		}
	}
	
	//删除客服
	@RequestMapping(value="/delete",method = RequestMethod.POST)
	public void delete(){
		 // 调用接口获取access_token
        String at = accessTokenService.getAccessToken();
        String kefu_account = "";
        if(at != null){
        	kefuService.delete(kefu_account, at);
        }else {
        	logger.error("删除客服失败");
        }
	}
	//发送文本消息
	@RequestMapping(value="/sendText",method = RequestMethod.POST)
	public void sendText(@RequestParam Map map){
		 // 调用接口获取access_token
        String accessToken = accessTokenService.getAccessToken();
        String touser = (String) map.get("openid");
        String content = (String) map.get("content");
        kefuService.sendText(touser, content, accessToken);
	}
	//发送素材消息
	@RequestMapping(value="/sendMessager",method = RequestMethod.POST)
	public void sendMessager(@RequestParam Map map){
		// 调用接口获取access_token
		String accessToken = accessTokenService.getAccessToken();
		String touser = (String) map.get("openid");
		String media_id = (String) map.get("mediaid");
		kefuService.sendImage(touser, media_id, accessToken);
	}
}
