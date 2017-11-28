package com.huateng.weixin.user.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import com.huateng.weixin.user.service.AccessTokenService;
import com.huateng.weixin.user.service.UserService;
import com.huateng.weixin.user.util.HttpUtil;
import com.huateng.wxmgr.common.entity.WxUserFans;
import com.huateng.wxmgr.common.entity.WxUserOpenId;
import com.huateng.wxmgr.common.utils.Constant;
import com.huateng.wxmgr.common.utils.ResultUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserModalServiceImpl.class);

	@Autowired
	private AccessTokenService accessTokenService;
	@Autowired
	private RestTemplate restTemplate;

	private WxUserOpenId usersAllOpenId = null;

	/**
	 * 获取用户openId列表一次。nextOpenId为空时，表示从头开始获取，一次最多能获取到10000个。
	 */
	public WxUserOpenId getUsersOpenId(String nextOpenId) {
		String access_token = accessTokenService.getAccessToken();
		Assert.notNull(access_token, "access_token获取异常");
		logger.info(access_token);
		if (nextOpenId == null) {
			nextOpenId = "";
		}
		String url = String.format(Constant.USERS_GET, access_token, nextOpenId);
		JSONObject result = restTemplate.getForObject(url, JSONObject.class);
		logger.info("getUsers>>result>>>>>>>>>>>>>>>>>" + result);
		if (ResultUtils.Result(result)) {
			WxUserOpenId userOpenId = new WxUserOpenId();
			int total = result.getInt("total");
			int count = result.getInt("count");
			String next_openid = result.getString("next_openid");
			JSONArray jsonArray = result.getJSONObject("data").getJSONArray("openid");
			@SuppressWarnings("unchecked")
			List<String> list = (List<String>) JSONArray.toCollection(jsonArray, String.class);
			userOpenId.setCount(count);
			userOpenId.setTotal(total);
			userOpenId.setNext_openid(next_openid);
			userOpenId.setOpenidList(list);
			return userOpenId;
		}
		return null;
	}

	/**
	 * 获取所有的openid;
	 */
	@Override
	public WxUserOpenId getAllUsersOpenId(String nextOpenId) {

		if (nextOpenId == null) {
			nextOpenId = "";
		}
		WxUserOpenId usersOpenId = getUsersOpenId(nextOpenId);

		int count = usersOpenId.getCount();
		int total = usersOpenId.getTotal();
		List<String> list = usersOpenId.getOpenidList();
		if (usersAllOpenId == null) {
			usersAllOpenId = new WxUserOpenId();
			usersAllOpenId.setTotal(total);
			usersAllOpenId.setCount(count);
			usersAllOpenId.setOpenidList(list);
		} else {
			int countAll = usersAllOpenId.getCount() + count;
			List<String> listAll = usersAllOpenId.getOpenidList();
			listAll.addAll(list);
			usersAllOpenId.setCount(countAll);
			usersAllOpenId.setOpenidList(listAll);
		}
		if (usersOpenId.getCount() < 10000) {
			return usersAllOpenId;
		} else {
			String next_openid = usersOpenId.getNext_openid();
			getAllUsersOpenId(next_openid);
		}
		return usersAllOpenId;
	}

	/**
	 * 获取单个用户的用户信息。
	 */
	@Override
	public WxUserFans getUserInfo(String nextOpenId) {

		String access_token = accessTokenService.getAccessToken();
		Assert.notNull(access_token, "access_token>>>>>>>>>>>>获取异常");
		Assert.notNull(nextOpenId, "getUserInfo>>>>>>>>>>nextOpenId不能为空" + nextOpenId);
		String url = String.format(Constant.USER_GET_INFO, access_token, nextOpenId);
		JSONObject result = restTemplate.getForObject(url, JSONObject.class);
		if (ResultUtils.Result(result)) {
			logger.info("getUserInfo>>>>>>>>>>>>>>>>>>>>>>result=" + result.toString());
			@SuppressWarnings("static-access")
			WxUserFans wxUserFans = (WxUserFans) result.toBean(result, WxUserFans.class);
			Long subscribeTime = Long.parseLong(wxUserFans.getSubscribeTime());
			String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date(subscribeTime * 1000));
			logger.info("date>>>>>>>>>>>>>>>>>>>" + date);
			return wxUserFans;
		}
		return null;
	}

	/**
	 * 批量获取用户信息,每次最多能获取100个用户信息,如果传入的openidList大于100条，则取前100条.
	 * 
	 * @param openidList
	 * @return
	 */
	public List<WxUserFans> getUsersInfo(List<String> openidList) {

		String access_token = accessTokenService.getAccessToken();
		Assert.notNull(access_token, "access_token>>>>>>>>>>>>>>>>>获取异常");
		String url = String.format(Constant.USERS_BATCHGET_INFO, access_token);
		JSONArray openids = new JSONArray();
		JSONObject userList = new JSONObject();
		if (openidList != null && openidList.size() > 0) {
			for (int i = 0; i < openidList.size() && i < 100; i++) {
				JSONObject openid = new JSONObject();
				openid.accumulate("openid", openidList.get(i));
				openid.accumulate("lang", "zh_CN");
				openids.add(openid);
			}
			userList.put("user_list", openids);
			HttpEntity<String> entity = HttpUtil.makeBody(userList.toString());
			JSONObject result = restTemplate.postForEntity(url, entity, JSONObject.class).getBody();
			logger.info("JSONObject result>>>>>>>>>>>>>>>>>>>>>>>>>>>=" + result.toString());
			JSONArray array = result.getJSONArray("user_info_list");
			@SuppressWarnings("unchecked")
			List<WxUserFans> list = (List<WxUserFans>) JSONArray.toCollection(array, WxUserFans.class);
			for (WxUserFans wxUserFans : list) {
				Long subscribeTime = Long.parseLong(wxUserFans.getSubscribeTime());
				String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date(subscribeTime * 1000));
				wxUserFans.setSubscribeTime(date);
			}
			return list;
		}
		return null;
	}

	/**
	 * 批量获取所有用户信息.
	 * 
	 * @param openidList
	 * @return
	 */
	@Override
	public List<WxUserFans> getAllUsersInfo(List<String> openidList) {

		if (openidList != null && openidList.size() > 0) {
			int i = openidList.size();
			int j = i / 100;
			List<WxUserFans> allList = new ArrayList<>();
			for (int x = 0; x < j + 1; x++) {
				List<WxUserFans> list1 = null;
				list1 = getUsersInfo(openidList);
				if (openidList.size() > 100) {
					openidList = openidList.subList(100, openidList.size());
				}
				allList.addAll(list1);
			}
			logger.info(">>>>>>>>>>>>>>>" + allList.toString());
			return allList;
		}
		return null;
	}

	/**
	 * 给用户添加备注
	 */
	@Override
	public JSONObject addRemark(Map<String, String> map) {

		if (map != null && map.size() > 0) {
			String ids = map.get("ids");
			String remark = map.get("remark");
			if (StringUtils.isNotEmpty(ids)) {
				String access_token = accessTokenService.getAccessToken();
				if (StringUtils.isNotEmpty(access_token)) {
					String url = String.format(Constant.USER_REMARK_NAME, access_token);
					// 封装请求的json
					JSONObject object = new JSONObject();
					object.accumulate("openid", ids);
					object.accumulate("remark", remark);
					//发送请求
					HttpEntity<String> entity = HttpUtil.toJsonBody(object);
					JSONObject result = restTemplate.postForEntity(url, entity, JSONObject.class).getBody();
					return result;
				}
			}
		}
		return null;
	}

}
