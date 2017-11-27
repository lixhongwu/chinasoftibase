package com.huateng.weixin.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.huateng.weixin.user.mapper.WxUserFansMapper;
import com.huateng.weixin.user.service.UserModalService;
import com.huateng.wxmgr.common.entity.WxUserFans;
import com.huateng.wxmgr.common.entity.WxUserFansExample;

@Service
public class UserModalServiceImpl implements UserModalService {
	
	@Autowired
	private WxUserFansMapper mapper;
	/**
	 * 批量添加客户
	 */
	@Override
	public int insertUsers(List<WxUserFans> userList) {
		int j =0;
		for (WxUserFans wxUserFans : userList) {
			int i = mapper.insert(wxUserFans);
			j+=i;
		}
		return j;
	}
	/**
	 * 分页查询
	 */
	@Override
	public List<WxUserFans> findByPage(WxUserFans userFan) {
		
		WxUserFansExample example = new WxUserFansExample();
		PageHelper.startPage(userFan.getPageNumber(), userFan.getPageSize());
		List<WxUserFans> list = mapper.selectByExample(example );
		
		return list;
	}

}
