package com.huateng.wxmgr.web.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.huateng.wxmgr.web.feign.KefuMessagerFeignClient;
import com.huateng.wxmgr.web.model.WxUser;


@RestController
@RequestMapping("/kefu")
public class KefuMessagerController {

	private static Logger log = LoggerFactory.getLogger(MaterialController.class);
	
	@Autowired
	private KefuMessagerFeignClient kefuMessagerFeignClient;
	
	@RequestMapping("/messager")
	public ModelAndView getView() {
		return new ModelAndView("kefu/sendmessager");
	}
	@RequestMapping("/findUserByPage")
	public List<WxUser> findUserByPage(){
		List<WxUser> list = new ArrayList<>();
		WxUser user1 = new WxUser();
		user1.setId("1");
		user1.setNickname("陈坚丰");
		user1.setOpenid("ow8Nx05yeBN5tnLVQxgDWbTj31Yw");
		WxUser user2 = new WxUser();
		user2.setId("2");
		user2.setNickname("王阳");
		user2.setOpenid("ow8Nx07ewuWr-qrfv_PM1pbgmk3Q");
		list.add(user1);
		list.add(user2);
		return list;
	}
	@RequestMapping("/sendText")
	public void sendText(@RequestParam Map map){
		kefuMessagerFeignClient.sendText(map);
	}
	@RequestMapping("/sendMessager")
	public void sendMessager(@RequestParam Map map){
		kefuMessagerFeignClient.sendMessager(map);
	}
}
