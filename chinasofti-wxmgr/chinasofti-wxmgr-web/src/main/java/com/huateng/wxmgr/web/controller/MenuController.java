package com.huateng.wxmgr.web.controller;

import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	/**
	 * 跳转菜单组页面
	 * @return
	 */
	@RequestMapping("/menugroup")
	public ModelAndView getView() {
		return new ModelAndView("menu/menugroup");
	}
	/**
	 * 将菜单更新到微信服务器
	 * @param gid
	 * @return
	 */
	@RequestMapping(value="/submitmenu/{gid}",method=RequestMethod.POST)
	public String submitMenu(@PathVariable String gid){
		return menufeign.submitMenu(gid);
		
	}
	
	/**
	 * 更新菜单
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/updatamenu",method=RequestMethod.POST)
	public String updataMenu(@RequestParam Map<String,String> map){
		return menufeign.updataMenu(map);
		
	}
	/**
	 * 获取该组菜单
	 * @param gid
	 * @return
	 */
	@RequestMapping(value = "/menulist/{gid}",method=RequestMethod.GET)
	public String findMenu(@PathVariable("gid") String gid) {
		return menufeign.findMenu(gid);
		
	}
	/**
	 * 添加一级菜单
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/addlevelonemenu",method =RequestMethod.POST)
	public String addLevelOneMenu(@RequestParam Map<String,String> map){
		return menufeign.addLevelOneMenu(map);
		
	}
	
	/**
	 * 添加二级菜单
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/addleveltwomenu",method =RequestMethod.POST)
	public String addLevelTwoMenu(@RequestParam Map<String,String> map){
		return menufeign.addLevelTwoMenu(map);
		
	}
	/**
	 * 删除菜单
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/deletemenu/{ids}",method=RequestMethod.POST)
	public String deleteMenu(@PathVariable("ids") String ids){
		return menufeign.deleteMenu(ids);
		
	}

	/**
	 * 通过分组id查菜单详情。
	 * 
	 * @param id
	 * @return
	 */
//	@RequestMapping("/select/{gid}")
//	public WxMenu selectByPrimaryKey(@PathVariable("gid") String id) {
//		return menufeign.findById(id);
//	}

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
	
	/**
	 * 更新菜单组
	 * @return
	 */
	@RequestMapping(value="/updatemenugroup" ,method= RequestMethod.POST)
	public String updateMenuGroup(@RequestParam Map<String,String> map){
		return menufeign.updateMenuGroup(map);
	}

}
