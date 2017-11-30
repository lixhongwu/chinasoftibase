package com.huateng.weixin.user.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.huateng.weixin.user.controller.WxUserController;
import com.huateng.weixin.user.service.impl.UserServiceImpl;
import com.huateng.wxmgr.common.entity.WxUserOpenId;
import com.huateng.wxmgr.common.utils.ResultUtils;

import net.sf.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserFansTests {
	
	private final static Logger logger=LoggerFactory.getLogger(UserFansTests.class) ;

	@Autowired
	private UserServiceImpl userService;
	
	@Autowired
	private WxUserController userController;
	
	/**
	 * 测试设置黑名单.
	 */
	@Test
	public void addBlackUser(){
		
		String ids="ofGuR1Nn6HszF0yehPRMUgAPaXFc,ofGuR1DgEw-ZMY8dckfNvOBh7UQU";
		userController.addBlackUsers(ids);
		
		
	}
	
	/**
	 * 测试取消黑名单.
	 */
	@Test
	public void unBlackUser(){
		
		String ids="ofGuR1Nn6HszF0yehPRMUgAPaXFc,ofGuR1DgEw-ZMY8dckfNvOBh7UQU";
		userController.addBlackUsers(ids);
		
		
	}
	
	
	

	/**
	 * 测试第一次获取openid ,输入最后一个nextopenid,返回空数组。
	 */
	@Test
	public void getUser() {
		String nextOpenId = "";
		WxUserOpenId usersOpenId = userService.getUsersOpenId(nextOpenId);
	}

	/**
	 * 测试获取所有用户openid
	 */
	@Test
	public void getAllUser() {
		String nextOpenId = "ofGuR1Ef7FTBQij5jwH99hn4KHJU";
		WxUserOpenId allUsersOpenId = userService.getAllUsersOpenId(nextOpenId);
		if(allUsersOpenId!=null){
			System.out.println(allUsersOpenId.toString());
		}else{
			logger.info(">>>>>>>>>>>>>>>>>>>>>>>返回为空");
		}
		
	}
	/**
	 * 测试获取用户信息
	 */
	@Test
	public void getUserInfo(){
		String nextOpenId ="ofGuR1Nn6HszF0yehPRMUgAPaXFc";
		userService.getUserInfo(nextOpenId);
		
	}
	/**
	 * 测试获取用户信息
	 */
	@Test
	public void getUsersInfo(){
		
		List<String> openIds = new ArrayList<>(4);
		openIds.add("ofGuR1Nn6HszF0yehPRMUgAPaXFc");
		openIds.add("ofGuR1BSon1Ee9WWqCxtRE-BM3d4");
		openIds.add("ofGuR1DgEw-ZMY8dckfNvOBh7UQU");
		openIds.add("ofGuR1JrCgblDGQEi4TGudLH_x4Y");
		userService.getUsersInfo(openIds);
	}
	/**
	 * 测试获取所有的用户信息
	 */
	@Test
	public void getAllUsersInfo(){
		List<String> openIds = new ArrayList<>(4);
		openIds.add("ofGuR1Nn6HszF0yehPRMUgAPaXFc");
		openIds.add("ofGuR1BSon1Ee9WWqCxtRE-BM3d4");
		openIds.add("ofGuR1DgEw-ZMY8dckfNvOBh7UQU");
		openIds.add("ofGuR1JrCgblDGQEi4TGudLH_x4Y");
		userService.getAllUsersInfo(openIds);
	}
	/**
	 * 测试设置黑名单
	 */
	@Test
	public void setBlackUser(){
		List<String> openIds = new ArrayList<>(4);
		openIds.add("ofGuR1Nn6HszF0yehPRMUgAPaXFc");
		openIds.add("ofGuR1BSon1Ee9WWqCxtRE-BM3d4");
		openIds.add("ofGuR1DgEw-ZMY8dckfNvOBh7UQU");
		openIds.add("ofGuR1JrCgblDGQEi4TGudLH_x4Y");
		JSONObject result = userService.setBlackUsers(openIds);
		logger.info(result.toString());
	}
	
	/**
	 * 测试获取黑名单列表  //输入最后一个nextopenid,不是返回空，而是返回该openid.
	 */
	@Test
	public void getBlackUsers(){
		
		List<String> list = userService.getBlackUsers("ofGuR1JrCgblDGQEi4TGudLH_x4Y");
		logger.info(list.toString());
	}
	/**
	 * 测试获取所有的黑名单
	 */
	@Test
	public void getAllBlackUsers(){
		
		List<String> list = userService.getAllBlackUsers(null);
		logger.info(list.toString());
		
	}
	
	/**
	 * 解除黑名单
	 */
	@Test
	public void unBlackUsers(){
		
		List<String> openIds = new ArrayList<>(4);
		openIds.add("ofGuR1HpeLgXqE7UiMDbsuiQj74k");
		openIds.add("ofGuR1Nn6HszF0yehPRMUgAPaXFc");
		openIds.add("ofGuR1BSon1Ee9WWqCxtRE-BM3d4");
		JSONObject result = userService.unBlackUsers(openIds);
		logger.info(result.toString());
		ResultUtils.Result(result);
		
		
	}
	
	
	
	
}
