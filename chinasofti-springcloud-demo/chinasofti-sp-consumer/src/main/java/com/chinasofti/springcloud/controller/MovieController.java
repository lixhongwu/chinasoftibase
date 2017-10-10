package com.chinasofti.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chinasofti.springcloud.entity.SpGoodsinfo;
import com.chinasofti.springcloud.entity.User;

@RestController
public class MovieController {
	@Autowired
	private RestTemplate restTemplate;

	@Value("${user.userServicePath}")
	private String userServicePath;

	@Value("${user.goodServicepath}")
	private String goodServicepath;

	@GetMapping("/user/{id}")
	public User findById(@PathVariable Long id) {

		return this.restTemplate.getForObject(this.userServicePath + "spuser/" + id, User.class);
	}

	@GetMapping("/{ids}")
	public SpGoodsinfo queryById(@PathVariable Long ids) {

		return this.restTemplate.getForObject(this.goodServicepath + "goods/select/" + ids, SpGoodsinfo.class);
	}
}
