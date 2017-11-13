package com.huateng.wxmgr.web.hystrix;

import org.springframework.stereotype.Component;

import com.huateng.wxmgr.common.entity.WxMenu;
import com.huateng.wxmgr.web.feign.MenuFeign;

import net.sf.json.JSONObject;

@Component
public class MenuFeignClientHystrix implements MenuFeign {

	@Override
	public WxMenu findById(String id) {
		return null;
	}

	@Override
	public JSONObject findGroupByPage(WxMenu wxMenu) {
		return null;
	}

}
