package com.chinasofti.wxmgr.menu.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.wxmgr.menu.service.WxMenuService;
import com.huateng.wxmgr.common.entity.WxMenu;
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
	
	/**
	 * 创建菜单。需要以post的形式将菜单数据发送给微信
	 */
	public final static String CREATE_MENU = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=%s";
	
	
	@Autowired
	private WxMenuService wxMenuService;
	
	
	/**
	 * 更新菜单到微信服务器
	 * @param gid
	 * @return
	 */
	@RequestMapping("/submitmenu/{gid}")
	public String submitmenu(@PathVariable("gid")String gid){
	//@RequestMapping("/submitmenu")
		//public String submitmenu(){
		/*urltoken = getPara(0);
		WxUser wxUser = AccountService.service.findByToken(urltoken);
		String pid = getPara(1);*/
		// 查询前三个显示的一级菜单
		//List<WxMenu> levelone = WxMenuService.service.getLevelOneMenus(urltoken,wxUser,pid);
		List<WxMenu> levelone=wxMenuService.getMenuByGid(gid);
		if (levelone==null || levelone.isEmpty()) {
			return "请先创建菜单";
		}
		Map<String,Object> menuMap = new HashMap<String, Object>();
		List<Map<String, Object>> listOne = new ArrayList<Map<String,Object>>();
		for (int i = 0; i < levelone.size(); i++) {
			Map<String,Object> menuone = new HashMap<String, Object>();
			WxMenu menu1 = levelone.get(i);
			menuone.put("name", menu1.getTitle());
			
			if (StringUtils.isBlank(menu1.getUrl())) {
				menuone.put("type", "click");
				menuone.put("key", menu1.getKeyword());
			}else{
				menuone.put("type", "view");
				menuone.put("url", menu1.getUrl());
			}
			
			// 查询前五个显示的二级菜单
			List<Map<String, Object>> listTwo = new ArrayList<Map<String,Object>>();
			List<WxMenu> leveltwo = wxMenuService.getMenuByPid(menu1.getIds());
			for (int j = 0; j < leveltwo.size(); j++) {
				Map<String,Object> menutwo = new HashMap<String, Object>();
				WxMenu menu2 = leveltwo.get(j);
				menutwo.put("name", menu2.getTitle());
				
				if (StringUtils.isBlank(menu2.getUrl())) {
					menutwo.put("type", "click");
					menutwo.put("key", menu2.getKeyword());
				}else{
					menutwo.put("type", "view");
					menutwo.put("url", menu2.getUrl());
				}
				
				listTwo.add(menutwo);
			}
			menuone.put("sub_button", listTwo);
			listOne.add(menuone);
		}
		
		menuMap.put("button", listOne);
		
		return JsonKit.toJson(menuMap);
		
		
		/*ApiConfig ac = ApiConfigService.service.getApiConfig("");
		ApiConfigKit.setThreadLocalApiConfig(ac);
		ApiResult result = MenuApi.createMenu(JsonKit.toJson(menuMap));
		if (result.isSucceed()) {
			WxMenuService.service.setUsingMenu(pid);
			
			renderText("1");
		}else{
			renderText(result.getErrorMsg());
		}*/
	}
}
