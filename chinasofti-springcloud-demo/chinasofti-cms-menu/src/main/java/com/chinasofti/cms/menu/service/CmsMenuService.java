package com.chinasofti.cms.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.cms.menu.entity.CmsMenuManage;
import com.chinasofti.cms.menu.mapper.CmsMenuManageMapper;


@Service
public class CmsMenuService {
	
	@Autowired
	private CmsMenuManageMapper cmsMenuManageMapper;
	
	//查询所有菜单项
	public List<CmsMenuManage> findAll() {
		return cmsMenuManageMapper.selectByExample(null);
	}

	
	//删除菜单项
	public int delete(Integer id) {
		return cmsMenuManageMapper.deleteByPrimaryKey(id);
	}
	
	//更新菜单项
	public int update(CmsMenuManage cmsMenuManage) {
		return cmsMenuManageMapper.updateByPrimaryKeySelective(cmsMenuManage);
	}
	


}
