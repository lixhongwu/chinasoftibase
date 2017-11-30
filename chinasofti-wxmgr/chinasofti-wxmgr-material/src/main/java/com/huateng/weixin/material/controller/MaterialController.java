package com.huateng.weixin.material.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.huateng.weixin.material.model.Material;
import com.huateng.weixin.material.model.WxMaterial;
import com.huateng.weixin.material.service.AccessTokenService;
import com.huateng.weixin.material.service.MaterialService;
import com.huateng.weixin.material.util.JsonUtils;

@RestController
@RequestMapping("/material")
public class MaterialController {

	@Autowired
	private MaterialService materialService;

	@Autowired
	private AccessTokenService accessTokenService;

	private static Logger logger = LoggerFactory.getLogger(MaterialController.class);

	//上传临时素材
	@RequestMapping("/uploadTempMaterial")
	public JSONObject uploadTempMaterial(String fileDir){
		try {
			String accessToken= accessTokenService.getAccessToken();
			String type = "image";
			JSONObject jsonObject = materialService.uploadTempMaterial(accessToken, type, fileDir);
			logger.info(jsonObject.toString());
			return jsonObject;
		} catch (Exception e) {
			e.printStackTrace(); 
			logger.info(">>>>>>>>>>>上传素材失败");
			return null;
		}
	}
	//上传永久素材
	@RequestMapping("/uploadPermanentImg") 
	public String uploadPermanentImg(String fileDir){
		try {
			String accessToken= accessTokenService.getAccessToken();
			String uploadPermanentImg = materialService.uploadPermanentImg(accessToken, fileDir);
			logger.info(uploadPermanentImg);
			return uploadPermanentImg;
		} catch (Exception e) {
			logger.info(">>>>>>>>>>上传永久素材失败");
			e.printStackTrace();
			return null;
		}
	}
	//新增永久素材其他素材
	@RequestMapping("/uploadPermanentMaterial")
	public JSONObject uploadPermanentMaterial(String fileDir){
		try {
			String accessToken= accessTokenService.getAccessToken();
			String type = "image";
			JSONObject uploadPermanentMaterial = materialService.uploadPermanentMaterial(accessToken, type, fileDir);
			logger.info(uploadPermanentMaterial.toString());
			return uploadPermanentMaterial;
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(">>>>>>>>>>>>>上传其他永久素材失败");
			return null; 
		}
	}
	//获取永久素材列表
	@RequestMapping("/listPermanentMaterial")
	public JSONObject listPermanentMaterial(){
		try {
			String accessToken= accessTokenService.getAccessToken();
			String type = "image";
			String offset = "0";
			String count = "20";
			JSONObject listPermanentMaterial = materialService.listPermanentMaterial(accessToken, type, offset, count);
			JSONArray jsonArray = listPermanentMaterial.getJSONArray("item");
			logger.info(">>>>>>>>>>>>item："+ jsonArray);
			List<Material> list1 = JsonUtils.jsonToList(jsonArray.toString(), Material.class);
			List<WxMaterial> list2 = findAll();
			Set<String> set1 = new HashSet<String>();
			//将数据库中的数据根据media_id来判断是否存在  把mediaId存到set集合中
			for (WxMaterial wxMaterial : list2) {
				String mediaId = wxMaterial.getMediaId();
				set1.add(mediaId);
			}
			for (Material material : list1) {
				String media_id = material.getMedia_id();
				if(!set1.contains(media_id)){
					//当查询调用素材列表接口数据库中未有此数据 重新插入数据库中
					WxMaterial wxMaterial2 = new WxMaterial();
					wxMaterial2.setFileName(material.getName());
					wxMaterial2.setFlag(1);
					wxMaterial2.setCreateTime(material.getUpdate_time());
					wxMaterial2.setMediaId(material.getMedia_id());
					wxMaterial2.setUrl(material.getUrl());
					materialService.insert(wxMaterial2);
				}
			}
			/*for (WxMaterial wxMaterial : list2) {
				for (Material material : list1) {
					if(!wxMaterial.getMediaId().equals(material.getMedia_id())){
						WxMaterial wxMaterial2 = new WxMaterial();
						wxMaterial2.setFileName(material.getName());
						wxMaterial2.setFlag(1);
						wxMaterial2.setCreateTime(material.getUpdate_time());
						wxMaterial2.setMediaId(material.getMedia_id());
						wxMaterial2.setUrl(material.getUrl());
						materialService.insert(wxMaterial2);
					}
				}
			}*/
			logger.info(listPermanentMaterial.toString());
			return listPermanentMaterial;
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(">>>>>>>>>>>>>获取素材列表失败");
			return null;
		}
	}
	//删除永久素材
	@RequestMapping("/deletePermanentMaterial")
	public JSONObject deletePermanentMaterial(String mediaId){
		try {
			String accessToken = accessTokenService.getAccessToken();
			logger.info("accesstoken>>>>>>>>>>>>>>>>>>>"+accessToken);
			JSONObject deletePermanentMaterial = materialService.deletePermanentMaterial(accessToken, mediaId);
			logger.info(deletePermanentMaterial.toString());
			return deletePermanentMaterial;
		} catch (Exception e) {
			e.printStackTrace(); 
			logger.info(">>>>>>>>>>>>>>>删除永久素材失败");
			return null;
		}
	} 
	
	@RequestMapping("/findAll")
	public List<WxMaterial> findAll(){
		try {
			List<WxMaterial> list = materialService.findAll();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			logger.info(">>>>>>>>>>>>>>从数据库中获取素材列表失败");
			return null;
		}
	}
}