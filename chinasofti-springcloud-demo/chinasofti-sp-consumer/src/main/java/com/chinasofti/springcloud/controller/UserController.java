package com.chinasofti.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.common.sp.entity.SpUser;
import com.chinasofti.common.utils.JsonUtils;



@RestController
/**
 * 
 * 
 * @author 
 *
 */
@RequestMapping("/users")
public class UserController {
	@Autowired
	private RestTemplate restTemplate;

	@Value("${user.userServicePath}")
	private String userServicePath;


	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/select/{id}")
	public String usersFindById(@PathVariable Long id) {

		SpUser spUser = this.restTemplate.getForObject(this.userServicePath + "users/select/" + id,
				SpUser.class);

		return JsonUtils.objectToGsonString(spUser);
	}

	/**
	 * 全部(条件)查询
	 * 
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public ResponseEntity<String> findAll(SpUser spUser) {
		
		HttpEntity<LinkedMultiValueMap<String, String>> he = transmitObject(spUser);
		
		ResponseEntity<String> response = restTemplate.postForEntity(this.userServicePath + "users/list", he,
				String.class);

		return response;

	}

	/**
	 * 用户添加
	 * 
	 * @param spUser
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<String> goodsAdd(SpUser spUser) {

		HttpEntity<LinkedMultiValueMap<String, String>> he = transmitObject(spUser);

		ResponseEntity<String> response = restTemplate.postForEntity(this.userServicePath + "users/add", he,
				String.class);

		return response;
	}

	/**
	 * 通过ID删除
	 * 
	 * @return
	 */
	@RequestMapping(value = "/delete/{ids}")
	public String goodsDeleteById(@PathVariable String ids) {

		return this.restTemplate.getForObject(this.userServicePath + "users/delete/" + ids, String.class);

	}
	
	
	/**
	 * 修改
	 * @param spUser
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity<String> goodsUpdate(SpUser spUser) {

		HttpEntity<LinkedMultiValueMap<String, String>> he = transmitObject(spUser);

		ResponseEntity<String> response = restTemplate.postForEntity(this.userServicePath + "users/update", he,
				String.class);

		return response;

	}

	/**
	 * 返回用户界面
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView getview() {
		return new ModelAndView("/users/users");
	}
	
	/**
	 * 对象转集合
	 * @param object
	 * @return
	 */
	public HttpEntity<LinkedMultiValueMap<String, String>> transmitObject(Object object){
		
		LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();

		String objectToString = JsonUtils.objectToGsonString(object);

		map.add("spUser", objectToString);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		HttpEntity<LinkedMultiValueMap<String, String>> he = new HttpEntity<LinkedMultiValueMap<String, String>>(map,
				headers);

		return he;
		
	}
	
	
}
