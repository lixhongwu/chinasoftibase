package com.huateng.weixin.user.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {

	@Test
	public void loadEnvironment() {
		
	}
	
	public static void main(String[] args) {
		String token = "{\"access_token\":\"PustinO-XzvOW9QiUXZby4xHc0wU1PEyU8AoIQ7U2PA-FKvsKUJHiNUzROYEdzWUQ_YdsIXCsjZc_qMlFicqS3Lp7pk9CxvvafT5aRblx5U32lHUFcPibzRXcapKc5rtIJIiAHAMNM\",\"expires_in\":7200}";
		Gson gson = new Gson();
		JsonObject result = gson.fromJson(token, JsonObject.class);
		System.out.println(result.toString());
	}
}
