package com.huateng.wxmgr.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

	@RequestMapping("/index")
	public ModelAndView getview(){
		return new ModelAndView("index");
	}
}
