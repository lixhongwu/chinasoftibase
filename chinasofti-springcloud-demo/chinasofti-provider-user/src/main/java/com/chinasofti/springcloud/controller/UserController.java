package com.chinasofti.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.springcloud.entity.User;
import com.chinasofti.springcloud.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@RequestMapping("/user")
	public List<User> queryUser() {

		List<User> list = service.queryUser();

		return list;

	}

	@RequestMapping("/simple/{id}")
	public User findUserById(@PathVariable Integer id) {
		return service.findUserById(id);
	}

	@RequestMapping("/insert")
	public String insertUser() {

		User user = new User();

		user.setUsername("aaa");
		user.setAddress("bbb");
		user.setSex("男");

		try {
			service.insertUser(user);

			return "添加成功";
		} catch (Exception e) {
			e.printStackTrace();
			return "添加失败";
		}

	}

}