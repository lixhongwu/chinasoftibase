package com.huateng.weixin.user.controller;

import java.lang.reflect.InvocationTargetException;
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
		WxUserFans userFans =new WxUserFans();
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
			return Constant.SUCCESS;

		} else if (j > 0 && j < allUsersInfo.size()) {
			logger.info(">>>>>>>>>>>>>>>>>一共添加了" + j + "个用户到本地库，还有" + (allUsersInfo.size() - j) + "个用户添加失败");
			return Constant.SUCCESS;
		} else {
			logger.info(">>>>>>>>>>>>>>>>>添加失败");
			return Constant.ERROR;
		}

	}

}
