package com.chinasofti.sp.client.goods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.sp.client.goods.entity.SpClientGoodsClass;
import com.chinasofti.sp.client.goods.entity.SpClientGoodsClassExample;
import com.chinasofti.sp.client.goods.mapper.SpClientGoodsClassMapper;

@Service
public class SpClientGoodsService {
	
	@Autowired
	SpClientGoodsClassMapper spClientGoodsClassMapper;
	/**
	 * 通过id查询
	 * @param ids
	 * @return
	 */
	public SpClientGoodsClass selectByPrimaryKey(String ids){
		return spClientGoodsClassMapper.selectByPrimaryKey(ids);
	}
	/**
	 * 根据pid查询分类
	 */
	public List<SpClientGoodsClass> selectSubClass(String pid) { 
		SpClientGoodsClassExample spClientGoodsClassExample = new SpClientGoodsClassExample();
		spClientGoodsClassExample.createCriteria().andPidsEqualTo(pid);
		spClientGoodsClassExample.setOrderByClause("ids ASC");
		return spClientGoodsClassMapper.selectByExample(spClientGoodsClassExample);
	}
}


	
