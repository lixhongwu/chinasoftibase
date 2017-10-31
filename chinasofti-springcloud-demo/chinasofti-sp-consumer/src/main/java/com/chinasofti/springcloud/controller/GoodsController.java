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

import com.chinasofti.common.sp.entity.SpGoodsinfo;
import com.chinasofti.common.utils.JsonUtils;

@RestController
/**
 * goods控制器 访问方式启动本地eureka服务器和服务提供者，通过ip+port加上/goods/id
 * 
 * @author husong
 *
 */
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	private RestTemplate restTemplate;

	@Value("${user.goodServicepath}")
	private String goodServicepath;


	/**
	 * 根据ID查询
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/select/{id}")
	public String goodsFindById(@PathVariable Long id) {

		SpGoodsinfo spGoodsinfo = this.restTemplate.getForObject(this.goodServicepath + "goods/select/" + id,
				SpGoodsinfo.class);

		return JsonUtils.objectToGsonString(spGoodsinfo);
	}

	/**
	 * 全部(条件)查询
	 * 
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public ResponseEntity<String> findAll(SpGoodsinfo spGoodsinfo) {
		
		HttpEntity<LinkedMultiValueMap<String, String>> he = transmitObject(spGoodsinfo);
		
		ResponseEntity<String> response = restTemplate.postForEntity(this.goodServicepath + "goods/list", he,
				String.class);

		return response;

	}

	/**
	 * 商品添加
	 * 
	 * @param spGoodsinfo
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<String> goodsAdd(SpGoodsinfo spGoodsinfo) {

		HttpEntity<LinkedMultiValueMap<String, String>> he = transmitObject(spGoodsinfo);

		ResponseEntity<String> response = restTemplate.postForEntity(this.goodServicepath + "goods/add", he,
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

		return this.restTemplate.getForObject(this.goodServicepath + "goods/delete/" + ids, String.class);

	}
	
	
	/**
	 * 修改
	 * @param spGoodsinfo
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity<String> goodsUpdate(SpGoodsinfo spGoodsinfo) {

		HttpEntity<LinkedMultiValueMap<String, String>> he = transmitObject(spGoodsinfo);

		ResponseEntity<String> response = restTemplate.postForEntity(this.goodServicepath + "goods/update", he,
				String.class);

		return response;

	}

	/**
	 * 返回商品界面
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView getview() {
		return new ModelAndView("/goods/goods");
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
