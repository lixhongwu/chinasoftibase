package com.huateng.weixin.material.controller;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.huateng.weixin.material.model.MaterialList;
import com.huateng.weixin.material.service.AccessTokenService;
import com.huateng.weixin.material.service.MaterialService;

import net.sf.json.JSONObject;
@RestController
@RequestMapping("/material")
public class MaterialController {

	@Autowired
	private MaterialService materialService;

	@Autowired
	private AccessTokenService accessTokenService;

	private static Logger log = LoggerFactory.getLogger(MaterialController.class);

	// 上传临时素材
	@RequestMapping(value = "/addtem", method = RequestMethod.POST)
	public String add(File file) {
		// 调用接口获取access_token
		String at = accessTokenService.getAccessToken();
		if (at != null) {
			// 这里只是单纯地用图片image来测试
//			File file = new File("C:/Users/chen/Desktop/kobe.jpg");
			String i = materialService.uploadTemporaryMedia(at, file, null, null);
			log.info("media_id:" + i);
			return i;
		} else {
			log.error("显示失败");
			return "获取media_id失败";
		}
	}

	// 上传永久素材
	@RequestMapping(value = "/addper", method = RequestMethod.POST)
	public String addper(File file) {
		// 调用接口获取access_token
		String at = accessTokenService.getAccessToken();
		if (at != null) {
			// 这里只是单纯地用图片image来测试
//			File file = new File("C:/Users/chen/Desktop/kobe.jpg");
			String i = materialService.uploadPermanentMedia(at, file, null, null);
			log.info("media_id:" + i);
			return i;
		} else {
			log.error("显示失败");
			return "获取media_id失败";
		}
	}

	// 获取永久素材列表
	@RequestMapping(value = "/getlist", method = RequestMethod.POST)
	public JSONObject getlist() {
		// 调用接口获取access_token
//		String at = accessTokenService.getAccessToken();
		String at = "7AIV2WFsffRwS1pkJL5_dm585pV22SYk9ccz6NnFVS-54JO6YCChB7Vy_HuXWJBpULR9ZwRulVj-D7hlbcP2C_lTTW1XFq99iquG-xSKrouKynTWuE2aCaENvm7BytKVASSeAJAOGG";
		JSONObject a = materialService.getlist(getlist1(), at);
		log.info("获取素材列表为：" + a);
		return a;
		/*if (at != null) {
			String a = materialService.getlist(getlist1(), at);
			log.info("获取素材列表为：" + a);
			return a;
		} else {
			log.error("获取失败");
			return "error";
		}*/
	}

	// 新建一个固定的素材列表信息
	public MaterialList getlist1() {
		MaterialList materialList = new MaterialList();
		materialList.setType("image");// 返回图片素材
		materialList.setOffset("0");// 从第一个素材返回
		materialList.setCount("20");// 返回20个素材
		return materialList;
	}

	// 根据media_id来获取素材
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String get() {
		String at = accessTokenService.getAccessToken();
		return null;
	}
}
