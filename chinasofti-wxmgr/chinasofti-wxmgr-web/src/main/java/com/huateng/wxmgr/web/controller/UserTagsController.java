package com.huateng.wxmgr.web.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huateng.wxmgr.web.feign.UserTagsFeign;

/**
 * 微信用户标签控制类
 * 
 * @ClassName: UserTagsController.java
 * @Description: TODO
 * @author 金林
 * @Date: 2017年11月22日 下午3:16:27
 * @parma <T>
 */
@RequestMapping("/wxusertags")
@RestController
public class UserTagsController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserTagsController.class);
	
	@Autowired
	private UserTagsFeign userTagsFeign;
	
	
	/**
	 * 跳转页面
	 * 
	 * @return
	 */
	@RequestMapping("/tags")
	public ModelAndView getViem() {

		return new ModelAndView("user/tags");

	}
	
	/**
	 * 分页查询
	 * @return
	 */
	@RequestMapping(value="/findTagsByPage",method=RequestMethod.POST)
	public String findTagsByPage(@RequestParam Map<String,String> map){
		
		logger.info("findTagsByPage>>>>>>>>>>>>>>>>map="+map.toString());
		return userTagsFeign.findTagsByPage(map);
		
	}
	
	/**
	 * 添加标签
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/addtags",method=RequestMethod.POST)
	public String addTags(@RequestParam Map<String,String> map){
		
		logger.info("addtags>>>>>>>>>>>>>>>>map="+map.toString());
		return userTagsFeign.addTags(map);
		
	}
	/**
	 * 删除标签
	 * @param ids
	 * @return
	 */
	@RequestMapping(value="/deletetagbyid",method=RequestMethod.POST)
	public String deleteTagByID(@RequestParam String ids){
		
		
		logger.info("deleteTagByID>>>>>>>>>>>>>>>>ids="+ids);
		return userTagsFeign.deleteTagByID(ids);
		
	}
	/**
	 * 编辑标签
	 * @param map
	 * @return
	 */
	@RequestMapping(value="/updatetags",method=RequestMethod.POST)
	public String updataTag(@RequestParam Map<String,String> map){
		
		logger.info("updataTag>>>>>>>>>>>>>>>>map="+map.toString());
		return userTagsFeign.updataTag(map);
		
	}
	
	/**
	 * 同步标签
	 * @return
	 */
	@RequestMapping(value="/synchrotags",method=RequestMethod.POST)
	public String synchroTags(){
		
		return userTagsFeign.synchroTags();
		
	}
	

}
