package com.chinasofti.py.goodsorder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.py.goodsorder.entity.PyMainGoodsorder;
import com.chinasofti.py.goodsorder.mapper.PyMainGoodsorderMapper;


@Service
public class PyMainGoodsorderService {
	
	@Autowired
	PyMainGoodsorderMapper pyMainGoodsorderMapper;
	/**
	 * 通过id查询
	 * @param ids
	 * @return
	 */
	public PyMainGoodsorder selectByPrimaryKey(String ids){
		
		return pyMainGoodsorderMapper.selectByPrimaryKey(ids);
		
	}
	
}
