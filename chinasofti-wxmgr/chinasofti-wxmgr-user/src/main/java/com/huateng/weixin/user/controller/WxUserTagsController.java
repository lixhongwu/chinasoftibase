package com.huateng.weixin.user.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huateng.weixin.user.service.TagModalService;
import com.huateng.weixin.user.service.TagService;
import com.huateng.wxmgr.common.entity.SynTag;
import com.huateng.wxmgr.common.entity.WxUserTags;
import com.huateng.wxmgr.common.utils.Constant;
import com.huateng.wxmgr.common.utils.JsonUtils;
import com.huateng.wxmgr.common.utils.ResultUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 标签服务控制类
 * 
 * @ClassName: WxUserTagsController.java
 * @Description: TODO
 * @author 金林
 * @Date: 2017年11月23日 下午4:10:11
 * @parma <T>
 */
@RequestMapping("/usertags")
@RestController
public class WxUserTagsController {

	private final static Logger logger = LoggerFactory.getLogger(WxUserTagsController.class);

	// 与微信交互对象
	@Autowired
	private TagService tagService;
	// 本地服务对象
	@Autowired
	private TagModalService tagsModalService;

	/**
	 * 分页查询服务
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/findTagsByPage", method = RequestMethod.POST)
	public String findTagsByPage(@RequestParam Map<String, String> map) {
		logger.info("findTagsByPage+传入参数>>>>>>>>>>>>>>+" + map.toString());
		WxUserTags tags = new WxUserTags();
		try {
			BeanUtils.populate(tags, map);
		} catch (IllegalAccessException | InvocationTargetException e) {
			logger.error("map转对象异常");
			e.printStackTrace();
		}
		return tagsModalService.findTagsByPage(tags);
	}

	/**
	 * 创建标签服务
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/addtags", method = RequestMethod.POST)
	public String addTags(@RequestParam Map<String, String> map) {
		String name = map.get("name");
		Assert.notNull(name, "addTags>>>>>>>>>>标签名不能为空!");
		JSONObject tag = tagService.createTag(name);
		// 判断返回信息是否为错误信息
		if (ResultUtils.Result(tag)) {
			logger.info("addTags>>>>>>>>>>微信服务器创建tag成功:" + tag.toString());
			WxUserTags userTags = new WxUserTags();
			int ids = tag.getJSONObject("tag").getInt("id");
			// 将tag传入tagModal服务,保存到本地数据库中
			userTags.setName(name);
			userTags.setIds(ids);
			userTags.setDescription(map.get("description"));
			int i = tagsModalService.addTag(userTags);
			return i == 1 ? Constant.SUCCESS : Constant.ERROR;
		}
		return Constant.ERROR;
	}

	/**
	 * 删除标签服务
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/deletetagbyid", method = RequestMethod.POST)
	public String deleteTagById(@RequestParam String ids) {

		Assert.notNull(ids, "deleteTagByID>>>>>>>>>>>>>>>>ids不能为空");
		// 先删除服务器标签,查询fans数据
		int fansNum = tagsModalService.findCount(ids);
		if (fansNum < 100000) {
			int id = Integer.parseInt(ids);
			JSONObject object = tagService.deleteTag(id);
			// 微信服务器删除成功,删除本地数据
			if (ResultUtils.Result(object)) {
				int i = tagsModalService.deleteTagById(id);

				return i == 1 ? Constant.SUCCESS : Constant.ERROR;
			}
		} else {
			logger.error("deleteTagById>>>>>>>>>>该标签下粉丝数量为" + fansNum + "个,已超过超过10W,请先解绑标签!");
			JSONObject json = new JSONObject();
			json.put("errmgs", "该标签下粉丝数量超过10W,请先解绑标签!");
			return json.toString();
		}
		return Constant.ERROR;
	}

	/**
	 * 编辑标签
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/updatetags", method = RequestMethod.POST)
	public String updataTag(@RequestParam Map<String, String> map) {

		int ids = Integer.parseInt(map.get("ids"));
		String name = map.get("name");
		Assert.notNull(ids, "updataTag>>>>>>ids不能为空");
		Assert.notNull(map.get("name"), "updataTag>>>>>>name不能为空");
		// 先编辑微信服务器端的标签
		JSONObject object = tagService.editTag(ids, name);
		// 如果服务端编辑成功
		if (ResultUtils.Result(object)) {
			WxUserTags userTags = new WxUserTags();
			// 编辑本地数据库
			userTags.setName(name);
			userTags.setIds(ids);
			int i = tagsModalService.updataTag(userTags);
			return i == 1 ? Constant.SUCCESS : Constant.ERROR;
		}
		return Constant.ERROR;

	}

	/**
	 * 同步标签
	 * 
	 * @return
	 */
	@RequestMapping(value = "/synchrotags", method = RequestMethod.POST)
	public String synchroTags() {
		List<SynTag> synList=null;
		int y =0;
		// 从服务器获取标签
		JSONObject tags = tagService.getTags();
		if (ResultUtils.Result(tags)) {
			JSONArray jsonArray = tags.getJSONArray("tags");
			synList = JsonUtils.jsonToList(jsonArray.toString(), SynTag.class);
			
			List<WxUserTags> modalList = tagsModalService.findAll();
			Map<Integer,String> modalMap =new HashMap<>();
			//封装map；
			for (WxUserTags wxUserTags : modalList) {
				Integer ids = wxUserTags.getIds();
				String description = wxUserTags.getDescription();
				modalMap.put(ids, description);
			}
			
			//删除本地库所有标签
			tagsModalService.deleteAll();
			
			
			for (SynTag synTag : synList) {
				int id = synTag.getId();
				String name = synTag.getName();
				int count = synTag.getCount();
				
				WxUserTags tag=new WxUserTags();
				tag.setIds(id);
				tag.setName(name);
				tag.setFansnum(count);
				String desc = modalMap.get(id);
				if(StringUtils.isNotEmpty(desc)){
					tag.setDescription(desc);
				}
				int i = tagsModalService.addTag(tag);
				y+=i;
			}
		}
		if(y==synList.size()){
			return Constant.SUCCESS;
		}else{
			return Constant.ERROR;
		}
		
	}
	/**
	 * 同步标签2
	 * 
	 * @return
	 */
	// @RequestMapping(value = "/synchrotags", method = RequestMethod.POST)
	// public String synchroTags() {
	// // 从服务器获取标签
	// JSONObject tags = tagService.getTags();
	// if (ResultUtils.Result(tags)) {
	// JSONArray jsonArray = tags.getJSONArray("tags");
	// List<SynTag> synList = JsonUtils.jsonToList(jsonArray.toString(),
	// SynTag.class);
	// Set<Integer> idSet = new HashSet<>();
	// // 将所有id封装入Set集合
	// for (SynTag synTag : synList) {
	// int id = synTag.getId();
	// idSet.add(id);
	// }
	// List<WxUserTags> modalList = tagsModalService.findAll();
	// if (modalList != null && modalList.size() > 0) {
	// // 删除本地库多出来的标签
	// for (WxUserTags wxUserTags : modalList) {
	//
	// int ids = wxUserTags.getIds();
	// //不包含怎删除
	// if (!idSet.contains(ids)) {
	// tagsModalService.deleteTagById(ids);
	// //包含则删除Set
	// }else{
	// idSet.remove(ids);
	// }
	// }
	// }
	// //遍历idset中剩余的id,并添加到本地库
	// if(idSet!=null&&idSet.size()>0){
	// for (Integer id : idSet) {
	// }
	// }
	// }
	// return null;
	// }

}
