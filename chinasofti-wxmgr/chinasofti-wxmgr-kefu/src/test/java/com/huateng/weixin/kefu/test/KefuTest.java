package com.huateng.weixin.kefu.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.huateng.weixin.kefu.model.Kefu;
import com.huateng.weixin.kefu.service.AccessTokenService;
import com.huateng.weixin.kefu.service.KefuService;

import net.sf.json.JSONObject;



@RunWith(SpringRunner.class)
@SpringBootTest
public class KefuTest {

	private final static Logger logger = LoggerFactory.getLogger(KefuTest.class);
	
	@Autowired
	private AccessTokenService accessTokenService;
	
	@Autowired
	private KefuService kefuService;

	/*@Test
	public void add(){
		Kefu kefu = new Kefu();
		kefu.setKf_account("test@1");
		kefu.setNickname("客服一号");
		String accessToken = accessTokenService.getAccessToken();
		logger.info("获取的accesstoken>>>>>>>>>>>>"+accessToken);
		kefuService.add(kefu, accessToken);
	}
	@Test
	public void update(){
		Kefu kefu = new Kefu();
		kefu.setKf_account("test@2");
		kefu.setNickname("客服二号");
		String accessToken = accessTokenService.getAccessToken();
		logger.info("获取的accessToken>>>>>>>>>>>>"+accessToken);
		kefuService.update(kefu, accessToken);
	}
	@Test
	public void delete(){
		String kf_account = "test@2";
		String accessToken = accessTokenService.getAccessToken();
		logger.info("获取的accessToken>>>>>>>>>>>>"+accessToken);
		kefuService.delete(kf_account, accessToken);
	}
	@Test
	public JSONObject get(){
		String accessToken = accessTokenService.getAccessToken();
		logger.info("获取的accessToken>>>>>>>>>>>"+accessToken);
		JSONObject jsonObject = kefuService.get(accessToken);
		logger.info("获取的客服信息："+jsonObject);
		return jsonObject;
	}
	@Test
	public void send(){
		String accessToken = accessTokenService.getAccessToken();
		logger.info("获取的accessToken>>>>>>>>>>>>"+accessToken);
//		String accessToken ="FrRxMQhTu_TFwGqVMIn2dfs74pfnuS4VQJN5un0EkC1Xv27wD8SjvrLlOp6EvKrpEYdGKnNMyBaLq6xheerCMaAZ4HODj1KmpCSVVkVXdlSoKunU_3AnMwY-p5CtXxe0SBHiAIAIRX";
		String touser = "ow8Nx05yeBN5tnLVQxgDWbTj31Yw";
		String content = "hello!";
		kefuService.sendText(touser, content, accessToken);
	}*/
	
	@Test
	public void sendImage(){
		String accessToken =  "xzNFY89S5ha_vm4ZgtWaSaetNVQXOMGeGYLQ-H1gPrONWUKyviY3T7oEVlOt6EKIrK6VzUhwINjFBIMxGUL1R0Qf5wv3WNppzi2hlKZmy7BTLaVv23j0mntrWvc18PnQIJNhAAAXYC";
		String touser = "ow8Nx05yeBN5tnLVQxgDWbTj31Yw";
		String media_id = "hBZn2N08gD6d1PY-En5FjEcE2o3oZk4hZEf_UFpHQ2Y";
		kefuService.sendImage(touser, media_id, accessToken);
	}
	
}
