package com.chinasofti.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chinasofti.springcloud.entity.PyMainGoodsorder;


@RequestMapping("/goodsorder")
@RestController
public class GoodsOrderController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${user.goodsOrderServicepath}")
	private String goodsOrderServicepath;
	
	/**
	 * id查询
	 * @param ids
	 * @return
	 */
	@RequestMapping("/select/{ids}")
	@ResponseBody
	public PyMainGoodsorder selectByPrimaryKey(@PathVariable String ids){
		
		return restTemplate.getForObject(this.goodsOrderServicepath + "goodsorder/select/" + ids, PyMainGoodsorder.class);
		
	}
	
	/**
	 * 查询所有
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/list")
	@ResponseBody
	public List<PyMainGoodsorder> selectAll(){
		
		return this.restTemplate.getForObject(this.goodsOrderServicepath + "goodsorder/list", List.class);
	}
	
	
}
