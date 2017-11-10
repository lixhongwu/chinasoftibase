package com.huateng.weixin.material.service;

import com.huateng.weixin.material.model.MaterialList;
import com.huateng.weixin.material.model.TemporaryMaterial;

public interface MaterialService {
	//上传临时素材
	public String uploadTemporaryMedia(String accessToken, String title, String introduction);
	//新增永久素材
	public String uploadPermanentMedia(String accessToken, String title, String introduction);
	//获取素材列表
	public String getlist(MaterialList materialList, String accessToken);
	//根据media_id获取临时素材
	public String get(TemporaryMaterial temporaryMaterial,String accessToken);
}
