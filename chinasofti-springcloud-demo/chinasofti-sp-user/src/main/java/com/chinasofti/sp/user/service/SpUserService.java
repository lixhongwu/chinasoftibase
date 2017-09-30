package com.chinasofti.sp.user.service;

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

}
