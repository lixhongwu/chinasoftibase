package com.huateng.weixin.user.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

import com.huateng.weixin.user.service.AccessTokenService;
import com.huateng.weixin.user.service.TagService;
import com.huateng.wxmgr.common.utils.Constant;
import com.huateng.wxmgr.common.utils.HttpUtil;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
/**
 * 标签类，连接微信服务器。
 * @ClassName: TagServiceImpl.java
 * @Description: TODO
 * @author 金林
 * @Date: 2017年11月23日 上午11:47:22
 * @parma <T>
 */
@Service
public class TagServiceImpl implements TagService {

	private final static Logger logger = LoggerFactory.getLogger(TagServiceImpl.class);

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private AccessTokenService accessTokenService;
	/**
	 * 创建用户标签，并返回标签
	 */
	@Override
	public JSONObject createTag(String name) {
		String accessToken = accessTokenService.getAccessToken();
		logger.info(">>>>>>>>>>>" + accessToken);
		Assert.notNull(accessToken, "access_token获取失败!");
		Map<String, String> params = new HashMap<>();
		params.put("name", name);
		Map<String, Map<String, String>> map = new HashMap<>();
		map.put("tag", params);
		HttpEntity<String> entity = HttpUtil.toJsonBody(map);
		return restTemplate
				.postForEntity(String.format(Constant.urls.TAG_CREATE, accessToken), entity, JSONObject.class)
				.getBody();
	}
	/**
	 * 获取标签列表
	 */
	@Override
	public JSONObject getTags() {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		return restTemplate.postForEntity(String.format(Constant.urls.TAG_GET, accessToken), null, JSONObject.class)
				.getBody();
	}
	/**
	 * 编辑标签
	 */
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
		return restTemplate
				.postForEntity(String.format(Constant.urls.TAG_UPDATE, accessToken), entity, JSONObject.class)
				.getBody();
	}
	/**
	 * 删除标签
	 */
	@Override
	public JSONObject deleteTag(int id) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		JSONObject param = new JSONObject();
		JSONObject tag = new JSONObject();
		JSONObject object = tag.accumulate("tag", param.accumulate("id", id));
		HttpEntity<String> entity = HttpUtil.makeBody(object.toString());
		return restTemplate
				.postForEntity(String.format(Constant.urls.TAG_DELETE, accessToken), entity, JSONObject.class)
				.getBody();
	}
	/**
	 * 获取标签下的fans
	 */
	@Override
	public JSONObject getFans(int tagId, String nextOpenId) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		JSONObject param = new JSONObject();
		param.accumulate("tagid", tagId);
		param.accumulate("next_openid", StringUtils.isEmpty(nextOpenId) ? "" : nextOpenId);
		HttpEntity<String> entity = HttpUtil.makeBody(param.toString());
		return restTemplate
				.postForEntity(String.format(Constant.urls.TAG_FANS, accessToken), entity, JSONObject.class)
				.getBody();
	}
	/**
	 * 批量给用户添加标签
	 */
	@Override
	public JSONObject batchTag(List<String> openIds, int tagId) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		JSONObject param = new JSONObject();
		param.accumulate("tagid", tagId);
		JSONArray jsonArray = new JSONArray();

		for (String openId : openIds) {
			jsonArray.add(openId);
		}
		param.accumulate("openid_list", jsonArray);
		HttpEntity<String> entity = HttpUtil.makeBody(param.toString());
		return restTemplate
				.postForEntity(String.format(Constant.urls.TAG_BATCH_TAG, accessToken), entity, JSONObject.class)
				.getBody();
	}
	/**
	 * 批量解除标签
	 */
	@Override
	public JSONObject batchUntag(List<String> openIds, int tagId) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		JSONObject param = new JSONObject();
		param.accumulate("tagid", tagId);
		JSONArray jsonArray = new JSONArray();
		for (String openId : openIds) {
			jsonArray.add(openId);
		}
		param.accumulate("openid_list", jsonArray);

		HttpEntity<String> entity = HttpUtil.makeBody(param.toString());
		return restTemplate
				.postForEntity(String.format(Constant.urls.TAG_BATCH_UNTAG, accessToken), entity, JSONObject.class)
				.getBody();
	}
	
	@Override
	public JSONObject getIdList(String openId) {
		String accessToken = accessTokenService.getAccessToken();
		Assert.notNull(accessToken, "access_token获取失败!");
		JSONObject param = new JSONObject();
		param.accumulate("openid", openId);
		HttpEntity<String> entity = HttpUtil.makeBody(param.toString());
		return restTemplate
				.postForEntity(String.format(Constant.urls.TAG_GET_LIST, accessToken), entity, JSONObject.class)
				.getBody();
	}

}
