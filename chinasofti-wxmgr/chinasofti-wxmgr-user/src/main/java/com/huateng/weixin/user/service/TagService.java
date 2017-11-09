package com.huateng.weixin.user.service;

import java.util.List;

import com.google.gson.JsonObject;

public interface TagService {
	/**
	 * 创建一个标签。<br />
	 * 微信服务器在创建标签之后将会返回这个标签的id。<br />
	 * 需要注意的是，一个公众号的标签数量不能超过100个。
	 * @param name 标签名
	 * @return
	 */
	public JsonObject createTag(String name);

	/**
	 * 获取公众号已经创建的标签列表。<br />
	 * 获取到的标签有下面三个数据：<br />
	 * <ol>
	 * 	<li>id:标签的id</li>
	 * 	<li>name:标签的名称</li>
	 * 	<li>count:该标签下的粉丝数量</li>
	 * </ol>
	 * @return
	 */
	public JsonObject getTags();
	
	/**
	 * 修改一个标签的名称。
	 * @param id	标签的id，这个id是服务器返回给我们的id
	 * @param name	标签的新名称
	 * @return
	 */
	public JsonObject editTag(int id, String name);
	
	/**
	 * 删除一个标签。
	 * @param id	标签的id，这个id是服务器返回给我们的id
	 * @return
	 */
	public JsonObject deleteTag(int id);
	
	/**
	 * 获取指定标签下的粉丝列表<br />
	 * @param tagId		标签id
	 * @param nextOpId	下一个openid，如果为空，那么就是从头查
	 * @return
	 */
	public JsonObject getFans(int tagId, String nextOpenId) ;
	
	/**
	 * 批量为用户添加Tag
	 * @param openIds	用户的openId列表
	 * @param tagId		指定的标签的tagId
	 * @return
	 */
	public JsonObject batchTag(List<String> openIds, int tagId);
	
	/**
	 * 批量为用户取消Tag
	 * @param openIds	用户的openId列表
	 * @param tagId		指定的标签的tagId
	 * @return
	 */
	public JsonObject batchUntag(List<String> openIds, int tagId);
	
	/**
	 * 获取用户身上的标签列表
	 * @param openId
	 * @return
	 */
	public JsonObject getIdList(String openId);
}
