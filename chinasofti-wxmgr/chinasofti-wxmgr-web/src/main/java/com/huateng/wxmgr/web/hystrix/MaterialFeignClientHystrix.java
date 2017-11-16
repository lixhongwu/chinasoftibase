package com.huateng.wxmgr.web.hystrix;

import org.springframework.stereotype.Component;

import com.huateng.wxmgr.web.feign.MaterialFeignClient;

@Component
public class MaterialFeignClientHystrix implements MaterialFeignClient {

	@Override
	public String listAll() {
		// TODO Auto-generated method stub
		return "0";
	}
	

}
