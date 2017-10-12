package com.chinasofti.sp.goodssku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.sp.goodssku.entity.SpGoodsSkuWithBLOBs;
import com.chinasofti.sp.goodssku.mapper.SpGoodsSkuMapper;

@Service
public class SpGoodsSkuService {
	
	@Autowired
	SpGoodsSkuMapper spGoodsSkuMapper;
	
	/**
	 * 通过id查询
	 * @param ids
	 * @return
	 */
	public SpGoodsSkuWithBLOBs selectByPrimaryKey(String ids){
		
		return spGoodsSkuMapper.selectByPrimaryKey(ids);
		
	}
	
	/**
	 * 全部查询 
	 * @param example
	 * @return
	 */
	public List<SpGoodsSkuWithBLOBs> findAll(){
		return spGoodsSkuMapper.selectByExampleWithBLOBs(null);
	}
	
	
	
}
