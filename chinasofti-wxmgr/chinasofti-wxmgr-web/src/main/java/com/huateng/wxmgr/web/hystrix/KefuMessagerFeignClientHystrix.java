package com.huateng.wxmgr.web.hystrix;

import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.huateng.wxmgr.web.feign.KefuMessagerFeignClient;
@Component
public class KefuMessagerFeignClientHystrix implements KefuMessagerFeignClient {

	@Override
	public void sendText(@RequestParam Map map) {

	}

	@Override
	public void sendMessager(Map map) {
		
	}

	

}
