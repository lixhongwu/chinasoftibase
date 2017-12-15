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
import com.huateng.weixin.material.service.MaterialService;
import com.huateng.wxmgr.common.entity.Material;
import com.huateng.wxmgr.common.service.AccessTokenService;



/**@desc  : 素材管理
 * 
 * @date  : 2017年11月1日 上午10:30:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TempMaterialServiceTest {
	@Autowired
	private MaterialService materialService;
	
	@Autowired
	private AccessTokenService accessTokenService;
	
	private static Logger logger = LoggerFactory.getLogger(MaterialController.class);
	/**
	 * @desc ： 1.新增临时素材
	 *  
	 * @throws Exception void
	 */
	@Test
	public void testUploadTempMaterial() throws Exception {
		String  accessToken= accessTokenService.getAccessToken();
		String  type="image";
		String  fileDir="C:\\Users\\chen\\Desktop\\32b66697144575f2d831da4779161fbb.jpg"; //Qnm30FMOGv_ICtfK6X-F0HJ9Nb-PzghH4WXYbrm6Nge8xeIsbwXO3PPvRG1u_FLz
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
		String  accessToken= accessTokenService.getAccessToken();
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
		String  accessToken=accessTokenService.getAccessToken();
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
		String  accessToken= accessTokenService.getAccessToken();
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
		String  accessToken= accessTokenService.getAccessToken();
		String type="image";
		String offset="0";
		String count="10";
		JSONObject listPermanentMaterial = materialService.listPermanentMaterial(accessToken, type, offset, count);
		JSONArray jsonArray = listPermanentMaterial.getJSONArray("item");
		System.out.println(jsonArray);
		List<Material> list = com.huateng.wxmgr.common.utils.JsonUtils.jsonToList(jsonArray.toString(), Material.class);
		
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
		String  accessToken= accessTokenService.getAccessToken();
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
		String  accessToken= accessTokenService.getAccessToken();
		String mediaId="NFREZRuTaNgMSgnxT5agYkff8xLCKRjZPMXhS-lT6aE";
		materialService.deletePermanentMaterial(accessToken, mediaId);

	}
	
	@Test
	public static void insertSort(int[] datas){
		//外层循坏
		for (int i = 0; i < datas.length; i++) {
			int temp = datas[i];
			//里层循环
			for (int j = i-1; j >= 0; j--) {
				//如果前一个元素大于后一个元素（temp）前面的元素要顺序往后移动
				if(datas[j] > temp){
					datas[j+1] = datas[j];
				}else{
					//否则，插入到第一个比该元素要小的元素后面
					datas[j+1] = temp;
				}
			}
		}
	}
	

}
