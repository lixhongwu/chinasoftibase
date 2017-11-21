package com.huateng.weixin.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;


import com.huateng.weixin.user.service.AccessTokenService;
import com.huateng.weixin.user.service.TagService;
import com.huateng.weixin.user.util.Constraints;
import com.huateng.weixin.user.util.HttpUtil;

import net.sf.json.JSONObject;

@Component("tagService")
public class TagServiceImpl implements TagService {
	
	private final static Logger logger = LoggerFactory.getLogger(TagServiceImpl.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private AccessTokenService accessTokenService;

	@Override
	public JSONObject createTag(String name) {
		Assert.notNull(name, "标签名不能为空!");
		String accessToken = accessTokenService.getAccessToken();
		logger.info(">>>>>>>>>>>"+accessToken);
		Assert.notNull(accessToken, "access_token获取失败!");
		Map<String, String> params = new HashMap<>();
		params.put("name", name);
		Map<String, Map<String, String>> map = new HashMap<>();
		map.put("tag", params);
		HttpEntity<String> entity = HttpUtil.toJsonBody(map);
		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_CREATE, accessToken), entity, JSONObject.class).getBody();
	}

	@Override
	public JSONObject getTags() {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_GET, accessToken), null, JSONObject.class).getBody();
	}

	@Override
	public JSONObject editTag(int id, String name) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		Map<String, String> params = new HashMap<>();
		params.put("id", id + "");
		params.put("name", name);
		Map<String, Map<String, String>> map = new HashMap<>();
		map.put("tag", params);
		HttpEntity<String> entity = HttpUtil.toJsonBody(map);
		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_UPDATE, accessToken), entity, JSONObject.class).getBody();
	}

	@Override
	public JSONObject deleteTag(int id) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		JSONObject param = new JSONObject();
		JSONObject tag = new JSONObject();
		//tag.addProperty("id", id);
		//param.add("tag", tag);
		JSONObject object = tag.accumulate("tag", param.accumulate("id", id));
		logger.info(">>>>>>>>>>>>>>>>>"+object.toString());
		
		HttpEntity<String> entity = HttpUtil.makeBody(object.toString());
		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_DELETE, accessToken), entity, JSONObject.class).getBody();
	}

	@Override
	public JSONObject getFans(int tagId, String nextOpenId) {
//		String accessToken = accessTokenService.getAccessToken();
//		Assert.notNull(accessToken, "access_token获取失败!");
//		JSONObject param = new JSONObject();
//		param.addProperty("tagid", tagId);
//		param.addProperty("next_openid", StringUtils.isEmpty(nextOpenId)?"":nextOpenId);
//		Gson gson = new Gson();
//		HttpEntity<String> entity = HttpUtil.makeBody(gson.toJson(param));
//		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_FANS, accessToken), entity, JSONObject.class).getBody();
		return null;
	}

	@Override
	public JSONObject batchTag(List<String> openIds, int tagId) {
//		String accessToken = accessTokenService.getAccessToken();
//		Assert.notNull(accessToken, "access_token获取失败!");
//		Gson gson = new Gson();
//		JSONObject param = new JSONObject();
//		param.addProperty("tagid", tagId);
//		JsonArray jsonArray = new JsonArray();
//		for(String openId : openIds) {
//			jsonArray.add(openId);
//		}
//		param.add("openid_list", jsonArray);
//		HttpEntity<String> entity = HttpUtil.makeBody(gson.toJson(param));
//		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_BATCH_TAG, accessToken), entity, JSONObject.class).getBody();
		return null;
	}

	@Override
	public JSONObject batchUntag(List<String> openIds, int tagId) {
//		String accessToken = accessTokenService.getAccessToken();
//		Assert.notNull(accessToken, "access_token获取失败!");
//		Gson gson = new Gson();
//		JSONObject param = new JSONObject();
//		param.addProperty("tagid", tagId);
//		JsonArray jsonArray = new JsonArray();
//		for(String openId : openIds) {
//			jsonArray.add(openId);
//		}
//		param.add("openid_list", jsonArray);
//		HttpEntity<String> entity = HttpUtil.makeBody(gson.toJson(param));
//		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_BATCH_UNTAG, accessToken), entity, JSONObject.class).getBody();
		return null;
	}

	@Override
	public JSONObject getIdList(String openId) {
//		String accessToken = accessTokenService.getAccessToken();
//		Assert.notNull(accessToken, "access_token获取失败!");
//		Gson gson = new Gson();
//		JSONObject param = new JSONObject();
//		param.addProperty("openid", openId);
//		HttpEntity<String> entity = HttpUtil.makeBody(gson.toJson(param));
//		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_GET_LIST, accessToken), entity, JSONObject.class).getBody();
		return null;
	}

}
