package com.huateng.wxmgr.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huateng.wxmgr.common.entity.WxMenu;
import com.huateng.wxmgr.web.feign.MenuFeign;

@RestController
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuFeign menufeign;
	
	@RequestMapping("/menu")
	public  ModelAndView getView(){
		return new ModelAndView("menu/menu");
		
	}
	
	@RequestMapping("/select/{id}")
	public WxMenu selectByPrimaryKey(@PathVariable String id){
		
		return menufeign.findById(id);
		
	}

}
