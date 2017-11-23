package com.huateng.weixin.user.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huateng.weixin.user.mapper.WxUserTagsMapper;
import com.huateng.weixin.user.service.TagModalService;
import com.huateng.wxmgr.common.entity.WxUserTags;
import com.huateng.wxmgr.common.entity.WxUserTagsExample;

import net.sf.json.JSONObject;
/**
 * tags本地数据服务类
 * @ClassName: TagModalServiceImpl.java
 * @Description: TODO
 * @author 金林
 * @Date: 2017年11月23日 下午1:04:11
 * @parma <T>
 */
@Service
public class TagModalServiceImpl implements TagModalService {

	private final static Logger logger = LoggerFactory.getLogger(TagModalServiceImpl.class);
	@Autowired
	private WxUserTagsMapper mapper;
	/**
	 * 分页条件查询
	 */
	@Override
	public String findTagsByPage(WxUserTags tags) {
		WxUserTagsExample example = new WxUserTagsExample();
		JSONObject json = new JSONObject();
		// 分页查询
		PageHelper.startPage(tags.getPage(), tags.getRows());
		List<WxUserTags> list = mapper.selectByExample(example);
		json.put("rows", list);
		json.put("total", ((Page<WxUserTags>) list).getTotal());
		logger.info("findTagsByPage+分页查询后参数>>>>>>>>>>>>>>" + json.toString());
		return json.toString();
	}
	/**
	 * 删除标签
	 */
	@Override
	public int deleteTagById(int id) {

		int i = mapper.deleteByPrimaryKey(id);
		logger.info("deleteTagById>>>>>>>>>>>>>>已删除的tags数=" + i);
		return i;

	}
	
	/**
	 * 通过id查找标签
	 */
	@Override
	public WxUserTags findTagById(int id) {
		WxUserTags userTags = mapper.selectByPrimaryKey(100);
		logger.info("deleteTagById>>>>>>>>>>>>>>" + userTags.toString());
		return userTags;
	}
	/**
	 * 添加标签
	 */
	@Override
	public int addTag(WxUserTags userTags) {
		int i = mapper.insert(userTags);
		logger.info("addTag>>>>>>>>>>添加"+i+"个标签成功");
		return i;
	}
	/**
	 * 查询标签fans总数
	 */
	@Override
	public int findCount(String ids) {
		
		WxUserTags wxUserTags = mapper.selectByPrimaryKey(Integer.parseInt(ids));
		logger.info("findCount>>>>>>>>>>标签:"+wxUserTags.getName()+"的fans总数是:"+wxUserTags.getFansnum()+"个");
		return wxUserTags.getFansnum();
	}
	/**
	 * 编辑标签
	 */
	@Override
	public int updataTag(WxUserTags userTags) {
		int i = mapper.updateByPrimaryKey(userTags);
		logger.info("updataTag>>>>>>>>>>编辑标签成功");
		return i;
	}
	/**
	 * 获取所有的订单
	 */
	@Override
	public List<WxUserTags> findAll() {
		WxUserTagsExample example = new WxUserTagsExample();
		return  mapper.selectByExample(example);
		
	}
	/**
	 * 删除所有标签
	 */
	@Override
	public void deleteAll() {
		WxUserTagsExample example = new WxUserTagsExample();
		example.createCriteria().andSynchroEqualTo(1);
		mapper.deleteByExample(example);
		
		
	}
	

}
