package com.chinasofti.sp.goods.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.sp.goods.entity.SpParameterManage;
import com.chinasofti.sp.goods.service.SpParamenterService;
import com.google.gson.Gson;

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
   /**
    * 插入一条参数数据
    * @param postparam
    * @return
    */
   @RequestMapping(value="/add",method=RequestMethod.POST)
    public String ParamAdd(String postParmainfo) {
    	Gson gson=new Gson();
    	SpParameterManage params=gson.fromJson(postParmainfo, SpParameterManage.class);
    	spparamservice.insertParam(params);	
    	return "add";
    }
   /**
    * 删除一条参数数据
    * @param ids
    * @return
    */
   @RequestMapping(value="/delete/{ids}")
   public String DeleteParam(@PathVariable int ids) {
	   spparamservice.deleteParam(ids);
	   return "delete";
   }
   
   /**
    * 修改一条参数数据
    * @param postparam
    * @return
    */
   @RequestMapping(value="/update",method=RequestMethod.POST)
   public String UpdateParam(String postParmainfo) {
	   Gson gson=new Gson();
	   SpParameterManage param=gson.fromJson(postParmainfo, SpParameterManage.class);
	   spparamservice.updateParam(param);
	   return "update";
   }
   
}
