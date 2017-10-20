package com.chinasofti.app.controller;


import java.util.List;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.chinasofti.app.api.GoodsClassFeignClient;
import com.chinasofti.app.api.GoodsInfoFeignClient;
import com.chinasofti.app.api.GoodsSkuFeignClient;
import com.chinasofti.app.entity.SpClientGoodsClass;
import com.chinasofti.app.entity.SpGoodsSkuWithBLOBs;
import com.chinasofti.app.entity.SpGoodsinfo;

@RestController
@RequestMapping("/chinasofti.com")
public class AppController {

	@Autowired
	GoodsClassFeignClient goodsClassFeignClient;
	
	@Autowired
	GoodsInfoFeignClient goodsInfoFeignClient;
	
	@Autowired
	GoodsSkuFeignClient goodsSkuFeignClient;
	
	
	// 根据pid查询分类
	@GetMapping("selectGoodsClass")
	public List<SpClientGoodsClass> selectGoodsClassByPid(@RequestParam(defaultValue="0") String ids,HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return goodsClassFeignClient.selectGoodsClassByPid(ids);
	}

	// 根据分类id查询出商品
	@GetMapping("selectGoodsByClassId")
	public List<SpGoodsinfo> selectGoodsByClassId(@RequestParam String ids, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
		return goodsInfoFeignClient.selectGoodsByClassId(ids);
	}

	// 根据商品id查出详情
	@GetMapping("selectGoodsInfo")
	public SpGoodsSkuWithBLOBs selectGoodsInfo(@RequestParam("goodsCode") String goodsId, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        return goodsSkuFeignClient.selectGoodsInfo(goodsId);
	}
	
}
