package com.chinasofti.sp.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.sp.goods.entity.SpParameterManage;
import com.chinasofti.sp.goods.service.SpParamenterService;
/**
 * 参数配置查询
 * @author hasee
 *
 */
@RequestMapping("param")//http后面跟的第一个参数，用来区分不同的controller
@RestController
public class SpParamterController {
     
	@Autowired
	SpParamenterService spparamservice;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<SpParameterManage> selectParamenter(){
		return spparamservice.selectParamenter();
	}
	
   @RequestMapping("/select/{ids}")
	@ResponseBody
	public SpParameterManage queryByID(@PathVariable int ids) {
		return spparamservice.queryByID(ids);
	}
}
