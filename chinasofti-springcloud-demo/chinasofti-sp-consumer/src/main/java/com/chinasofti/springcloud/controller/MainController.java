package com.chinasofti.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.common.sp.entity.PtUser;
import com.chinasofti.springcloud.utils.JsonUtils;

@RestController
public class MainController {
	
	@Autowired
	private RestTemplate restTemplate;

	@Value("${user.userLoginPath}")
	private String userLoginpath;
	
	 @RequestMapping("/main")
		public ModelAndView getview() {
			return  new ModelAndView("main");
		}
	
	 @RequestMapping("/login")
	 public ModelAndView getLoginView(){
		 return new ModelAndView("login");
	 }
	 
	 /**
	  * 登录
	 * @param ptUser
	 */
	 @RequestMapping(value = "/checkuser")
	public ResponseEntity<String> checkUser(PtUser ptUser){
		 
		HttpEntity<LinkedMultiValueMap<String, String>> he = transmitObject(ptUser);

		ResponseEntity<String> response = restTemplate.postForEntity(this.userLoginpath + "user/login", he,
				String.class);

		return response;
		
	 }
	
	
	
	/**
	 * 对象转集合
	 * @param object
	 * @return
	 */
	public HttpEntity<LinkedMultiValueMap<String, String>> transmitObject(Object object){
		
		LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();

		String objectToString = JsonUtils.objectToGsonString(object);

		map.add("postParmainfo", objectToString);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		HttpEntity<LinkedMultiValueMap<String, String>> he = new HttpEntity<LinkedMultiValueMap<String, String>>(map,
				headers);

		return he;
		
	}
	
	
}
