package com.chinasofti.cms.menu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.cms.menu.entity.CmsMenuManage;
import com.chinasofti.cms.menu.service.CmsMenuService;

@RestController
@RequestMapping("cmsmenu") 
public class CmsMenuController {
	
	//注入菜单管理service
	@Autowired
	private CmsMenuService cmsMenuService;

	
	
	 /**
     * 查询所有菜单项
     */
	@RequestMapping("/list")
	@ResponseBody
	public List<CmsMenuManage> findAll(){
		
		return cmsMenuService.findAll();
		
		
	}
}
