package com.huateng.wxmgr.web.hystrix;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.huateng.wxmgr.common.utils.Constant;
import com.huateng.wxmgr.web.feign.UserTagsFeign;

@Component
public class UserTagsFeignHystrix implements UserTagsFeign{
	
	private final static Logger logger =LoggerFactory.getLogger(UserTagsFeignHystrix.class);

	@Override
	public String findTagsByPage(Map<String, String> map) {
		logger.error(">>>>>>>>>>>>>>findTagsByPage调用服务出错，调用Hystrix!");
		return Constant.CALLBACK;
	}

	@Override
	public String addTags(Map<String, String> map) {
		logger.error(">>>>>>>>>>>>>>addTags调用服务出错，调用Hystrix!");
		return Constant.CALLBACK;
	}

	@Override
	public String deleteTagByID(String ids) {
		logger.error(">>>>>>>>>>>>>>deleteTagByID调用服务出错，调用Hystrix!");
		return Constant.CALLBACK;
	}

	@Override
	public String updataTag(Map<String, String> map) {
		logger.error(">>>>>>>>>>>>>>updataTag调用服务出错，调用Hystrix!");
		return Constant.CALLBACK;
	}

	@Override
	public String synchroTags() {
		logger.error(">>>>>>>>>>>>>>synchroTags调用服务出错，调用Hystrix!");
		return Constant.CALLBACK;
	}

	@Override
	public String checkTagName(String name) {
		logger.error(">>>>>>>>>>>>>>checkTagName调用服务出错，调用Hystrix!");
		return Constant.CALLBACK;
	}

}
