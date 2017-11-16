package com.huateng.weixin.material.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.huateng.weixin.material.service.AccessTokenService;
@RunWith(SpringRunner.class)
@SpringBootTest()
public class AccessTokenTest {

	private final static Logger logger = LoggerFactory.getLogger(AccessTokenTest.class);
	
	@Autowired
	private AccessTokenService accessTokenService;
	
	@Test
	public void getAccessToken(){
		String accessToken = accessTokenService.getAccessToken();
		logger.info(accessToken);
	}
}
