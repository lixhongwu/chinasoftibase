package com.chinasofti.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.springcloud.entity.User;
import com.google.gson.Gson;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

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
	
	@HystrixCommand(fallbackMethod="findByIdFallback")//熔断
	@GetMapping("/user/{id}")
	public User findById(@PathVariable Long id) {

		return this.restTemplate.getForObject(this.userServicePath + "spuser/" + id, User.class);
	}
    @RequestMapping("/user/web")
	public ModelAndView getview() {
		return  new ModelAndView("children");
	}
    
    @PostMapping("/user/save")
	public ResponseEntity<String> save(User user) {
		HttpHeaders headers = new HttpHeaders();
		String url = "http://localhost:7801/spuser/save";
		//  请勿轻易改变此提交方式，大部分的情况下，提交方式都是表单提交
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		//  封装参数，千万不要替换为Map与HashMap，否则参数无法传递
		MultiValueMap<String, String> params= new LinkedMultiValueMap<String, String>();
		//  将对象转为json传送出去,服务端再转换回来, 也支持中文
		Gson gson = new Gson();
		String json = gson.toJson(user);
		params.add("user", json);
		HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<MultiValueMap<String, String>>(params, headers);
		//  执行HTTP请求
		ResponseEntity<String> response = restTemplate.postForEntity(url, requestEntity, String.class);
		return response;
	}
    //findById发生熔断返回方法
    public User findByIdFallback(Long id) {
		return new User();
    	
    }
    
}
