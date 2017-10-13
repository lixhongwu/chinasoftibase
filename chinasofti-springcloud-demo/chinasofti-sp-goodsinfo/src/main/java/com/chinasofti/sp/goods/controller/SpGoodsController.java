package com.chinasofti.sp.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.sp.goods.entity.SpGoodsinfo;
import com.chinasofti.sp.goods.service.SpGoodsService;
import com.google.gson.Gson;

@RequestMapping("goods")
@RestController
public class SpGoodsController {
	
	@Autowired
	SpGoodsService spGoodsService;
	
	/**
	 * id查询
	 * @param ids
	 * @return
	 */
	@RequestMapping("/select/{ids}")
	@ResponseBody
	public SpGoodsinfo selectByPrimaryKey(@PathVariable String ids){
		
		return spGoodsService.selectByPrimaryKey(ids);
		
	}
	
	/**
	 * 全部查询
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public List<SpGoodsinfo> findAll(){
		
		return spGoodsService.findAll();
		
	}
	
	
	/**
	 * 商品添加
	 * @param spGoodsinfo
	 */
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public String goodsAdd(String spGoodsinfo){
		
		Gson gson = new Gson();
		SpGoodsinfo goods = gson.fromJson(spGoodsinfo, SpGoodsinfo.class);
		
		
		spGoodsService.insertSelective(goods);
		
		return "add";
		
	}
	
	/**
	 * 通过ID删除
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/delete/{ids}")
	public String deleteByPrimaryKey(@PathVariable String ids){
		
		spGoodsService.deleteByPrimaryKey(ids);
		
		return "delete";
		
	}
	
	
	
	
}
