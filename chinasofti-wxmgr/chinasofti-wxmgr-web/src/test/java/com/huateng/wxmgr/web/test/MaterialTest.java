package com.huateng.wxmgr.web.test;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;

import com.huateng.wxmgr.web.controller.MaterialController;
import com.huateng.wxmgr.web.feign.MaterialFeignClient;


@RunWith(SpringRunner.class)
@SpringBootTest
public class MaterialTest {

	private final static Logger logger = LoggerFactory.getLogger(MaterialTest.class);
	@Autowired
	private MaterialFeignClient materialFeignClient;
	@Autowired
	private MaterialController mm;
	/*@Test
	public void load(File file){
		File file1 = new File("C:/Users/chen/Desktop/index.jpg");
		String uploadPer = materialFeignClient.uploadPer(file1);
		logger.info(uploadPer);
	}*/
	@Test
	public void sss(){
		MultipartFile file = (MultipartFile) new File("C:\\Users\\chen\\Desktop\\kobe.jpg");
		mm.copyFile(file, "C:\\Users\\chen\\Desktop\\image");
	}
}
