package com.huateng.weixin.user.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.huateng.weixin.user.service.impl.UserServiceImpl;
import com.huateng.wxmgr.common.entity.WxUserOpenId;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserFansTests {

	@Autowired
	private UserServiceImpl userService;

	/**
	 * 测试第一次获取openid
	 */
	@Test
	public void getUser() {
		String nextOpenId = null;
		userService.getUsersOpenId(nextOpenId);
	}

	/**
	 * 测试获取所有用户openid
	 */
	@Test
	public void getAllUser() {
		String nextOpenId = null;
		WxUserOpenId allUsersOpenId = userService.getAllUsersOpenId(nextOpenId);
		System.out.println(allUsersOpenId.toString());
	}
	/**
	 * 测试获取用户信息
	 */
	@Test
	public void getUserInfo(){
		String nextOpenId ="ofGuR1Nn6HszF0yehPRMUgAPaXFc";
		userService.getUserInfo(nextOpenId);
		
	}
	
	@Test
	public void getUsersInfo(){
		
		List<String> openIds = new ArrayList<>(4);
		openIds.add("ofGuR1Nn6HszF0yehPRMUgAPaXFc");
		openIds.add("ofGuR1BSon1Ee9WWqCxtRE-BM3d4");
		openIds.add("ofGuR1DgEw-ZMY8dckfNvOBh7UQU");
		openIds.add("ofGuR1JrCgblDGQEi4TGudLH_x4Y");
		userService.getUsersInfo(openIds);
	}
	
	@Test
	public void getAllUsersInfo(){
//		List<String> list =new ArrayList<>();
//		for (int i = 0; i < 213; i++) {
//			list.add(""+i);
//		}List<String> openIds = new ArrayList<>(4);
		List<String> openIds = new ArrayList<>(4);
		openIds.add("ofGuR1Nn6HszF0yehPRMUgAPaXFc");
		openIds.add("ofGuR1BSon1Ee9WWqCxtRE-BM3d4");
		openIds.add("ofGuR1DgEw-ZMY8dckfNvOBh7UQU");
		openIds.add("ofGuR1JrCgblDGQEi4TGudLH_x4Y");
		
		userService.getAllUsersInfo(openIds);
		
	}
	
	
}
