package com.huateng.wxmgr.web.feign;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="chinasofti-wxmgr-kefuservice",fallback=KefuMessagerFeignClient.class)
public interface KefuMessagerFeignClient {

	@RequestMapping(value="/kefu/sendText",method=RequestMethod.POST)
	public void sendText(@RequestParam Map map); 
	
	@RequestMapping(value="/kefu/sendMessager",method=RequestMethod.POST)
	public void sendMessager(@RequestParam Map map); 
}
