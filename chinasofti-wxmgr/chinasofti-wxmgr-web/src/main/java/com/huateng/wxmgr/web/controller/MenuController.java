package com.huateng.wxmgr.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huateng.wxmgr.common.entity.WxMenu;
import com.huateng.wxmgr.web.feign.MenuFeign;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/wxmenu")
public class MenuController {

	@Autowired
	private MenuFeign menufeign;

	@RequestMapping("/menu")
	public ModelAndView getView() {
		return new ModelAndView("menu/menu");
	}

	/**
	 * 通过分组id查菜单详情。
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/select/{gid}")
	public WxMenu selectByPrimaryKey(@PathVariable("gid") String id) {
		return menufeign.findById(id);
	}

	/**
	 * 查询所有的分组菜单
	 * 
	 * @return
	 */
	@RequestMapping(value = "/grouplist")
	public String findGroupByPage() {

		JSONObject object = menufeign.findGroupByPage();
		return object.toString();
	}

	/**
	 * 添加分组菜单
	 * 
	 * @param ptUser
	 * @return
	 */
//	 @RequestMapping(value = "/addmenugroup", method = RequestMethod.POST)
//	 public String addMenuGroup(@RequestBody(required=false) WxMenu wxMenu) {
//	 //wxMenu.setIds("112");
//	 return menufeign.addMenuGroup(wxMenu);
//	 }
	@RequestMapping(value = "/addmenugroup", method = RequestMethod.POST)
	public String addMenuGroup(@RequestParam Map<String, String> map) {
		return menufeign.addMenuGroup(map);

	}

	/**
	 * 删除分组菜单
	 * 
	 * @return
	 */
	@RequestMapping(value = "/deleteMenuGroup/{ids}")
	public String deleteMenuGroup(@PathVariable("ids") String ids) {
		return menufeign.deleteMenuGroup(ids);

	}

}
