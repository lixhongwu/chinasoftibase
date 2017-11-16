package com.huateng.wxmgr.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huateng.wxmgr.web.feign.MaterialFeignClient;


@RestController
@RequestMapping("wxmaterial")
public class MaterialController {

	@Autowired
	private MaterialFeignClient materialFeignClient;

	@RequestMapping("/material")
	public ModelAndView getView() {
		return new ModelAndView("material/material");
	}

	@RequestMapping(value="/getlist",method=RequestMethod.POST)
	@ResponseBody
	public String listAll(){
		String listAll = materialFeignClient.listAll();
		System.out.println(listAll);
		return listAll;
	}
}
