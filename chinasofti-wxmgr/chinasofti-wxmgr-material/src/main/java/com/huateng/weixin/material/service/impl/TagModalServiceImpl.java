package com.huateng.weixin.material.service.impl;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.huateng.weixin.material.mapper.WxUserTagsMapper;
import com.huateng.weixin.material.service.TagModalService;
import com.huateng.wxmgr.common.entity.WxUserTags;
import com.huateng.wxmgr.common.entity.WxUserTagsExample;
import com.huateng.wxmgr.common.utils.Constant;

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
		//设置分页条件
		WxUserTagsExample example = new WxUserTagsExample();
		if(StringUtils.isNotEmpty(tags.getName())){
			example.createCriteria().andNameLike("%"+tags.getName()+"%");
		}
		
		String sort = tags.getSort();
		String order = tags.getOrder();
		if(StringUtils.isNotEmpty(sort)&&StringUtils.isNotEmpty(order)){
			example.setOrderByClause(sort+" "+order);
		}
		
		//分页查询
		PageHelper.startPage(tags.getPage(), tags.getRows());
		List<WxUserTags> list = mapper.selectByExample(example);
		
		JSONObject json = new JSONObject();
		json.put("rows", list);
		json.put("total", ((Page<WxUserTags>)list).getTotal());
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
		WxUserTags userTags = mapper.selectByPrimaryKey(id);
		logger.info("findTagById>>>>>>>>>>>>>>" + userTags.toString());
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
	 * 获取所有的标签
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
	/**
	 * 检查标签重名
	 */
	@Override
	public String checkTagName(String name) {
		WxUserTagsExample example = new WxUserTagsExample();
		example.createCriteria().andNameEqualTo(name);
		List<WxUserTags> list = mapper.selectByExample(example);
		if(list ==null ||list.size()==0){
			return Constant.ERROR;
		}else{
			return Constant.SUCCESS;
		}
	}
	

}
