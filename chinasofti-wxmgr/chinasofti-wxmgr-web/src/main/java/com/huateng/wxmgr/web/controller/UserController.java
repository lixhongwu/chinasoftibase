package com.huateng.wxmgr.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huateng.wxmgr.web.feign.UserFeign;

@RestController
@RequestMapping("/wxuser")
public class UserController {
	
	@Autowired
	private UserFeign userFeign;
	
	/**
	 * 跳转页面
	 * @return
	 */
	@RequestMapping("/user")
	public ModelAndView getView(){
		return new ModelAndView("user/user");
		
	}
	/**
	 * 分页条件查询
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/findusersbypage",method=RequestMethod.POST)
	public String findUsersByPage(@RequestParam Map<String,String> map){
		
		return userFeign.findTagsByPage(map);
		
	}
	/**
	 * 同步用户到本地数据库
	 * @return
	 */
	@RequestMapping(value="/synchrousers")
	public String synchroUsers(){
		return userFeign.synchroUsers();
		
	}
	
	

}
