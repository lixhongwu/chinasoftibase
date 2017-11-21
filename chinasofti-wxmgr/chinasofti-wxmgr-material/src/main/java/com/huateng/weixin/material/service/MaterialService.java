package com.huateng.weixin.material.service;

import java.io.File;
import java.util.List;

import com.huateng.weixin.material.model.WxMaterial;



public interface MaterialService {
	//1上传临时素材
	public com.alibaba.fastjson.JSONObject uploadTempMaterial(String accessToken,String type,String fileDir) throws Exception;
	//2获取临时素材
	public File getTempMaterial(String accessToken,String mediaId,String fileDir) throws Exception;
	//3新增永久素材
	public String uploadPermanentImg(String accessToken,String fileDir) throws Exception;
	//4新增永久素材其他素材
	public com.alibaba.fastjson.JSONObject uploadPermanentMaterial(String accessToken,String type,String fileDir) throws Exception;
	//5获取永久素材列表
	public com.alibaba.fastjson.JSONObject listPermanentMaterial(String accessToken, String type, String offset,String count) throws Exception;
	//6获取永久素材
	public File getPermanentMaterial(String accessToken, String mediaId,String fileDir) throws Exception;
	//7删除永久素材
	public com.alibaba.fastjson.JSONObject deletePermanentMaterial(String accessToken, String mediaId) throws Exception;
	//从数据库获取素材列表
	public List<WxMaterial> findAll();
	//往数据库里插入同步更新未有的数据
	public void insert(WxMaterial wxMaterial);
}
