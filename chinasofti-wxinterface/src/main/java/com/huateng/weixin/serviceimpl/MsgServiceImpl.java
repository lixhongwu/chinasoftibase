package com.huateng.weixin.serviceimpl;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.huateng.weixin.service.MsgService;
/**
 * 核心服务类
 * @author husong
 * 2017年11月1日
 */
@Service("MsgService")
public class MsgServiceImpl implements MsgService {

	 private static Logger log = LoggerFactory.getLogger(MsgServiceImpl.class);

	    /**
	     * 处理微信发来的请求（包括事件的推送）
	     *
	     * @param request
	     * @return
	     */
	    public  String processRequest(HttpServletRequest request) {
	    //暂时对消息不作处理
	      return "";
	    }
}
