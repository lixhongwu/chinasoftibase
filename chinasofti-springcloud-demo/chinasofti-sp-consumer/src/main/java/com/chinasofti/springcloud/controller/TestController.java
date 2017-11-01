package com.chinasofti.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/test")
@Api("web测试api")
public class TestController {

	@ResponseBody
	@RequestMapping(value="/list",method=RequestMethod.POST)
	@ApiOperation(value="获取测试数据", notes="测试接口详细描述……")
	public void getTest(){
		
	}
}
