package com.chinasofti.sp.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.sp.user.entity.SpUser;
import com.chinasofti.sp.user.entity.SpUserExample;
import com.chinasofti.sp.user.mapper.SpUserMapper;

@Service
public class SpUserService {
	
	@Autowired
	private SpUserMapper spUserMapper;
	
	//通过ids查询单个用户
	public SpUser selectByPrimaryKey(String ids) {
		return spUserMapper.selectByPrimaryKey(ids);
	}

	/**
	 * 全部查询
	 * @return
	 */
	public List<SpUser> findAll(SpUserExample example) {
		return spUserMapper.selectByExample(example);
	}

	/**
	 * 添加插入(过滤空字段)
	 * @param spUser
	 */
	public void insertSelective(SpUser spUser) {
		spUserMapper.insertSelective(spUser);
	}

	/**
	 * ID删除
	 * @param ids
	 */
	public void deleteByPrimaryKey(String ids) {
		spUserMapper.deleteByPrimaryKey(ids);
	}
<<<<<<< HEAD
	//测试冲突
	public List<SpUser> findAll1() {
		return spUserMapper.selectByExample(null);
	}
	
	//删除一个用户
	public int delete(String ids) {
		return spUserMapper.deleteByPrimaryKey(ids);
=======

	/**
	 * 修改
	 * @param spUser
	 */
	public void updateByPrimaryKey(SpUser spUser) {
		spUserMapper.updateByPrimaryKey(spUser);
>>>>>>> f9d932afdbe70a26948e932dfba405eeb244734e
	}
	
	


}
