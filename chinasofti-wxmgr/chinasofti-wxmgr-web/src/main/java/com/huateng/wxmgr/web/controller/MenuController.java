package com.huateng.wxmgr.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/menu")
public class MenuController {
	
	@RequestMapping("/menu")
	public  ModelAndView getView(){
		return new ModelAndView("menu/menu");
		
	}

}
