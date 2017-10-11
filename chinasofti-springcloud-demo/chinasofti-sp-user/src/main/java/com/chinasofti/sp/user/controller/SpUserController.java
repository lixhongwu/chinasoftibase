package com.chinasofti.sp.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.sp.user.entity.SpUser;
import com.chinasofti.sp.user.service.SpUserService;
import com.google.gson.Gson;

@RestController//ceshi
@RequestMapping("spuser")
public class SpUserController {
	
	@Autowired
	private SpUserService spUserService;
	/**
	 *根据ids查询用户信息
	 * */
	@GetMapping("{ids}")
	public SpUser queryById(@PathVariable String ids){
		
		return spUserService.quetyById(ids);
	}
	
	/**
	 * 添加用户
	 * */
	@ResponseBody
	@PostMapping("/save")
	public String insertItems(String user) {
		Gson gson = new Gson();
		SpUser spUser = gson.fromJson(user, SpUser.class);
		spUserService.save(spUser);
		return "save";
	}
	
	
	 /**
     * 查询所有sp_user信息列表
     */
    @GetMapping("/allSpUsers")
    public List<SpUser> girlList(){
        return spUserService.findAll();
    }
	
    /**
	 * 删除一个用户信息
	 * */
	@GetMapping("/delete/{ids}")
    public int deleteSpUser(@PathVariable String ids){
		return spUserService.delete(ids);
    }
}
