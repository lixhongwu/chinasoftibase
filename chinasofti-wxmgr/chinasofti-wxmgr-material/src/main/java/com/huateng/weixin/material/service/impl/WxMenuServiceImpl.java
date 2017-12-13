package com.huateng.weixin.material.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huateng.weixin.material.mapper.WxMenuMapper;
import com.huateng.weixin.material.service.WxMenuservice;
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
		example.setOrderByClause("sort");
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
		example.setOrderByClause("sort");
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

		// PageHelper.startPage(wxMenu.getPage(), wxMenu.getRows());
		List<WxMenu> list = wxMenuMapper.selectByExample(example);

		JSONObject json = new JSONObject();
		json.put("rows", list);
		json.put("total", list.size());
		return json;
	}

	/**
	 * 保存微信菜单组
	 */
	@Override
	public int addMenuGroup(Map<String, String> menuMap) {
		WxMenu wxMenu = new WxMenu();
		String uuid = UUID.randomUUID().toString().replaceAll("-", "");
		String appid = menuMap.get("appid");
		String title = menuMap.get("title");
		String sort = menuMap.get("sort");
		wxMenu.setIds(uuid);
		wxMenu.setAppid(appid);
		wxMenu.setTitle(title);
		wxMenu.setUrltoken(title);
		wxMenu.setLevel((byte) 0);
		wxMenu.setIsShow((byte) 1);
		wxMenu.setSort(Byte.parseByte(sort));
		return wxMenuMapper.insert(wxMenu);
	}

	// public int addMenuGroup(WxMenu wxMenu) {
	// String uuid = UUID.randomUUID().toString().replaceAll("-", "");
	// wxMenu.setIds(uuid);
	// wxMenu.setAppid(wxMenu.getAppid());
	// wxMenu.setTitle(wxMenu.getTitle());
	// wxMenu.setUrltoken(wxMenu.getTitle());
	// wxMenu.setLevel((byte)0);
	// wxMenu.setIsShow((byte) 1);
	// wxMenu.setSort((byte) 1);
	// return wxMenuMapper.insert(wxMenu);
	// }
	/**
	 * 更新菜单组
	 */
	@Override
	public int updateMenuGroup(Map<String, String> map) {
		WxMenu menu = new WxMenu();
		try {
			BeanUtils.populate(menu, map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		String ids = map.get("ids");
		WxMenu wxMenu = wxMenuMapper.selectByPrimaryKey(ids);
		wxMenu.setTitle(map.get("title"));
		wxMenu.setSort(Byte.parseByte(map.get("sort")));
		wxMenu.setAppid(map.get("appid"));

		return wxMenuMapper.updateByPrimaryKey(wxMenu);
	}

	/**
	 * 通过分组id获取一级菜单
	 */
	@Override
	public List<WxMenu> findLevelOne(String gid) {
		WxMenuExample example = new WxMenuExample();
		example.createCriteria().andGidEqualTo(gid).andLevelEqualTo((byte) 1);
		example.setOrderByClause("sort");
		return wxMenuMapper.selectByExample(example);
	}

	/**
	 * 创建菜单
	 */
	@Override
	public int createMenu(WxMenu wxMenu) {

		return wxMenuMapper.insert(wxMenu);
	}

	/**
	 * 通过二级菜单pid获取一级菜单
	 */
	@Override
	public WxMenu findLevelOneMenuById(String pid) {

		return wxMenuMapper.selectByPrimaryKey(pid);
	}

	/**
	 * 判断该一级菜单是否有二级菜单
	 */
	@Override
	public boolean findLevelTwoMenuByPid(String pid) {
		WxMenuExample example = new WxMenuExample();
		example.createCriteria().andPidEqualTo(pid);
		int count = wxMenuMapper.countByExample(example);
		return count > 0 ? true : false;
	}

	/**
	 * 根据ids更新菜单
	 */
	@Override
	public void updateMenu(WxMenu menu) {
		wxMenuMapper.updateByPrimaryKey(menu);
	}

	/**
	 * 通过ids删除菜单及其二级菜单
	 */
	@Override
	public int deleteMenu(String ids) {

		// 删除其二级菜单
		WxMenuExample example = new WxMenuExample();
		example.createCriteria().andPidEqualTo(ids);
		wxMenuMapper.deleteByExample(example);
		// 删除该菜单
		int i = wxMenuMapper.deleteByPrimaryKey(ids);
		return i;
	}
	/**
	 * 更新菜单
	 * @param map
	 * @return
	 */
	@Override
	public int updataMenu(Map<String, String> map) {
		WxMenu wxMenu = null;
		// 获取ids
		String ids = map.get("ids");
		if (StringUtils.isNotEmpty(ids)) {
			wxMenu = wxMenuMapper.selectByPrimaryKey(ids);
		}
		String title = map.get("title");
		if (StringUtils.isNotEmpty(title)) {
			wxMenu.setTitle(title);
		}
		String url = map.get("url");
		if (StringUtils.isNotEmpty(url)) {
			wxMenu.setUrl(url);
		}
		String keyword = map.get("keyword");
		if (StringUtils.isNotEmpty(keyword)) {
			wxMenu.setKeyword(keyword);
		}
		String sort = map.get("sort");
		if (StringUtils.isNotEmpty(sort)) {
			wxMenu.setSort(Byte.parseByte(sort));
		}

		return wxMenuMapper.updateByPrimaryKey(wxMenu);
	}
	/**
	 * 删除该菜单组下的所有菜单.
	 * @param gid
	 */
	@Override
	public void deleteMenuByGid(String gid) {
		
		WxMenuExample example = new WxMenuExample();
		example.createCriteria().andGidEqualTo(gid);
		wxMenuMapper.deleteByExample(example);

	}

}
