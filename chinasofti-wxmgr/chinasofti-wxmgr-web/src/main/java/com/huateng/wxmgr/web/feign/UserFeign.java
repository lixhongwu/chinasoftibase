package com.huateng.wxmgr.web.feign;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.huateng.wxmgr.web.hystrix.wxuserFeignHystrix;

@FeignClient(name="chinasofti-wxmgr-materialservice",fallback=wxuserFeignHystrix.class)
public interface UserFeign {
	/**
	 * 分页查询
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/wxuser/findusersbypage",method=RequestMethod.POST)
	public String findTagsByPage(@RequestParam Map<String, String> map);
	
	/**
	 * 同步用户
	 * @return
	 */
	@RequestMapping(value="/wxuser/synchrousers",method=RequestMethod.POST)
	public String synchroUsers();
	
	/**
	 * 添加用户备注
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/wxuser/addremark",method=RequestMethod.POST)
	public String addRemark(@RequestParam Map<String, String> map);
	
	/**
	 * 给用户添加标签
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/wxuser/taggingusers",method=RequestMethod.POST)
	public String taggingUsers(@RequestParam Map<String,String> map);
	
	/**
	 * 拉黑用户
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/wxuser/addblackusers",method=RequestMethod.POST)
	public String addBlackUsers(@RequestParam("ids") String ids);
	
	/**
	 * 用户取消拉黑
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/wxuser/unblackusers",method=RequestMethod.POST)
	public String unBlackUsers(@RequestParam("ids") String ids);
	

}
