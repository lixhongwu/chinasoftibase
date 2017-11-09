package com.huateng.weixin.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.commons.CommonsMultipartFile;
/**
 * 消息服务接口
 * @author husong
 * 2017年11月1日
 */
public interface MsgService {
	
	 public  String processRequest(HttpServletRequest request) ;
	 
//	 public String addTemporarySource(CommonsMultipartFile picFile,HttpServletRequest reques);
	 
}
