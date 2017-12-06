package com.huateng.weixin.batch.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.huateng.weixin.batch.bean.WxUserFans;

@Component("getUserProcessor")
public class GetUserProcessor implements ItemProcessor<WxUserFans, WxUserFans> {
	
	private Logger logger = LoggerFactory.getLogger(GetUserProcessor.class);

	@Override
	public WxUserFans process(WxUserFans user) throws Exception {
		logger.info("这里调用服务，发送消息"+user);
		return user;
	}
	

}
