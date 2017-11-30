package com.huateng.wxmgr.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huateng.wxmgr.web.feign.UserFeign;

@RestController
@RequestMapping("/wxuser")
public class UserController {

	@Autowired
	private UserFeign userFeign;

	/**
	 * 跳转页面
	 * @return
	 */
	@RequestMapping("/user")
	public ModelAndView getView() {
		return new ModelAndView("user/user");

	}

	/**
	 * 分页条件查询
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/findusersbypage", method = RequestMethod.POST)
	public String findUsersByPage(@RequestParam Map<String, String> map) {

		return userFeign.findTagsByPage(map);

	}

	/**
	 * 同步用户到本地数据库
	 * @return
	 */
	@RequestMapping(value = "/synchrousers")
	public String synchroUsers() {
		return userFeign.synchroUsers();

	}

	/**
	 * 给用户添加备注
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/addremark", method = RequestMethod.POST)
	public String addRemark(@RequestParam Map<String, String> map) {
		return userFeign.addRemark(map);

	}

	/**
	 * 给用户批量添加标签，每次最多添加50个用户。
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/taggingusers", method = RequestMethod.POST)
	public String taggingUsers(@RequestParam Map<String, String> map) {
		return userFeign.taggingUsers(map);

	}

	/**
	 * 拉黑用户,每次最多拉黑20名用户
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/addblackusers", method = RequestMethod.POST)
	public String addBlackUsers(@RequestParam String ids) {
		return userFeign.addBlackUsers(ids);

	}
	
	/**
	 * 用户取消拉黑,每次最多能取消20名用户
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/unblackusers", method = RequestMethod.POST)
	public String unBlackUsers(@RequestParam String ids) {
		return userFeign.unBlackUsers(ids);

	}

}
