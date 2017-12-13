package com.huateng.weixin.material.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huateng.weixin.material.mapper.WxUserFansMapper;
import com.huateng.weixin.material.service.TagModalService;
import com.huateng.weixin.material.service.UserModalService;
import com.huateng.weixin.material.service.UserService;
import com.huateng.wxmgr.common.entity.WxUserFans;
import com.huateng.wxmgr.common.entity.WxUserFansExample;
import com.huateng.wxmgr.common.entity.WxUserFansExample.Criteria;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class UserModalServiceImpl implements UserModalService {

	private final static Logger logger = LoggerFactory.getLogger(UserModalService.class);

	@Autowired
	private UserService userService;

	@Autowired
	private WxUserFansMapper mapper;

	@Autowired
	private TagModalService tagModalService;

	/**
	 * 批量添加客户
	 */
	@Override
	public int insertUsers(List<WxUserFans> userList) {
		// 获取黑名单列表
		List<String> allBlackUsers = userService.getAllBlackUsers(null);
		int j = 0;
		for (WxUserFans wxUserFans : userList) {
			// 判断是否有标签，如有，则设置标签名
			String tagidList = wxUserFans.getTagidList();
			JSONArray tagsArray = JSONArray.fromObject(tagidList);
			if (tagsArray.size() > 0) {
				String tags = "";
				for (Object obj : tagsArray) {
					int tagsid = Integer.parseInt(obj.toString());
					String tagName = tagModalService.findTagById(tagsid).getName();
					tags += tagName + ",";
				}
				logger.info(">>>>>>>>>>>>>>>>>>>>>>>tagsArray.get(0)" + tags);
				wxUserFans.setTagidList(tags.substring(0, tags.length() - 1));
			} else {
				wxUserFans.setTagidList("");
			}
			// 判断是否是黑名单。
			wxUserFans.setBlack("0");
			if (allBlackUsers.contains(wxUserFans.getIds())) {
				wxUserFans.setBlack("1");
			}
			WxUserFans fans = mapper.selectByPrimaryKey(wxUserFans.getIds());
			if (fans == null) {
				// 新增值
				int i = mapper.insert(wxUserFans);
				j += i;
			} else {
				// null值不改变,只改变非null值.
				int i = mapper.updateByPrimaryKeySelective(wxUserFans);
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
		String nickname = userFans.getNickname();
		String sort = userFans.getSort();
		String order = userFans.getOrder();
		String subscribe = userFans.getSubscribe();// 关注,
		String subscribeTime = userFans.getSubscribeTime();
		String black = userFans.getBlack();
		String tagidList = userFans.getTagidList();
		String sex = userFans.getSex();

		// 设置分页条件
		WxUserFansExample example = new WxUserFansExample();
		Criteria criteria = example.createCriteria();
		if (StringUtils.isNotEmpty(nickname)) {
			criteria.andNicknameLike("%" + nickname + "%");
		}
		if (StringUtils.isNotEmpty(subscribe)) {
			criteria.andSubscribeEqualTo(subscribe);
		}

		if (StringUtils.isNotEmpty(subscribeTime)) {
			criteria.andAppidGreaterThanOrEqualTo(subscribeTime);
			//criteria.andSubscribeTimeGreaterThan(subscribeTime);
		}

		if (StringUtils.isNotEmpty(black)) {
			criteria.andBlackEqualTo(black);
		}
		if (StringUtils.isNotEmpty(sex)) {
			criteria.andSexEqualTo(sex);
		}
		// 排序
		if (StringUtils.isNotEmpty(sort) && StringUtils.isNotEmpty(order)) {
			if (sort.equals("subscribeTime")) {
				sort = "SUBSCRIBE_TIME";
			}
			example.setOrderByClause(sort + " " + order);
		}

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
	 * 添加用户备注
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

	/**
	 * 设置黑名单
	 */
	@Override
	public int addBlackUsers(List<String> idsList) {
		int j = 0;
		if (idsList != null && idsList.size() > 0) {
			for (String string : idsList) {
				WxUserFans userFans = new WxUserFans();
				userFans.setIds(string);
				userFans.setBlack("1");
				int i = mapper.updateByPrimaryKeySelective(userFans);
				j += i;
			}
		}
		return j;
	}

	/**
	 * 取消黑名单
	 * 
	 * @param idsList
	 * @return
	 */
	@Override
	public int unBlackUsers(List<String> idsList) {
		int j = 0;
		if (idsList != null && idsList.size() > 0) {
			for (String string : idsList) {
				WxUserFans userFans = new WxUserFans();
				userFans.setIds(string);
				userFans.setBlack("0");
				int i = mapper.updateByPrimaryKeySelective(userFans);
				j += i;
			}
		}
		return j;
	}

}
