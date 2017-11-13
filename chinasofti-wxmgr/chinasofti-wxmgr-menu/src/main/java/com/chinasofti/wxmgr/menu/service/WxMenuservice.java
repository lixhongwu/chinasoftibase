package com.chinasofti.wxmgr.menu.service;

import java.util.List;

import com.huateng.wxmgr.common.entity.WxMenu;

import net.sf.json.JSONObject;

public interface WxMenuservice {
	/**
	 * 通过gid查询一级菜单
	 * 
	 * @param gid
	 * @return
	 */
	public List<WxMenu> getMenuByGid(String gid);

	/**
	 * 通过pid查询二级菜单
	 * 
	 * @param ids
	 * @return
	 */
	public List<WxMenu> getMenuByPid(String ids);

	/**
	 * 添加菜单
	 * 
	 * @param wxMenu
	 * @return
	 */
	public int addMenu(WxMenu wxMenu);

	/**
	 * 删除菜单组
	 * 
	 * @param gid
	 */
	public void delMenuGroup(String gid);
	/**
	 * 获取分组菜单列表
	 * @param wxMenu
	 * @return
	 */
	public JSONObject findGroupByPage(WxMenu wxMenu);

}
