package com.chinasofti.sp.goods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.sp.goods.entity.SpGoodsinfo;
import com.chinasofti.sp.goods.entity.SpGoodsinfoExample;
import com.chinasofti.sp.goods.mapper.SpGoodsinfoMapper;

@Service
public class SpGoodsService {
	
	@Autowired
	SpGoodsinfoMapper spGoodsinfoMapper;
	
	/**
	 * 通过id查询
	 * @param ids
	 * @return
	 */
	public SpGoodsinfo selectByPrimaryKey(String ids){
		
		return spGoodsinfoMapper.selectByPrimaryKey(ids);
		
	}
	
	/**
	 * 全部查询
	 * @param example
	 * @return
	 */
	public List<SpGoodsinfo> selectByExample(SpGoodsinfoExample example){
		return spGoodsinfoMapper.selectByExample(example);
	}
	
	public List<SpGoodsinfo> findAll() {
		return spGoodsinfoMapper.findAll();
	}
	
}
