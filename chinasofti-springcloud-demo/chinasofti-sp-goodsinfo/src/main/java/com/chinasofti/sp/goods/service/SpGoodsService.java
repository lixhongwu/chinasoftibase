package com.chinasofti.sp.goods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.sp.goods.entity.SpGoodsinfo;
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
	 * @return
	 */
	public List<SpGoodsinfo> findAll() {
		return spGoodsinfoMapper.findAll();
	}
	
	/**
	 * 添加插入(过滤空字段)
	 * @param spGoodsinfo
	 */
	public void insertSelective(SpGoodsinfo spGoodsinfo){
		spGoodsinfoMapper.insertSelective(spGoodsinfo);
	}
	
	
	/**
	 * ID删除
	 * @param ids
	 */
	public void deleteByPrimaryKey(String ids){
		spGoodsinfoMapper.deleteByPrimaryKey(ids);
	}
	
	
}
