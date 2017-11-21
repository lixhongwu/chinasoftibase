package com.chinasofti.wxmgr.menu.service.impl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.wxmgr.menu.mapper.WxMenuMapper;
import com.chinasofti.wxmgr.menu.service.WxMenuservice;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huateng.wxmgr.common.entity.WxMenu;
import com.huateng.wxmgr.common.entity.WxMenuExample;

import net.sf.json.JSONObject;

/**
 * 菜单的服务层.
 * 
 * @ClassName: WxMenuService.java
 * @Description: TODO
 * @author 金林
 * @Date: 2017年11月9日 下午3:56:01
 * @parma <T>
 */
@Service
public class WxMenuServiceImpl implements WxMenuservice {

	@Autowired
	private WxMenuMapper wxMenuMapper;

	/**
	 * 通过组gid查询一级菜单
	 * 
	 * @param gid
	 * @return
	 */
	public List<WxMenu> getMenuByGid(String gid) {
		WxMenuExample example = new WxMenuExample();
		example.createCriteria().andPidEqualTo(gid);
		return wxMenuMapper.selectByExample(example);
	}

	/**
	 * 通过pid查询二级菜单
	 * 
	 * @param ids
	 * @return
	 */
	public List<WxMenu> getMenuByPid(String ids) {
		WxMenuExample example = new WxMenuExample();
		example.createCriteria().andPidEqualTo(ids);
		return wxMenuMapper.selectByExample(example);
	}

	/**
	 * 保存菜单(一级菜单,二级)
	 * 
	 * @param wxMenu
	 * @return
	 */
	public int addMenu(WxMenu wxMenu) {
		return wxMenuMapper.insert(wxMenu);
	}

	/**
	 * 删除菜单组
	 */
	public void delMenuGroup(String ids) {
		WxMenuExample example = new WxMenuExample();
		example.createCriteria().andIdsEqualTo(ids);
		wxMenuMapper.deleteByExample(example);

	}

	/**
	 * 分页查询分组页面
	 * 
	 * @param wxMenu
	 * @return
	 */
	public JSONObject findGroupByPage() {

		WxMenuExample example = new WxMenuExample();
		example.createCriteria().andLevelEqualTo((byte) 0);

		//PageHelper.startPage(wxMenu.getPage(), wxMenu.getRows());
		List<WxMenu> list = wxMenuMapper.selectByExample(example);

		JSONObject json = new JSONObject();
		json.put("rows", list);
		json.put("total", list.size());
		return json;
	}
	/**
	 * 获取所有分组信息
	 */
	@Override
	public JSONObject findAll() {
		
		List<WxMenu> list = wxMenuMapper.selectByExample(null);

		JSONObject json = new JSONObject();
		json.put("rows", list);
		json.put("total", ((Page<WxMenu>) list).getTotal());
		return json;
	}
	/**
	 * 保存微信菜单组
	 */
	@Override
	public int addMenuGroup(Map<String,String> menuMap) {
		WxMenu wxMenu= new WxMenu();
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		String appid=menuMap.get("appid");
		String title= menuMap.get("title");
		wxMenu.setIds(uuid);
		wxMenu.setAppid(appid);
		wxMenu.setTitle(title);
		wxMenu.setUrltoken(title);
		wxMenu.setLevel((byte)0);
		wxMenu.setIsShow((byte) 1);
		wxMenu.setSort((byte) 1);
		return wxMenuMapper.insert(wxMenu);
	}
	
//	public int addMenuGroup(WxMenu wxMenu) {
//		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
//		wxMenu.setIds(uuid);
//		wxMenu.setAppid(wxMenu.getAppid());
//		wxMenu.setTitle(wxMenu.getTitle());
//		wxMenu.setUrltoken(wxMenu.getTitle());
//		wxMenu.setLevel((byte)0);
//		wxMenu.setIsShow((byte) 1);
//		wxMenu.setSort((byte) 1);
//		return wxMenuMapper.insert(wxMenu);
//	}

	

}
