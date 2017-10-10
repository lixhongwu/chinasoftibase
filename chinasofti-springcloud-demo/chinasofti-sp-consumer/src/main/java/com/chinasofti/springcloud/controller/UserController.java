package com.chinasofti.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.springcloud.entity.SpGoodsinfo;
import com.chinasofti.springcloud.entity.User;

@RestController
/**
 * user控制器
 * 访问方式启动本地eureka服务器和服务提供者，通过ip+port加上/user/id
 * @author husong
 *
 */
public class UserController {
	@Autowired
	private RestTemplate restTemplate;

	@Value("${user.userServicePath}")
	private String userServicePath;

	@GetMapping("/user/{id}")
	public User findById(@PathVariable Long id) {

		return this.restTemplate.getForObject(this.userServicePath + "spuser/" + id, User.class);
	}
    @RequestMapping("/user/web")
	public ModelAndView getview() {
		return  new ModelAndView("template");
	}
}
