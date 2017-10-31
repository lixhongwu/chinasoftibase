package com.chinasofti.springcloud.feign;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinasofti.springcloud.hystrix.MenuFeignClientHystrix;



@FeignClient(name="cms-menuService",fallback=MenuFeignClientHystrix.class)
public interface MenuFeignClient {

	//查询全部
	@RequestMapping("cmsmenu/list")
	List<LinkedHashMap> findAll();
	
}
