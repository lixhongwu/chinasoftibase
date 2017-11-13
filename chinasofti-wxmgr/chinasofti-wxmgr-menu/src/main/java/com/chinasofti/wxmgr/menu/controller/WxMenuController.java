package com.chinasofti.wxmgr.menu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chinasofti.wxmgr.menu.service.AccessTokenService;
import com.chinasofti.wxmgr.menu.service.WxMenuservice;
import com.huateng.wxmgr.common.entity.WxMenu;

import net.sf.json.JSONObject;

/**
 * 
 * @ClassName: WxMenuController.java
 * @Description: TODO
 * @author 金林
 * @Date: 2017年11月8日 下午6:15:53
 * @parma <T>
 */
@RestController
@RequestMapping("/wxmenu")
public class WxMenuController {

	public final static Logger logger = LoggerFactory.getLogger(WxMenuController.class);

	public final String success = "200";
	public final String error = "130";

	@Autowired
	private WxMenuservice wxMenuService;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private AccessTokenService accessTokenService;

	/**
	 * 创建菜单。需要以post的形式将菜单数据发送给微信
	 */
	public final static String CREATE_MENU = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=%s";
	/**
	 * 获取分组列表
	 * @param wxMenu
	 * @return
	 */
	@RequestMapping(value="/grouplist", method =RequestMethod.POST)
	public JSONObject findGroupByPage(@RequestBody(required =false)WxMenu wxMenu){
		
		 
				JSONObject object = wxMenuService.findGroupByPage(wxMenu);
				return object;
		
	}

	/**
	 * 添加新的分组
	 * 
	 * @param wxMenu
	 * @return
	 */
	@RequestMapping(value = "/savegroup", method = RequestMethod.POST)
	public String addMenuGroup(@RequestBody(required = false) WxMenu wxMenu) {

		int i = wxMenuService.addMenu(wxMenu);
		if (i == 1) {
			return success;// 返回码200成功
		} else {
			return error;// 返回码130失败
		}

	}

	/**
	 * 删除菜单组
	 * 
	 * @param gid
	 * @return
	 */
	@RequestMapping(value = "/delgroup/{gid}", method = RequestMethod.GET)
	public String delMenuGroup(@PathVariable("gid") String gid) {

		try {
			wxMenuService.delMenuGroup(gid);
			return success;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return error;
		}
	}

	/**
	 * 添加菜单
	 * 
	 * @return
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String addMenu(@RequestBody(required = false) WxMenu wxMenu) {

		int i = wxMenuService.addMenu(wxMenu);
		if (i == 1) {
			return success;
		} else {
			return error;
		}

	}

	/**
	 * 将本地数据的的菜单更新到微信服务器
	 * 
	 * @param gid
	 * @return
	 */
	@RequestMapping(value = "/submitmenu/{gid}", method = RequestMethod.GET)
	public String submitMenu(@PathVariable("gid") String gid) {

		List<WxMenu> levelone = wxMenuService.getMenuByGid(gid);
		if (levelone == null || levelone.isEmpty()) {
			return "请先创建菜单";
		}
		// 将数据库的数据转成菜单的json格式。
		Map<String, Object> menuMap = new HashMap<String, Object>();
		List<Map<String, Object>> listOne = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < levelone.size(); i++) {
			Map<String, Object> menuone = new HashMap<String, Object>();
			WxMenu menu1 = levelone.get(i);
			menuone.put("name", menu1.getTitle());

			if (StringUtils.isBlank(menu1.getUrl())) {
				menuone.put("type", "click");
				menuone.put("key", menu1.getKeyword());
			} else {
				menuone.put("type", "view");
				menuone.put("url", menu1.getUrl());
			}

			// 查询前五个显示的二级菜单
			List<Map<String, Object>> listTwo = new ArrayList<Map<String, Object>>();
			List<WxMenu> leveltwo = wxMenuService.getMenuByPid(menu1.getIds());
			for (int j = 0; j < leveltwo.size(); j++) {
				Map<String, Object> menutwo = new HashMap<String, Object>();
				WxMenu menu2 = leveltwo.get(j);
				menutwo.put("name", menu2.getTitle());

				if (StringUtils.isBlank(menu2.getUrl())) {
					menutwo.put("type", "click");
					menutwo.put("key", menu2.getKeyword());
				} else {
					menutwo.put("type", "view");
					menutwo.put("url", menu2.getUrl());
				}

				listTwo.add(menutwo);
			}
			menuone.put("sub_button", listTwo);
			listOne.add(menuone);
		}

		menuMap.put("button", listOne);
		JSONObject json = JSONObject.fromObject(menuMap);
		String accessToken = accessTokenService.getAccessToken();
		System.out.println("accessToken"+accessToken);
		if (StringUtils.isEmpty(accessToken)) {
			logger.error("获取AccessToken出现异常!");
			return "获取AccessToken异常，请求失败!";
		} else {

			HttpEntity<String> entity = makeEntity(json.toString());
			String url = String.format(CREATE_MENU, accessToken);
			JSONObject response = restTemplate.postForEntity(url, entity, JSONObject.class).getBody();
			if (response != null && response.size() > 0) {
				if (response.has("errcode")) {
					return response.get("errcode").toString().equals("0")
							? "Menu init finish, please wait or re-follow." : response.get("errmsg").toString();
				} else {
					return "响应数据" + response.toString() + "不合法.";
				}
			} else {
				return "请求响应为空！";
			}
		}

	}

	private HttpEntity<String> makeEntity(String json) {
		// 封装请求头，设置MediaType为json
		HttpHeaders headers = new HttpHeaders();
		// MediaType type = MediaType.parseMediaType("application/json;
		// charset=UTF-8");
		// headers.setContentType(type);
		// headers.add("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
		headers.set("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		return new HttpEntity<String>(json, headers);

	}
}
