package com.chinasofti.sp.user.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.common.spuser.entity.SpUser;
import com.chinasofti.common.spuser.entity.SpUserExample;
import com.chinasofti.common.spuser.entity.SpUserExample.Criteria;
import com.chinasofti.common.spuser.entity.SpUserWithBLOBS;
import com.chinasofti.sp.user.service.SpUserService;
import com.google.gson.Gson;

@RequestMapping("users")
@RestController
public class SpUserController {

	@Autowired
	SpUserService spUserService;

	/**
	 * id查询
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("/select/{ids}")
	@ResponseBody
	public SpUserWithBLOBS selectByPrimaryKey(@PathVariable String ids) {
		
		return spUserService.selectByPrimaryKey(ids);

	}

	/**
	 * 全部查询
	 * 
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public List<SpUserWithBLOBS> findAll(String spUser) {

		String compare = "";

		Gson gson = new Gson();
		SpUserWithBLOBS users = gson.fromJson(spUser, SpUserWithBLOBS.class);

		SpUserExample example = new SpUserExample();
		Criteria criteria = example.createCriteria();

		if((users.getName())!=null && !compare.equals(users.getName())){
			criteria.andNameEqualTo(users.getName());
			return spUserService.findAll(example);
		}
		return spUserService.findAll(example);
	}
	
	/**
	 * 用户添加
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String goodsAdd(String spUser) {
		Gson gson = new Gson();
		SpUserWithBLOBS users = gson.fromJson(spUser, SpUserWithBLOBS.class);

		spUserService.insertSelective(users);

		return "add";
	}
	
	/**
	 * 通过ID删除
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/delete/{ids}")
	public String deleteByPrimaryKey(@PathVariable String ids) {

		spUserService.deleteByPrimaryKey(ids);

		return "delete";

	}

	/**
	 * 修改
	 * 
	 * @param spUser
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateByPrimaryKey(String spUser) {

		Gson gson = new Gson();
		SpUser users = gson.fromJson(spUser, SpUser.class);

		spUserService.updateByPrimaryKey(users);

		return "update";
	}
}
