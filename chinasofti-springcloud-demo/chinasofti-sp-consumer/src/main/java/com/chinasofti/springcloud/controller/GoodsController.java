package com.chinasofti.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.springcloud.entity.SpGoodsinfo;
import com.chinasofti.springcloud.utils.JsonUtils;

@RestController
/**
 * user控制器
 * 访问方式启动本地eureka服务器和服务提供者，通过ip+port加上/goods/id
 * @author husong
 *
 */
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	private RestTemplate restTemplate;

	@Value("${user.goodServicepath}")
	private String goodServicepath;


	@GetMapping("/select/{id}")
	public String findById(@PathVariable Long id) {
		
		
		SpGoodsinfo spGoodsinfo = this.restTemplate.getForObject(this.goodServicepath + "goods/select/" + id, SpGoodsinfo.class);
		
		return JsonUtils.objectToGsonString(spGoodsinfo);
	}
	

	
	@RequestMapping("/index")
	public ModelAndView getview() {
		return  new ModelAndView("/goods/goods");
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/list")
	@ResponseBody
	public List<SpGoodsinfo> findAll(){
		
		return this.restTemplate.getForObject(this.goodServicepath + "goods/list", List.class);
	}
	

}
