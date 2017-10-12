package com.chinasofti.sp.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.sp.goods.entity.SpGoodsinfo;
import com.chinasofti.sp.goods.entity.SpGoodsinfoExample;
import com.chinasofti.sp.goods.service.SpGoodsService;

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
	
	@RequestMapping("/list")
	@ResponseBody
	public List<SpGoodsinfo> findAll(){
		
		return spGoodsService.findAll();
		
		
	}
	
}
