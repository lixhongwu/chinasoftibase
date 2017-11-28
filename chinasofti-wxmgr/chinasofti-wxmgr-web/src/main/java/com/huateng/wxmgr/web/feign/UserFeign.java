package com.huateng.wxmgr.web.feign;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.huateng.wxmgr.web.hystrix.wxuserFeignHystrix;

@FeignClient(name="chinasofti-wxmgr-userservice",url="http://localhost:7802",fallback=wxuserFeignHystrix.class)
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
	
//	/**
//	 * 添加标签
//	 * @param map
//	 * @return
//	 */
//	@RequestMapping(value="/wxuser/addtags",method=RequestMethod.POST)
//	public String addTags(@RequestParam Map<String, String> map);
//	/**
//	 * 删除标签
//	 * @param ids
//	 * @return
//	 */
//	@RequestMapping(value="/wxuser/deletetagbyid",method=RequestMethod.POST)
//	public String deleteTagByID(@RequestParam("ids") String ids);
//	/**
//	 * 修改标签
//	 * @param map
//	 * @return
//	 */
//	@RequestMapping(value="/wxuser/updatetags",method=RequestMethod.POST)
//	public String updataTag(@RequestParam Map<String, String> map);
//	
	

}
