package com.huateng.weixin.message.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.huateng.weixin.message.service.GetTemplateFromWxService;

@SpringBootTest()
@RunWith(SpringRunner.class)
public class MessageTemplateTest {
	@Autowired
	GetTemplateFromWxService gtf ;
	@Test
	public void getTemplateList(){
		String accessToken="H4v0vXZFlnzYZhYMeAm7mReg8SqdAh0y670PsmjvWc6j4nwrOX75s-6wVAf4-t0vntQrEBgpNo2G1AbcW25N-eMKCkOj3HZkqgZlQxbVRSiO7CM8n9AJvubj6jbngWouTAFaAFABIN";
		gtf.getTemplateFromWX(accessToken);
	}
}
