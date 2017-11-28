package com.huateng.weixin.user.service;

import java.util.List;
import java.util.Map;

import com.huateng.weixin.user.service.impl.UserServiceImpl;
import com.huateng.wxmgr.common.entity.WxUserFans;

/**
 * 用来和本地数据库进行交互的Service接口，应该被{@link UserServiceImpl}所调用
 * 
 * @ClassName: UserModalService.java
 * @Description: TODO(用一句话描述类的作用)
 * @author: ghost
 * @version: V1.0
 * @Date: 2017年11月8日 下午4:49:46
 */
public interface UserModalService {
	/**
	 * 批量添加用户
	 * @param userList
	 * @return
	 */
	public int insertUsers(List<WxUserFans> userList);
	/**
	 * 分页查询
	 * @param userFan
	 * @return
	 */
	public String findTagsByPage(WxUserFans userFans);
	/**
	 * 添加用户标签
	 * @param map
	 * @return 
	 */
	public int addRemark(Map<String, String> map);

}
