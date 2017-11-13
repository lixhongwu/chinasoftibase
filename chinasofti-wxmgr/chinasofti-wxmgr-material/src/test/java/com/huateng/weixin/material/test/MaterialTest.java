package com.huateng.weixin.material.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.huateng.weixin.material.service.MaterialService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MaterialTest {

	private final static Logger logger = LoggerFactory.getLogger(MaterialTest.class);
	
	@Autowired
	private MaterialService materialService;
	
	String at = "nYofxYdtgBBEzRbP6bg8_mLs0M43itUzy4yN2HlskO77vM1f2EH_GGB6lZj1i4nbvhJXBEXP7Zadmb-zGCmAHEAaLff_4flbPulTH3doW0d0ooTgYLb4MRwjF9rzMx4VXRGcAEAJDS";
	/**
	 * 测试上传图片
	 */
	@Test
	public void uploadTest() {
		String uploadPermanentMedia2 = materialService.uploadPermanentMedia(at, null, null);
		logger.info(uploadPermanentMedia2);
	}
}
