package com.huateng.wxmgr.web.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.huateng.wxmgr.common.entity.WxMenu;

@FeignClient(name="chinasofti-wxmgr-menuservice" )
public interface MenuFeign {
	
	@RequestMapping("/menu/select/{id}")
	public WxMenu findById(@PathVariable("id") String id);
	
	
	

}
