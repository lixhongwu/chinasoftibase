package com.chinasofti.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chinasofti.springcloud.entity.User;

@RestController
/**
 * user控制器
 * 访问方式启动本地eureka服务器和服务提供者，通过ip+port加上/goods/id
 * @author husong
 *
 */
public class GoodsController {
	@Autowired
	private RestTemplate restTemplate;

	@Value("${user.goodServicepath}")
	private String goodServicepath;
	
	@GetMapping("/goods/{id}")
	public User findById(@PathVariable Long id) {

		return this.restTemplate.getForObject(this.goodServicepath + "goods/select/" + id, User.class);
	}

}
