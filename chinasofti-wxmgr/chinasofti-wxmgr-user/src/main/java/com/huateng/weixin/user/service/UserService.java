package com.huateng.weixin.user.service;

import java.util.List;
import java.util.Map;

import com.huateng.wxmgr.common.entity.WxUserFans;
import com.huateng.wxmgr.common.entity.WxUserOpenId;

import net.sf.json.JSONObject;

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
	
	/**
	 * 根据用户openid获取用户信息
	 * @param nextOpenId
	 * @return
	 */
	public WxUserFans getUserInfo(String nextOpenId);
	/**
	 * 批量获取用户信息,一次最多能获取到100个用户信息.
	 * @param openidList
	 * @return
	 */
	public List<WxUserFans> getUsersInfo(List<String> openidList);
	
	/**
	 * 批量获取所有的用户信息.
	 * @param openidList
	 * @return
	 */
	public List<WxUserFans> getAllUsersInfo(List<String> openidList);
	
	/**
	 * 给用户添加备注
	 * @param map
	 * @return
	 */
	public JSONObject addRemark(Map<String,String> map);

}
