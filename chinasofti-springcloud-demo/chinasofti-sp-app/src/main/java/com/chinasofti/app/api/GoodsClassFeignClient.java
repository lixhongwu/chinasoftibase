package com.chinasofti.app.api;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chinasofti.app.hystrix.GoosClassFeignClientHystrix;
import com.chinasofti.common.sp.entity.SpClientGoodsClass;

@FeignClient(name = "chinasofti-sp-goodsclass", fallback = GoosClassFeignClientHystrix.class)
public interface GoodsClassFeignClient {
	
	//查询分类
	@RequestMapping(value = "goodsClass/selectSubClass/{ids}", method = RequestMethod.GET)
	List<SpClientGoodsClass> selectGoodsClassByPid(@PathVariable("ids") String ids);

}
