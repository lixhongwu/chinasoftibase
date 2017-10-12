package com.chinasofti.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
	
	 @RequestMapping("/main")
		public ModelAndView getview() {
			return  new ModelAndView("main");
		}
	
}
