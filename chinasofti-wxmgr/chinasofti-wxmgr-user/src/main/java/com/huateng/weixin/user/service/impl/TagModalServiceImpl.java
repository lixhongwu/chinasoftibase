package com.huateng.weixin.user.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huateng.weixin.user.mapper.WxUserTagsMapper;
import com.huateng.weixin.user.service.TagModalService;
import com.huateng.wxmgr.common.entity.WxUserTags;
import com.huateng.wxmgr.common.entity.WxUserTagsExample;

import net.sf.json.JSONObject;

@Service
public class TagModalServiceImpl implements TagModalService {

	private final static Logger logger = LoggerFactory.getLogger(TagModalServiceImpl.class);
	@Autowired
	private WxUserTagsMapper mapper;

	@Override
	public String findTagsByPage(WxUserTags tags) {
		WxUserTagsExample example = new WxUserTagsExample();
		JSONObject json = new JSONObject();
		// 分页查询
		PageHelper.startPage(tags.getPage(), tags.getRows());
		List<WxUserTags> list = mapper.selectByExample(example);
		json.put("rows", list);
		json.put("total", ((Page<WxUserTags>) list).getTotal());
		logger.info("findTagsByPage+分页查询后参数>>>>>>>>>>>>>>" + json.toString());
		return json.toString();
	}

	@Override
	public int deleteTagById(int id) {

		int i = mapper.deleteByPrimaryKey(2);
		logger.info("deleteTagById>>>>>>>>>>>>>>删除的tags数=" + i);
		return i;

	}

	@Override
	public WxUserTags findTagById(int id) {
		WxUserTags userTags = mapper.selectByPrimaryKey(100);
		logger.info("deleteTagById>>>>>>>>>>>>>>" + userTags.toString());
		return userTags;
	}

}
