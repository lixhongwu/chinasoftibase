package com.chinasofti.sp.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.sp.user.entity.SpUser;
import com.chinasofti.sp.user.service.SpUserService;

@RestController
@RequestMapping("spuser")
public class SpUserController {
	
	@Autowired
	private SpUserService spUserService;
	
	@GetMapping("{ids}")
	public SpUser queryById(@PathVariable String ids){
		
		return spUserService.quetyById(ids);
		
		
	}

}
