package com.chinasofti.wxmgr.menu.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chinasofti.wxmgr.menu.service.AccessTokenService;
import com.chinasofti.wxmgr.menu.service.WxMenuservice;
import com.huateng.wxmgr.common.entity.WxMenu;
import com.huateng.wxmgr.common.utils.Constant;

import net.sf.json.JSONArray;
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

	@Autowired
	private WxMenuservice wxMenuService;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private AccessTokenService accessTokenService;

	/**
	 * 创建一级菜单
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/createLevelOneMenu", method = RequestMethod.POST)
	public String createLevelOneMenu(@RequestParam Map<String, String> map) {
		map.put("level", "1");
		return addMenu(map);

	}

	/**
	 * 创建二级菜单
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/createLevelTwoMenu", method = RequestMethod.POST)
	public String createLevelTwoMenu(@RequestParam Map<String, String> map) {
		// 判断其一级菜单是否已经有二级菜单
		boolean flag = wxMenuService.findLevelTwoMenuByPid(map.get("pid"));
		// 获取一级菜单
		if (!flag) {
			WxMenu levelOneMenu = wxMenuService.findLevelOneMenuById(map.get("pid"));
			// 清空一级菜单数据
			levelOneMenu.setKeyword("");
			levelOneMenu.setUrl("");
			wxMenuService.updateMenu(levelOneMenu);
		}

		map.put("level", "2");
		return addMenu(map);

	}

	/**
	 * 创建菜单的方法
	 * 
	 * @param map
	 * @return
	 */
	private String addMenu(Map<String, String> map) {
		WxMenu wxMenu = new WxMenu();
		try {
			BeanUtils.populate(wxMenu, map);
			int i = wxMenuService.createMenu(wxMenu);

			return i == 1 ? Constant.SUCCESS : Constant.ERROR;

		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Constant.ERROR;
		}
	}

	/**
	 * 获取菜单
	 * 
	 * @param gid
	 * @return
	 */
	@RequestMapping(value = "/menulist/{gid}", method = RequestMethod.GET)
	public String findMenu(@PathVariable("gid") String gid) {
		// 获取一级菜单
		List<WxMenu> levelOne = wxMenuService.findLevelOne(gid);
		if (levelOne == null || levelOne.isEmpty()) {
			return "[]";
		} else {
			// 遍历获取二级菜单
			for (int x = 1; x <= levelOne.size(); x++) {
				WxMenu levelOneMenu = levelOne.get(x - 1);
				// 封装treegrid属性
				levelOneMenu.setId(x);
				// 获取一级菜单下的二级菜单
				List<WxMenu> levelTwo = wxMenuService.getMenuByPid(levelOneMenu.getIds());

				if (levelTwo != null || levelTwo.size() > 0) {
					for (int y = 1; y <= levelTwo.size(); y++) {
						WxMenu levelTwoMenu = levelTwo.get(y - 1);

						levelTwoMenu.setId(10 * x + y);
					}
				}
				levelOneMenu.setChildren(levelTwo);
			}
		}
		JSONArray arr = new JSONArray();
		JSONArray jsonArray = arr.fromObject(levelOne);
		return jsonArray.toString();
	}

	/**
	 * 获取菜单组列表
	 * 
	 * @param wxMenu
	 * @return
	 */
	@RequestMapping(value = "/grouplist")
	public JSONObject findGroupByPage() {

		JSONObject object = wxMenuService.findGroupByPage();
		return object;
	}

	/**
	 * 更新菜单组
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/updatemenugroup", method = RequestMethod.POST)
	public String updateMenuGroup(@RequestParam Map<String, String> map) {
		int i = wxMenuService.updateMenuGroup(map);
		return i == 1 ? Constant.SUCCESS : Constant.ERROR;
	}

	/**
	 * 添加新的分组
	 * 
	 * @param wxMenu
	 * @return
	 */

	@RequestMapping(value = "/addmenugroup", method = RequestMethod.POST)
	public String addMenuGroup(@RequestParam Map<String, String> menuMap) {

		int i = wxMenuService.addMenuGroup(menuMap);
		if (i == 1) {
			return Constant.SUCCESS;
		} else {
			return Constant.ERROR;
		}
	}

	// @RequestMapping(value = "/savegroup", method = RequestMethod.POST)
	// public String addMenuGroup(@RequestBody WxMenu wxMenu) {
	// int i = wxMenuService.addMenuGroup(wxMenu);
	// if (i == 1) {
	// return Constant.SUCCESS;// 返回码200成功
	// } else {
	// return error;// 返回码130失败
	// }
	// }

	/**
	 * 删除菜单组
	 * 
	 * @param gid
	 * @return
	 */
	@RequestMapping(value = "/delgroupmenu/{gid}", method = RequestMethod.GET)
	public String delMenuGroup(@PathVariable("gid") String ids) {

		try {
			wxMenuService.delMenuGroup(ids);
			return Constant.SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return Constant.ERROR;
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
		System.out.println("accessToken" + accessToken);
		if (StringUtils.isEmpty(accessToken)) {
			logger.error("获取AccessToken出现异常!");
			return "获取AccessToken异常，请求失败!";
		} else {

			HttpEntity<String> entity = makeEntity(json.toString());
			String url = String.format(Constant.CREATE_MENU, accessToken);
			JSONObject response = restTemplate.postForEntity(url, entity, JSONObject.class).getBody();
			if (response != null && response.size() > 0) {
				if (response.has("errcode")) {
					String err = response.get("errcode").toString().equals("0")
							? "Menu init finish, please wait or re-follow." : response.get("errmsg").toString();
					logger.info(err);
					;
					return Constant.SUCCESS;
				} else {
					logger.error("响应数据" + response.toString() + "不合法.");
					return Constant.ERROR;
				}
			} else {
				logger.error("请求响应为空！");
				return Constant.ERROR;
			}
		}

	}

	private HttpEntity<String> makeEntity(String json) {
		// 封装请求头，设置MediaType为json
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
		// MediaType type = MediaType.parseMediaType("application/json;
		// charset=UTF-8");
		// headers.setContentType(type);
		// headers.add("Accept", MediaType.APPLICATION_JSON_UTF8_VALUE);
		return new HttpEntity<String>(json, headers);

	}
}
