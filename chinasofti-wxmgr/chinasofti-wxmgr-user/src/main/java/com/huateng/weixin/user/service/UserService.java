package com.huateng.weixin.user.service;

import com.huateng.wxmgr.common.entity.WxUserOpenId;

/**
 * 用来与微信服务器交互的接口
 * 
 * @ClassName: UserService.java
 * @Description: TODO
 * @author 金林
 * @Date: 2017年11月24日 下午2:56:13
 * @parma <T>
 */
public interface UserService {
	/**
	 * 一次性获取所有用户的openId
	 * 
	 * @return
	 */
	public WxUserOpenId getAllUsersOpenId(String nextOpenId);

	/**
	 * 获取用户的openId一次，一次最多能获取到10000个用户,
	 * 
	 * @param nextOpenId
	 * @return
	 */
	public WxUserOpenId getUsersOpenId(String nextOpenId);

}
