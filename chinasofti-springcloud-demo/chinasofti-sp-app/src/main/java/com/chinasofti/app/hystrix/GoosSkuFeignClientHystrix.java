package com.chinasofti.app.hystrix;

import org.springframework.stereotype.Component;

import com.chinasofti.app.api.GoodsSkuFeignClient;
import com.chinasofti.common.sp.entity.SpGoodsSkuWithBLOBs;

@Component
public class GoosSkuFeignClientHystrix implements GoodsSkuFeignClient {

	@Override
	public SpGoodsSkuWithBLOBs selectGoodsInfo(String goodsId) {
		return new SpGoodsSkuWithBLOBs();
	}	
}
