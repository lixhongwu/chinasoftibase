package com.chinasofti.app.api;

import java.util.List;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.chinasofti.app.entity.SpGoodsinfo;
import com.chinasofti.app.hystrix.GoosInfoFeignClientHystrix;


@FeignClient(name = "sp-goodsService",fallback = GoosInfoFeignClientHystrix.class)
public interface GoodsInfoFeignClient {
	
	// 根据分类id查询出商品
	@RequestMapping(value="goods/findByClassId/{ids}",method=RequestMethod.GET)
	public List<SpGoodsinfo> selectGoodsByClassId(@PathVariable("ids") String ids);

}
