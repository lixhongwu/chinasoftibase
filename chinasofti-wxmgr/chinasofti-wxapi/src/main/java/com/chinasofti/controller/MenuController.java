package com.chinasofti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jfinal.weixin.sdk.api.MenuApi;

public class MenuController {
	@RequestMapping("/index")
	public ModelAndView getview(){
		MenuApi
		return new ModelAndView("index");
	}
}
