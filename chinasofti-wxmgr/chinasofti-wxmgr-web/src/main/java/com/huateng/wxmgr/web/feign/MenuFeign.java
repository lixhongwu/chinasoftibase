package com.huateng.wxmgr.web.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.huateng.wxmgr.common.entity.WxMenu;
import com.huateng.wxmgr.web.hystrix.MenuFeignClientHystrix;

import net.sf.json.JSONObject;

@FeignClient(name="CHINASOFTI-WXMGR-MENUSERVICE" ,fallback=MenuFeignClientHystrix.class)
public interface MenuFeign {
	
	@RequestMapping("/menu/select/{id}")
	public WxMenu findById(@PathVariable("id") String id);
	
	@RequestMapping(value="/wxmenu/grouplist",method=RequestMethod.POST )
	public JSONObject findGroupByPage(@RequestBody(required=false)WxMenu wxMenu);

}
