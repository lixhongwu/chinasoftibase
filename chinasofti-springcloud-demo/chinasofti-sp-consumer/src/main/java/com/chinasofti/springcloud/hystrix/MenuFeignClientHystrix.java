package com.chinasofti.springcloud.hystrix;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.chinasofti.springcloud.feign.MenuFeignClient;

@Component
public class MenuFeignClientHystrix implements MenuFeignClient{

	@Override
	public List<LinkedHashMap> findAll() {
		return null;
	}

	
}
