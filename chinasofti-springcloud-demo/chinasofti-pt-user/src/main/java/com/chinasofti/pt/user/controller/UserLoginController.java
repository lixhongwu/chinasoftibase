package com.chinasofti.pt.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.pt.user.entity.PtUser;
import com.chinasofti.pt.user.service.UserLoginService;
import com.google.gson.Gson;

@RestController
@RequestMapping(value = "user")
public class UserLoginController {
	
	@Autowired
	UserLoginService userLoginService;
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public int userLogin(String postParmainfo){
		
		Gson gson = new Gson();
		PtUser ptUser = gson.fromJson(postParmainfo, PtUser.class);
		
		return userLoginService.selectUserByUsernameAndPassword(ptUser);
		
	}
	
}
