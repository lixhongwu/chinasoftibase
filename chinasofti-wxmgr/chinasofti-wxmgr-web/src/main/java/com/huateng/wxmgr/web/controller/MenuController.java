package com.huateng.wxmgr.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huateng.wxmgr.common.entity.WxMenu;
import com.huateng.wxmgr.web.feign.MenuFeign;

@RestController
@RequestMapping("/wxmenu")
public class MenuController {
	
	@Autowired
	private MenuFeign menufeign;

	@RequestMapping("/menu")
	public ModelAndView getView() {
		return new ModelAndView("menu/menu");
	}

	@RequestMapping("/select/{gid}")
	public WxMenu selectByPrimaryKey(@PathVariable("gid") String id) {
		return menufeign.findById(id);
	}

	@RequestMapping(value = "/grouplist", method = RequestMethod.POST)
	public String findGroupByPage(@RequestBody(required = false) WxMenu wxMenu) {
		return menufeign.findGroupByPage(wxMenu).toString();

	}

}
