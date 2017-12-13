package com.huateng.weixin.material.service;

import java.util.List;
import java.util.Map;

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
	// public int addMenuGroup(WxMenu wxMenu);
	public int addMenuGroup(Map<String, String> menuMap);

	/**
	 * 删除菜单组
	 * 
	 * @param gid
	 */
	public void delMenuGroup(String ids);

	/**
	 * 获取分组菜单列表
	 * 
	 * @param wxMenu
	 * @return
	 */
	public JSONObject findGroupByPage();

	/**
	 * 更新菜单组
	 * 
	 * @param map
	 * @return
	 */
	public int updateMenuGroup(Map<String, String> map);

	/**
	 * 获取一级菜单
	 * 
	 * @param gid
	 * @return
	 */
	public List<WxMenu> findLevelOne(String gid);

	/**
	 * 创建菜单
	 * 
	 * @param wxMenu
	 * @return
	 */
	public int createMenu(WxMenu wxMenu);

	/**
	 * 通过菜单组的gid查找是否有一级菜单
	 * 
	 * @param string
	 * @return
	 */
	public WxMenu findLevelOneMenuById(String gid);

	/**
	 * 通过一级菜单的pid查找是否存在二级菜单
	 * 
	 * @param string
	 * @return
	 */
	public boolean findLevelTwoMenuByPid(String string);

	/**
	 * 更新菜单
	 * 
	 * @param levelOneMenu
	 */
	public void updateMenu(WxMenu levelOneMenu);

	/**
	 * 通过ids删除菜单
	 * 
	 * @param ids
	 * @return
	 */
	public int deleteMenu(String ids);

	/**
	 * 更新菜单
	 * 
	 * @param map
	 * @return
	 */
	public int updataMenu(Map<String, String> map);

	/**
	 * 通过gid删除菜单
	 * 
	 * @param ids
	 */
	public void deleteMenuByGid(String gid);

}
