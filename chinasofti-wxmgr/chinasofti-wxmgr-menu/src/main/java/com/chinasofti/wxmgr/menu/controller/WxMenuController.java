package com.chinasofti.wxmgr.menu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.wxmgr.menu.service.WxMenuService;

@RestController
@RequestMapping("/wxmenu")
public class WxMenuController {
	
	@Autowired
	private WxMenuService wxMenuService;

}
