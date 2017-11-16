package com.huateng.weixin.material.service;

import java.io.File;

import com.huateng.weixin.material.model.MaterialList;
import com.huateng.weixin.material.model.WxMaterial;

import net.sf.json.JSONObject;

public interface MaterialService {
	//上传临时素材
	public String uploadTemporaryMedia(String accessToken, File file,String title, String introduction);
	//新增永久素材
	public String uploadPermanentMedia(String accessToken,File  file, String title, String introduction);
	//获取素材列表
	public JSONObject getlist(MaterialList materialList, String accessToken);
	//根据media_id获取临时素材
	public String get(WxMaterial wxMaterial,String accessToken);
}
