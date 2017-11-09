package com.chinasofti.wxmgr.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.wxmgr.menu.mapper.WxMenuMapper;
import com.huateng.wxmgr.common.entity.WxMenu;
import com.huateng.wxmgr.common.entity.WxMenuExample;

@Service
public class WxMenuService {

	@Autowired
	private WxMenuMapper wxMenuMapper;

	public List<WxMenu> getMenuByGid(String gid) {
		WxMenuExample example =new WxMenuExample();
		example.createCriteria().andPidEqualTo(gid);
		return wxMenuMapper.selectByExample(example );
	}

	public List<WxMenu> getMenuByPid(String ids) {
		WxMenuExample example =new WxMenuExample();
		example.createCriteria().andPidEqualTo(ids);
		return wxMenuMapper.selectByExample(example);
	}
	
	
	
}
