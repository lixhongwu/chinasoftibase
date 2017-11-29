package com.huateng.weixin.user.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huateng.weixin.user.service.UserModalService;
import com.huateng.weixin.user.service.UserService;
import com.huateng.wxmgr.common.entity.WxUserFans;
import com.huateng.wxmgr.common.entity.WxUserOpenId;
import com.huateng.wxmgr.common.utils.Constant;
import com.huateng.wxmgr.common.utils.ResultUtils;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/wxuser")
public class WxUserController {

	private final static Logger logger = LoggerFactory.getLogger(WxUserController.class);

	@Autowired
	private UserService userService;

	@Autowired
	private UserModalService userModalService;

	/**
	 * 分页条件查询
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/findusersbypage", method = RequestMethod.POST)
	public String findUsersByPage(@RequestParam Map<String, String> map) {

		logger.info("findTagsByPage+传入参数>>>>>>>>>>>>>>+" + map.toString());
		WxUserFans userFans = new WxUserFans();
		try {
			BeanUtils.populate(userFans, map);
		} catch (IllegalAccessException | InvocationTargetException e) {
			logger.error("map转对象异常");
			e.printStackTrace();
		}
		return userModalService.findTagsByPage(userFans);

	}

	/**
	 * 同步用户到本地数据库
	 * 
	 * @return
	 */
	@RequestMapping(value = "/synchrousers")
	public String synchroUsers() {
		// 获取所有的openid
		String nextOpenId = null;
		WxUserOpenId allUsersOpenId = userService.getAllUsersOpenId(nextOpenId);
		List<WxUserFans> allUsersInfo = userService.getAllUsersInfo(allUsersOpenId.getOpenidList());
		int j = userModalService.insertUsers(allUsersInfo);
		if (j == allUsersInfo.size()) {
			logger.info(">>>>>>>>>>>>>>>>>一共添加了" + j + "个用户到本地库");
			// List<String> allBlackList = userService.getAllBlackUsers(null);
			// 获取黑名单列表
			// int x = userModalService.addBlackUsers(allBlackList);
			// if (x == allBlackList.size()) {
			// logger.info(">>>>>>>>>>>>>>>>>一共设置" + x + "个黑名单用户到本地库");
			return Constant.SUCCESS;
			// }
			// return Constant.ERROR;
		} else if (j > 0 && j < allUsersInfo.size()) {
			logger.info(">>>>>>>>>>>>>>>>>一共添加了" + j + "个用户到本地库，还有" + (allUsersInfo.size() - j) + "个用户添加失败");
			return Constant.ERROR;
		} else {
			logger.info(">>>>>>>>>>>>>>>>>添加失败");
			return Constant.ERROR;
		}
	}

	/**
	 * 给用户添加备注
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/addremark", method = RequestMethod.POST)
	public String addRemark(@RequestParam Map<String, String> map) {
		// 提交微信服务器
		JSONObject result = userService.addRemark(map);
		if (ResultUtils.Result(result)) {
			// 更新本地库
			int i = userModalService.addRemark(map);
			if (i == 1) {
				return Constant.SUCCESS;
			}
		}
		return Constant.ERROR;
	}

	/**
	 * 拉黑用户
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/addblackusers", method = RequestMethod.POST)
	public String addBlackUsers(@RequestParam String ids) {
		List<String> idsList = Arrays.asList(ids.split(","));
		JSONObject result = userService.setBlackUsers(idsList);
		if (ResultUtils.Result(result)) {
			int i = userModalService.addBlackUsers(idsList);
			if (i == idsList.size()) {
				return Constant.SUCCESS;
			} else {
				return Constant.ERROR;
			}
		} else {
			return Constant.ERROR;
		}
	}

	/**
	 * 用户取消拉黑
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/unblackusers", method = RequestMethod.POST)
	public String unBlackUsers(@RequestParam String ids) {
		List<String> idsList = Arrays.asList(ids.split(","));
		JSONObject result = userService.unBlackUsers(idsList);
		if (ResultUtils.Result(result)) {
			int i = userModalService.unBlackUsers(idsList);
			if (i == idsList.size()) {
				return Constant.SUCCESS;
			} else {
				return Constant.ERROR;
			}
		} else {
			return Constant.ERROR;
		}

	}

}
