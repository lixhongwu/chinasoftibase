package com.chinasofti.sp.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.sp.user.entity.SpUser;
import com.chinasofti.sp.user.mapper.SpUserMapper;

@Service
public class SpUserService {
	
	@Autowired
	private SpUserMapper spUserMapper;
	
	//通过ids查询单个用户
	public SpUser quetyById(String ids) {
		
		return spUserMapper.selectByPrimaryKey(ids);
		
	}
	//保存一个用户信息.
	public void save(SpUser spUser) {
		// TODO Auto-generated method stub
		spUserMapper.insertSelective(spUser);
	}
	
	
	//查询所有
	public List<SpUser> findAll() {
		return spUserMapper.selectByExample(null);
	}

	
	//删除一个用户
	public int delete(String ids) {
		return spUserMapper.deleteByPrimaryKey(ids);
	}
	
	//更新一个用户
	public int update(SpUser spUser) {
		return spUserMapper.updateByPrimaryKeySelective(spUser);
	}
	
	//更新一个用户
	public int update2(SpUser spUser) {
		return spUserMapper.updateByPrimaryKeySelective(spUser);
	}


}
