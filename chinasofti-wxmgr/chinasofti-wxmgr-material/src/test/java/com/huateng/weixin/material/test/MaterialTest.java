package com.huateng.weixin.material.test;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.huateng.weixin.material.model.MaterialList;
import com.huateng.weixin.material.service.AccessTokenService;
import com.huateng.weixin.material.service.MaterialService;

import net.sf.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MaterialTest {

	private final static Logger logger = LoggerFactory.getLogger(MaterialTest.class);

	@Autowired
	private MaterialService materialService;
	@Autowired
	private AccessTokenService accessTokenService;

	String at = "7AIV2WFsffRwS1pkJL5_dm585pV22SYk9ccz6NnFVS-54JO6YCChB7Vy_HuXWJBpULR9ZwRulVj-D7hlbcP2C_lTTW1XFq99iquG-xSKrouKynTWuE2aCaENvm7BytKVASSeAJAOGG";

	// String at = accessTokenService.getAccessToken();
	/**
	 * 测试上传图片
	 */
	@Test
	public void uploadTest() {
		File file = new File("C:/Users/chen/Desktop/index.jpg");
		String uploadTemporaryMedia = materialService.uploadTemporaryMedia(at, file, null, null);
		logger.info(uploadTemporaryMedia);
	}

	@Test
	public void addTest() {
		File file = new File("C:/Users/chen/Desktop/Allen.jpg");
		String uploadPermanentMedia = materialService.uploadPermanentMedia(at, file, null, null);
		logger.info(uploadPermanentMedia);
	}

	@Test
	public void getListTest() {
		JSONObject a = materialService.getlist(getlist1(), at);
		a.replace("item", "rows");
		a.replace("total_count", "total");
		logger.info("获取素材列表为：" + a.replace("item", "rows"));
	}

	// 新建一个固定的素材列表信息
	public MaterialList getlist1() {
		MaterialList materialList = new MaterialList();
		materialList.setType("image");// 返回图片素材
		materialList.setOffset("0");// 从第一个素材返回
		materialList.setCount("20");// 返回20个素材
		return materialList;
	}
}
