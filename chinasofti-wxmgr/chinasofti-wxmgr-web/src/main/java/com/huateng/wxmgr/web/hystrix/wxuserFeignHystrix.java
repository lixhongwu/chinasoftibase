package com.huateng.wxmgr.web.hystrix;

import java.util.Map;

import com.huateng.wxmgr.common.utils.Constant;
import com.huateng.wxmgr.web.feign.UserFeign;

public class wxuserFeignHystrix  implements UserFeign{

	@Override
	public String findTagsByPage(Map<String, String> map) {
		return Constant.CALLBACK;
	}
	
	@Override
	public String synchroUsers() {
		return Constant.CALLBACK;
	}

//	@Override
//	public String addTags(Map<String, String> map) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String deleteTagByID(String ids) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String updataTag(Map<String, String> map) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

}
