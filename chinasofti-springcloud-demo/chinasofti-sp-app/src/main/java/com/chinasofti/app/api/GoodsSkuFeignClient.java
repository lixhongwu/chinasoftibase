package com.chinasofti.app.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chinasofti.app.hystrix.GoosSkuFeignClientHystrix;
import com.chinasofti.common.sp.entity.SpGoodsSkuWithBLOBs;
 	 	
@FeignClient(name = "sp-goodsskuservice", fallback = GoosSkuFeignClientHystrix.class)
public interface GoodsSkuFeignClient {
	
	// 根据商品id查出详情
	@RequestMapping(value = "goodssku/selectGoodsInfoById/{goodsId}", method = RequestMethod.GET)
	public SpGoodsSkuWithBLOBs selectGoodsInfo(@PathVariable("goodsId") String goodsId);
}
