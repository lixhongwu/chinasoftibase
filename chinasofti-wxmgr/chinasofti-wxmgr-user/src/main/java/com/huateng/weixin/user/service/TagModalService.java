package com.huateng.weixin.user.service;

import java.util.List;
import java.util.Map;

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

}
