package com.huateng.weixin.batch.mapper;

import java.util.List;

import com.huateng.weixin.batch.bean.WxUserFans;

public interface WxUserFansMapper {

	/**
	 * 查询用户列表
	 */
	List<WxUserFans> selectUser();
}
