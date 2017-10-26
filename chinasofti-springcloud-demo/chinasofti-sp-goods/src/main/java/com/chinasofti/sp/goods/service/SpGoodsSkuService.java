package com.chinasofti.sp.goods.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.common.sp.entity.SpGoodsSkuExample;
import com.chinasofti.common.sp.entity.SpGoodsSkuWithBLOBs;
import com.chinasofti.sp.goods.mapper.SpGoodsSkuMapper;

@Service
public class SpGoodsSkuService {
	
	@Autowired
	SpGoodsSkuMapper spGoodsSkuMapper;
	
	
	private static final Logger logger = LoggerFactory.getLogger(SpGoodsSkuService.class);

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
	
	/**
	 * 根据id查出商品详情
	 * @author kanmeng
	 * @param ids
	 * @return
	 */
	public SpGoodsSkuWithBLOBs selectByExampleWithBLOBs(String goodsId) {
		SpGoodsSkuExample skuExample = new SpGoodsSkuExample();
		skuExample.createCriteria().andGoodsIdEqualTo(goodsId);
		List<SpGoodsSkuWithBLOBs> spGoodsSkuWithBLOBs = spGoodsSkuMapper.selectByExampleWithBLOBs(skuExample);
		if(!spGoodsSkuWithBLOBs.isEmpty()) {
			return spGoodsSkuWithBLOBs.get(0);
		}
		logger.info(">>>>>>> spGoodsSkuWithBLOBs:"+spGoodsSkuWithBLOBs);
		return null;
	}
	
}

