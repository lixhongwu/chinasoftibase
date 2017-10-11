package com.chinasofti.py.goodsorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.py.goodsorder.entity.PyMainGoodsorder;
import com.chinasofti.py.goodsorder.service.PyMainGoodsorderService;

@RequestMapping("goodsorder")
@RestController
public class PyMainGoodsorderController {
	
	@Autowired
	PyMainGoodsorderService pyGoodsService;
	
	/**
	 * id查询
	 * @param ids
	 * @return
	 */
	@RequestMapping("/select/{ids}")
	@ResponseBody
	public PyMainGoodsorder selectByPrimaryKey(@PathVariable String ids){
		
		return pyGoodsService.selectByPrimaryKey(ids);
		
	}
	
	
}
