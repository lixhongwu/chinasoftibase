package com.huateng.wxmgr.web.feign;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.huateng.wxmgr.web.hystrix.KefuFeignClientHystrix;

@FeignClient(name="chinasofti-wxmgr-materialservice",fallback=KefuFeignClientHystrix.class)
public interface KefuFeignClient {

}
