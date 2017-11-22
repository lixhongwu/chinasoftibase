package com.huateng.wxmgr.web.feign;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.huateng.wxmgr.web.hystrix.UserTagsFeignHystrix;

@FeignClient(name="chinasofti-wxmgr-userservice",url="http://localhost:7701",fallback=UserTagsFeignHystrix.class)
public interface UserTagsFeign {
	
	@RequestMapping(value="/usertags/findTagsByPage",method=RequestMethod.POST)
	public String findTagsByPage(@RequestParam Map<String, String> map);

}
