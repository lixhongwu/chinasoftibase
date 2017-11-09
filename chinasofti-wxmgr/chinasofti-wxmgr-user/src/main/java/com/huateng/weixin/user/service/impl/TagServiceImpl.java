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

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huateng.weixin.user.service.AccessTokenService;
import com.huateng.weixin.user.service.TagService;
import com.huateng.weixin.user.util.Constraints;
import com.huateng.weixin.user.util.HttpUtil;

@Component("tagService")
public class TagServiceImpl implements TagService {
	
	private final static Logger logger = LoggerFactory.getLogger(TagServiceImpl.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private AccessTokenService accessTokenService;

	@Override
	public JsonObject createTag(String name) {
		Assert.notNull(name, "标签名不能为空!");
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		Map<String, String> params = new HashMap<>();
		params.put("name", name);
		Map<String, Map<String, String>> map = new HashMap<>();
		map.put("tag", params);
		HttpEntity<String> entity = HttpUtil.toJsonBody(map);
		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_CREATE, accessToken), entity, JsonObject.class).getBody();
	}

	@Override
	public JsonObject getTags() {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_GET, accessToken), null, JsonObject.class).getBody();
	}

	@Override
	public JsonObject editTag(int id, String name) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		Map<String, String> params = new HashMap<>();
		params.put("id", id + "");
		params.put("name", name);
		Map<String, Map<String, String>> map = new HashMap<>();
		map.put("tag", params);
		HttpEntity<String> entity = HttpUtil.toJsonBody(map);
		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_UPDATE, accessToken), entity, JsonObject.class).getBody();
	}

	@Override
	public JsonObject deleteTag(int id) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		JsonObject param = new JsonObject();
		JsonObject tag = new JsonObject();
		tag.addProperty("id", id);
		param.add("tag", tag);
		Gson gson = new Gson();
		HttpEntity<String> entity = HttpUtil.makeBody(gson.toJson(param));
		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_DELETE, accessToken), entity, JsonObject.class).getBody();
	}

	@Override
	public JsonObject getFans(int tagId, String nextOpenId) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		JsonObject param = new JsonObject();
		param.addProperty("tagid", tagId);
		param.addProperty("next_openid", StringUtils.isEmpty(nextOpenId)?"":nextOpenId);
		Gson gson = new Gson();
		HttpEntity<String> entity = HttpUtil.makeBody(gson.toJson(param));
		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_FANS, accessToken), entity, JsonObject.class).getBody();
	}

	@Override
	public JsonObject batchTag(List<String> openIds, int tagId) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		Gson gson = new Gson();
		JsonObject param = new JsonObject();
		param.addProperty("tagid", tagId);
		JsonArray jsonArray = new JsonArray();
		for(String openId : openIds) {
			jsonArray.add(openId);
		}
		param.add("openid_list", jsonArray);
		HttpEntity<String> entity = HttpUtil.makeBody(gson.toJson(param));
		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_BATCH_TAG, accessToken), entity, JsonObject.class).getBody();
	}

	@Override
	public JsonObject batchUntag(List<String> openIds, int tagId) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		Gson gson = new Gson();
		JsonObject param = new JsonObject();
		param.addProperty("tagid", tagId);
		JsonArray jsonArray = new JsonArray();
		for(String openId : openIds) {
			jsonArray.add(openId);
		}
		param.add("openid_list", jsonArray);
		HttpEntity<String> entity = HttpUtil.makeBody(gson.toJson(param));
		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_BATCH_UNTAG, accessToken), entity, JsonObject.class).getBody();
	}

	@Override
	public JsonObject getIdList(String openId) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		Gson gson = new Gson();
		JsonObject param = new JsonObject();
		param.addProperty("openid", openId);
		HttpEntity<String> entity = HttpUtil.makeBody(gson.toJson(param));
		return restTemplate.postForEntity(String.format(Constraints.urls.TAG_GET_LIST, accessToken), entity, JsonObject.class).getBody();
	}

}
