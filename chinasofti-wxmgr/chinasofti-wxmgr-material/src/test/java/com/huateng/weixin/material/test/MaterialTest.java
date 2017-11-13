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

@RunWith(SpringRunner.class)
@SpringBootTest
public class MaterialTest {

	private final static Logger logger = LoggerFactory.getLogger(MaterialTest.class);

	@Autowired
	private MaterialService materialService;
	@Autowired
	private AccessTokenService accessTokenService;

	String at = "QrT4ZkzOzhvlkVlk4sEUWKVE96I5CkS-qJ1WYqp4CzPUdpL96CLOcAnWd3BXTc_XYRp8fRylnY8cGRG73tco70--rw3X4_hjRS_qIT0fY64aTL0GSvlpqvUKIFp4YSMQHDCiABASON";

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
		String a = materialService.getlist(getlist1(), at);
		logger.info("获取素材列表为：" + a);
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
