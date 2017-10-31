package com.chinasofti.sp.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.common.sp.entity.SpGoodsSkuWithBLOBs;
import com.chinasofti.sp.goods.service.SpGoodsSkuService;


@RequestMapping("goodssku")
@RestController
public class SpGoodsSkuController {
	
	@Autowired
	SpGoodsSkuService spGoodsSkuService;
	
	/**
	 * id查询
	 * @param ids
	 * @return
	 */
	@RequestMapping("/select/{ids}")
	@ResponseBody
	public SpGoodsSkuWithBLOBs selectByPrimaryKey(@PathVariable String ids){
		
		return spGoodsSkuService.selectByPrimaryKey(ids);
		
	}
	
	@RequestMapping("/list")
	@ResponseBody
	public List<SpGoodsSkuWithBLOBs> findAll(){
		
		return spGoodsSkuService.findAll();
		
		
	}
	
	/**
	 * 根据id查出商品详情
	 * @author kanmeng
	 * @param id
	 * @return
	 */
	@GetMapping("selectGoodsInfoById/{goodsId}")
	public SpGoodsSkuWithBLOBs selectGoodsInfoById(@PathVariable String goodsId) {
		return spGoodsSkuService.selectByExampleWithBLOBs(goodsId);

	}
}



