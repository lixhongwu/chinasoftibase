package com.huateng.wxmgr.web.feign;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.huateng.wxmgr.common.entity.WxMenu;
import com.huateng.wxmgr.web.hystrix.MenuFeignClientHystrix;

import net.sf.json.JSONObject;

@FeignClient(name="CHINASOFTI-WXMGR-MENUSERVICE",url="http://localhost:7801",fallback= MenuFeignClientHystrix.class)
public interface MenuFeign {
	
	@RequestMapping("/menu/select/{id}")
	public WxMenu findById(@PathVariable("id") String id);
	
	@RequestMapping(value="/wxmenu/grouplist" )
	public JSONObject findGroupByPage();
	
//	@RequestMapping(value="/wxmenu/addmenugroup" ,method=RequestMethod.POST)
//	public String addMenuGroup(@RequestBody WxMenu wxMenu);
	
	@RequestMapping(value="/wxmenu/delgroupmenu/{ids}")
	public String deleteMenuGroup(@PathVariable("ids")String ids);
	
	@RequestMapping(value="/wxmenu/addmenugroup/",method=RequestMethod.POST)
	public String addMenuGroup(@RequestParam Map<String,String> map);

}
