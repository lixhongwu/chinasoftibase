package com.huateng.weixin.user.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huateng.weixin.user.mapper.WxUserFansMapper;
import com.huateng.weixin.user.service.UserModalService;
import com.huateng.wxmgr.common.entity.WxUserFans;
import com.huateng.wxmgr.common.entity.WxUserFansExample;
import com.huateng.wxmgr.common.utils.Constant;

import net.sf.json.JSONObject;

@Service
public class UserModalServiceImpl implements UserModalService {

	private final static Logger logger = LoggerFactory.getLogger(UserModalService.class);

	@Autowired
	private WxUserFansMapper mapper;

	/**
	 * 批量添加客户
	 */
	@Override
	public int insertUsers(List<WxUserFans> userList) {
		int j = 0;
		for (WxUserFans wxUserFans : userList) {
			WxUserFans fans = mapper.selectByPrimaryKey(wxUserFans.getIds());
			if (fans == null) {
				int i = mapper.insert(wxUserFans);
				j += i;
			} else {
				int i = mapper.updateByPrimaryKey(wxUserFans);
				j += i;
			}

		}
		return j;
	}

	/**
	 * 分页条件查询
	 */
	@Override
	public String findTagsByPage(WxUserFans userFans) {
		// 设置分页条件
		WxUserFansExample example = new WxUserFansExample();
		// if(StringUtils.isNotEmpty(tags.getName())){
		// example.createCriteria().andNameLike("%"+tags.getName()+"%");
		// }
		// if(StringUtils.isNotEmpty(tags.getOrder())&&tags.getOrder().equals("desc")){
		// example.setOrderByClause("ids desc");
		// }else{
		// example.setOrderByClause("ids asc");
		// }

		// 分页查询
		PageHelper.startPage(userFans.getPage(), userFans.getRows());
		List<WxUserFans> list = mapper.selectByExample(example);

		JSONObject json = new JSONObject();
		json.put("rows", list);
		json.put("total", ((Page<WxUserFans>) list).getTotal());
		logger.info("findTagsByPage+分页查询后参数>>>>>>>>>>>>>>" + json.toString());
		return json.toString();
	}

	/**
	 * 添加用户标签
	 */
	@Override
	public int addRemark(Map<String, String> map) {

		if (map != null && map.size() > 0) {
			String ids = map.get("ids");
			String remark = map.get("remark");
			if (StringUtils.isNotEmpty(ids)) {
				WxUserFans wxUserFans = mapper.selectByPrimaryKey(ids);
				if (wxUserFans != null) {
					wxUserFans.setRemark(remark);
					int i = mapper.updateByPrimaryKey(wxUserFans);
					return i;
				}
			}
		}
		return 0;
	}

}
