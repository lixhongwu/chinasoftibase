package com.chinasofti.py.goodsorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.py.goodsorder.entity.PyMainGoodsorder;
import com.chinasofti.py.goodsorder.entity.PyMainGoodsorderExample;
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
	
	/**
	 * 查询所有
	 * @param example
	 * @return
	 */
	public List<PyMainGoodsorder> selectAll(){
		PyMainGoodsorderExample example = new PyMainGoodsorderExample();
		return pyMainGoodsorderMapper.selectByExample(example);
	}
	
}
