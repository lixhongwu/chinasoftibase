package com.huateng.wxmgr.web.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huateng.wxmgr.web.hystrix.MaterialFeignClientHystrix;


@FeignClient(name="chinasofti-wxmgr-materialservice",fallback=MaterialFeignClientHystrix.class)
public interface MaterialFeignClient {

	@RequestMapping(value="/material/getlist",method=RequestMethod.POST )
	public String listAll();
}
