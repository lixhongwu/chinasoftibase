package com.huateng.weixin.user.test;

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
}
