package com.huateng.weixin.user.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huateng.weixin.user.service.TagModalService;
import com.huateng.weixin.user.service.TagService;
import com.huateng.wxmgr.common.entity.WxUserTags;

import net.sf.json.JSONObject;

@RequestMapping("/usertags")
@RestController
public class WxUserTagsController {

	private final static Logger logger = LoggerFactory.getLogger(WxUserTagsController.class);
	
	//与微信交互对象
	@Autowired
	private TagService tagService;
	//本地服务对象
	@Autowired
	private TagModalService tagsModalService;

	@RequestMapping(value = "/findTagsByPage", method = RequestMethod.POST)
	public String findTagsByPage(@RequestParam Map<String, String> map) {
		logger.info("findTagsByPage+传入参数>>>>>>>>>>>>>>+"+map.toString());
		WxUserTags tags = new WxUserTags();
		try {
			BeanUtils.populate(tags, map);
		} catch (IllegalAccessException | InvocationTargetException e) {
		logger.error("map转对象异常");
			e.printStackTrace();
		}
		return  tagsModalService.findTagsByPage(tags);
	}

}
