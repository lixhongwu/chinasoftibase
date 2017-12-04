package com.huateng.weixin.user.service;

import java.util.List;

import com.huateng.wxmgr.common.entity.WxUserTags;

/**
 * 标签跟本地数据库交互的接口
 * @ClassName: TagModalService.java
 * @Description: TODO
 * @author 金林
 * @Date: 2017年11月22日 上午10:27:35
 * @parma <T>
 */
public interface TagModalService {
	
	/**
	 * 分页查询
	 * @param map
	 * @return
	 */
	public String findTagsByPage(WxUserTags tags);
	
	/**
	 * 删除标签
	 * @param id
	 * @return
	 */
	public int deleteTagById(int id);
	/**
	 * 查询单个标签
	 * @param id
	 * @return
	 */
	public WxUserTags findTagById(int id);
	/**
	 * 添加标签
	 * @param userTags
	 * @return
	 */
	public int addTag(WxUserTags userTags);
	/**
	 * 查询标签fans数
	 * @param ids
	 * @return
	 */
	public int findCount(String ids);
	/**
	 * 编辑本地标签
	 * @param userTags
	 * @return
	 */
	public int updataTag(WxUserTags userTags);
	/**
	 * 获取所有的标签
	 * @return
	 */
	public List<WxUserTags> findAll();
	/**
	 * 删除所有标签
	 */
	public void deleteAll();
	/**
	 * 检查重名
	 * @param name 
	 * @return
	 */
	public String checkTagName(String name);


}
