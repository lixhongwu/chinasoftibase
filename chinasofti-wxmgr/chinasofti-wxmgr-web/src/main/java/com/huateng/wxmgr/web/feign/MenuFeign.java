package com.huateng.wxmgr.web.feign;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.huateng.wxmgr.web.hystrix.MenuFeignClientHystrix;

import net.sf.json.JSONObject;

@FeignClient(name="CHINASOFTI-WXMGR-MENUSERVICE",url="http://localhost:7801",fallback= MenuFeignClientHystrix.class)
public interface MenuFeign {
	
	/**
	 * 通过ids获取菜单
	 * @param id
	 * @return
	 */
//	@RequestMapping("/menu/select/{ids}")
//	public WxMenu findById(@PathVariable("id") String id);
//	
	/**
	 * 获取菜单组列表
	 * @return
	 */
	@RequestMapping(value="/wxmenu/grouplist" )
	public JSONObject findGroupByPage();
	
//	@RequestMapping(value="/wxmenu/addmenugroup" ,method=RequestMethod.POST)
//	public String addMenuGroup(@RequestBody WxMenu wxMenu);
	
	/**
	 * 通过ids删除菜单组
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/wxmenu/delgroupmenu/{ids}")
	public String deleteMenuGroup(@PathVariable("ids")String ids);
	
	/**
	 * 添加菜单组
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/wxmenu/addmenugroup/",method=RequestMethod.POST)
	public String addMenuGroup(@RequestParam Map<String,String> map);
	
	/**
	 * 更新菜单组
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/wxmenu/updatemenugroup",method=RequestMethod.POST)
	public String updateMenuGroup(@RequestParam Map<String, String> map);
	/**
	 * 获取菜单
	 * @param gid
	 * @return
	 */
	@RequestMapping(value="/wxmenu/menulist/{gid}",method=RequestMethod.GET)
	public String findMenu(@PathVariable("gid")String gid);
	/**
	 * 添加一级菜单
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/wxmenu/addlevelonemenu",method =RequestMethod.POST)
	public String addLevelOneMenu(@RequestParam Map<String, String> map);
	
	/**
	 * 添加二级菜单
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/wxmenu/addleveltwomenu",method =RequestMethod.POST)
	public String addLevelTwoMenu(@RequestParam Map<String, String> map);
	/**
	 * 删除菜单
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/wxmenu/deletemenu/{ids}",method=RequestMethod.POST)
	public String deleteMenu(@PathVariable("ids") String ids);

}
