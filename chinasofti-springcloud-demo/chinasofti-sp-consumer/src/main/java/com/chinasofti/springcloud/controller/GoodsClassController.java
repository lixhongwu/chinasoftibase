package com.chinasofti.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chinasofti.common.sp.entity.SpClientGoodsClass;

@RestController
@RequestMapping("/goodsClass")
public class GoodsClassController {

	@Autowired
	RestTemplate restTemplate;
	
	@Value("${goods.goodClassServicePath}")
	private String goodClassServicePath;


	@Value("${user.goodServicepath}")
	private String goodServicepath;
	
	// 查询顶级分类
	@SuppressWarnings("unchecked")
	@GetMapping("selectAll")
	public List<SpClientGoodsClass> selectAllGoodsClass() {
		return restTemplate.getForObject(this.goodClassServicePath + "goodsClass/selectAll", List.class);
	}

	// 根据分类id查询出商品
	@GetMapping("select/{id}")
	public SpClientGoodsClass selectGoodsClassById(@PathVariable String id) {
		return restTemplate.getForObject(this.goodServicepath + "goods/select/" + id,
				SpClientGoodsClass.class);
	}
	
	

}
