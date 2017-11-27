package com.huateng.weixin.user.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.huateng.weixin.user.service.TagModalService;
import com.huateng.weixin.user.service.TagService;
import com.huateng.wxmgr.common.entity.WxUserTags;
import com.huateng.wxmgr.common.entity.WxUserTagsExample;
import com.huateng.wxmgr.common.utils.JsonUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TagServiceTests {

	private final static Logger logger = LoggerFactory.getLogger(TagServiceTests.class);

	@Autowired
	private TagService tagService;
	@Autowired
	private TagModalService tagModalService;

	@Test
	public void test() {

		// Map<String,String> map =new HashMap<String, String>();

		WxUserTags map = new WxUserTags();
		map.setPage(1);
		map.setRows(2);
		String list = tagModalService.findTagsByPage(map);

		logger.info("test>>>>>>>>>>>>>>>+" + list.toString());
	}

	/**
	 * 测试创建一个用户标签
	 */
	@Test
	public void createTest() {
		JSONObject result = tagService.createTag("奥特曼");
		tagsResult(result);
	}
	/*
	 * 15999622130 075526600024
	 */

	private boolean tagsResult(JSONObject result) {
		logger.info(result.toString());
		if (result == null || result.size() == 0) {
			logger.error("响应失败！");
			return false;
		} else {
			if (result.has("errcode")) {
				logger.error(
						"服务器响应了异常：" + result.get("errmsg").toString() + ",错误码为：" + result.get("errcode").toString());
				return false;
			} else {
				return true;
			}
		}
	}

	/**
	 * 测试获取用户创建的所有标签
	 */
	@Test
	@SuppressWarnings({ "rawtypes" })
	public void getTest() {
		JSONObject result = tagService.getTags();
		logger.info(">>>>>>>>>>>>>>>>>>>" + result.toString());
		if (result == null || result.size() == 0) {
			logger.error("响应失败！");
		} else {
			if (result.has("errcode")) {
				logger.error(
						"服务器响应了异常：" + result.get("errmsg").toString() + ",错误码为：" + result.get("errcode").toString());
			} else if (result.has("tags")) {
				JSONArray object = result.getJSONArray("tags");

				List<Object> tags = JsonUtils.jsonToList(object.toString(), Object.class);
				logger.info(">>>>>>>>>>>>>>>>>>>" + object.toString());
				for (Object tag : tags) {
					StringBuilder sb = new StringBuilder();
					Map map = (Map) tag;
					sb.append("{id=" + map.get("id").toString() + ",");
					sb.append("name=" + map.get("name").toString() + ",");
					sb.append("count=" + map.get("count").toString() + "}");
					System.out.println(sb.toString().trim());
				}
			} else {
				logger.error("获取到非法响应：" + result.toString());
			}
		}
	}

	@Test
	public void deleteTest() {
		JSONObject result = tagService.deleteTag(100);
		// Gson gson = new Gson();
		logger.info(result.toString());
	}

	@Test
	public void batchTagTest() {
		List<String> openIds = new ArrayList<>(4);
		openIds.add("ofGuR1Nn6HszF0yehPRMUgAPaXFc");
//		openIds.add("ov0atsyAOPFdwHBj0y6kAR0Yq6mw");
//		openIds.add("ov0atsxbGXPIhrmmuUYt8iLFbg_4");
//		openIds.add("ov0ats6YvE_SmEbbo6u54cQIIwSs");

		JSONObject result = tagService.batchTag(openIds, 101);
		logger.info(result.toString());
	}

	@Test
	public void fansTest() {
		JSONObject result = tagService.getFans(101, "");
		logger.info(result.toString());
	}

	@Test
	public void batchUntagTest() {
		List<String> openIds = new ArrayList<>(4);
		openIds.add("ov0ats98_oA98Es1L9Sgdj99A-M8");
		openIds.add("ov0atsyAOPFdwHBj0y6kAR0Yq6mw");
		openIds.add("ov0atsxbGXPIhrmmuUYt8iLFbg_4");
		openIds.add("ov0ats6YvE_SmEbbo6u54cQIIwSs");

		JSONObject result = tagService.batchUntag(openIds, 101);
		logger.info(result.toString());
	}
}