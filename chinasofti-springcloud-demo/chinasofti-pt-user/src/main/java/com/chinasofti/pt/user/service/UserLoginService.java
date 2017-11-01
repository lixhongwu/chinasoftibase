package com.chinasofti.pt.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.common.sp.entity.PtUser;
import com.chinasofti.common.sp.entity.PtUserExample;
import com.chinasofti.common.sp.entity.PtUserExample.Criteria;
import com.chinasofti.pt.user.mapper.PtUserMapper;

@Service
public class UserLoginService {
	
	@Autowired
	PtUserMapper ptUserMapper;

	public int selectUserByUsernameAndPassword(PtUser ptUser){
		
		PtUserExample example = new PtUserExample();
		Criteria criteria = example.createCriteria();
		
		criteria.andUsernameEqualTo(ptUser.getUsername());
		criteria.andPasswordEqualTo(ptUser.getPassword());
		
		List<PtUser> Userlist = ptUserMapper.selectByExample(example);
		
		if (Userlist.isEmpty()) {
			return 500;
		}
		return 200;
	}
	
}
