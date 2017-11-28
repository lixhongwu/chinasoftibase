package com.huateng.wxmgr.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huateng.wxmgr.web.feign.KefuFeignClient;

@RestController
@RequestMapping("wxkefu")
public class KefuController {

	private static Logger log = LoggerFactory.getLogger(KefuController.class);
	@Autowired
	private KefuFeignClient kefuFeignClient;

	@RequestMapping("/kefu") 
	public ModelAndView getView() {
		return new ModelAndView("kefu/kefu");
	} 
	
}
