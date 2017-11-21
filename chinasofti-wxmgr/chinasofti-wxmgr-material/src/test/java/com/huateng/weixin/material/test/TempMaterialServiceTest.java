package com.huateng.weixin.material.test;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.huateng.weixin.material.controller.MaterialController;
import com.huateng.weixin.material.mapper.WxMaterialMapper;
import com.huateng.weixin.material.model.Material;
import com.huateng.weixin.material.model.WxMaterial;
import com.huateng.weixin.material.service.MaterialService;
import com.huateng.weixin.material.util.JsonUtils;



/**@desc  : 素材管理
 * 
 * @date  : 2017年11月1日 上午10:30:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TempMaterialServiceTest {
	@Autowired
	private MaterialService materialService;
	
	private static Logger logger = LoggerFactory.getLogger(MaterialController.class);
	/**
	 * @desc ： 1.新增临时素材
	 *  
	 * @throws Exception void
	 */
	@Test
	public void testUploadTempMaterial() throws Exception {
		String  accessToken="5ttGEFJbo4h4Hkf9-hrez2seZ3thJxv7G5TZ69HInq6Zu04JIpHLkbG-9ePKdjbigq99gXRmnekVF7nQ7JRbdLsSyxPekxjS-O4NYeEhFD5ggW6-ZYk11p9KxrZbQ-CHUOFbACABVM";
		String  type="image";
		String  fileDir="C:\\Users\\chen\\Desktop\\kobe.jpg"; 
		JSONObject uploadTempMaterial = materialService.uploadTempMaterial(accessToken, type, fileDir);
		logger.info(uploadTempMaterial.toString());
	}

	/**
	 * @desc ： 2.获取临时素材
	 *  
	 * @throws Exception void
	 */
	@Test
	public void testGetTempMaterial() throws Exception {
		String  accessToken="5ttGEFJbo4h4Hkf9-hrez2seZ3thJxv7G5TZ69HInq6Zu04JIpHLkbG-9ePKdjbigq99gXRmnekVF7nQ7JRbdLsSyxPekxjS-O4NYeEhFD5ggW6-ZYk11p9KxrZbQ-CHUOFbACABVM";
		String  mediaId="rgQFVy3laSjpmpDz0ipiWlthBjR9zZGKJ3AbrlWG8z5qHtd_TKKeoMKnknTTLLJw"; // C:\\Users\\chen\\Desktop\\kobe.jpg
		String  fileDir="C:\\Users\\chen\\Desktop\\";  
		materialService.getTempMaterial(accessToken, mediaId, fileDir);


	}
	
	/**
	 * @desc ： 3.新增永久素材——上传永久图片——上传图文消息内的图片获取URL 
	 *  
	 * @throws Exception void
	 */
	@Test
	public void testUploadPermanentImg() throws Exception {
		String  accessToken="5ttGEFJbo4h4Hkf9-hrez2seZ3thJxv7G5TZ69HInq6Zu04JIpHLkbG-9ePKdjbigq99gXRmnekVF7nQ7JRbdLsSyxPekxjS-O4NYeEhFD5ggW6-ZYk11p9KxrZbQ-CHUOFbACABVM";
		String  fileDir="D:/img/2.png";
		materialService.uploadPermanentImg(accessToken, fileDir);

	}
	
	
	/**
	 * @desc ： 4.新增永久素材——新增其他类型永久素材(image、voice、thumb)
	 *  
	 * @throws Exception void
	 */
	@Test
	public void testUploadPermanentMaterial() throws Exception {
		String  accessToken="737EKTvGXdqOPr0ftrqrwZcgznXqj8GzY4p7krBsRxxah7PzYWNm4iznWYbk9aIt5bcTcVy3ep0-gT5OjfxcIpK9Aelr1Jc0MV3RKdr1n-wP4tSc2SnLzyyBiiK91U5tJLTjAJAFHP";
		String type="image";
		String  fileDir="C:\\Users\\chen\\Desktop\\bg_header.jpg";
		materialService.uploadPermanentMaterial(accessToken, type, fileDir);

	}
	
	/**
	 * @desc ： 5.获取永久素材列表 
	 *  
	 * @throws Exception void
	 */
	@Test
	public void testListPermanentMaterial() throws Exception {
		String  accessToken="737EKTvGXdqOPr0ftrqrwZcgznXqj8GzY4p7krBsRxxah7PzYWNm4iznWYbk9aIt5bcTcVy3ep0-gT5OjfxcIpK9Aelr1Jc0MV3RKdr1n-wP4tSc2SnLzyyBiiK91U5tJLTjAJAFHP";
		String type="image";
		String offset="0";
		String count="10";
		JSONObject listPermanentMaterial = materialService.listPermanentMaterial(accessToken, type, offset, count);
		JSONArray jsonArray = listPermanentMaterial.getJSONArray("item");
		System.out.println(jsonArray);
		List<Material> list = JsonUtils.jsonToList(jsonArray.toString(), Material.class);
		
		for (Material material : list) {
//			if((material.getMedia_id()))
		}
	}
	
	/**
	 * @desc ：6.获取永久素材
	 *  
	 * @throws Exception void
	 */
	@Test
	public void testGetPermanentMaterial() throws Exception {
		String  accessToken="5ttGEFJbo4h4Hkf9-hrez2seZ3thJxv7G5TZ69HInq6Zu04JIpHLkbG-9ePKdjbigq99gXRmnekVF7nQ7JRbdLsSyxPekxjS-O4NYeEhFD5ggW6-ZYk11p9KxrZbQ-CHUOFbACABVM";
		String mediaId="NFREZRuTaNgMSgnxT5agYkff8xLCKRjZPMXhS-lT6aE";
		String fileDir="D:/img/download/";
		materialService.getPermanentMaterial(accessToken, mediaId, fileDir);

	}
	
	/**
	 * @desc ：7.删除永久素材
	 *  
	 * @throws Exception void
	 */
	@Test
	public void testDeletePermanentMaterial() throws Exception {
		String  accessToken="5ttGEFJbo4h4Hkf9-hrez2seZ3thJxv7G5TZ69HInq6Zu04JIpHLkbG-9ePKdjbigq99gXRmnekVF7nQ7JRbdLsSyxPekxjS-O4NYeEhFD5ggW6-ZYk11p9KxrZbQ-CHUOFbACABVM";
		String mediaId="NFREZRuTaNgMSgnxT5agYkff8xLCKRjZPMXhS-lT6aE";
		materialService.deletePermanentMaterial(accessToken, mediaId);

	}
	
	
	

}
