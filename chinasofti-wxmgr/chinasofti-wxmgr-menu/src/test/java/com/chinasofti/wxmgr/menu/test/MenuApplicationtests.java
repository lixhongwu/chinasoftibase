package com.chinasofti.wxmgr.menu.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chinasofti.wxmgr.menu.controller.WxMenuController;
import com.huateng.wxmgr.common.entity.WxMenu;

import net.sf.json.JSONObject;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuApplicationtests {
	
	private final static Logger logger =LoggerFactory.getLogger(MenuApplicationtests.class);
	
	@Autowired
	private WxMenuController controller;
	
	@Test
	public void findGroupByPage(){
		
		WxMenu wxMenu=new WxMenu();
		wxMenu.setPage(1);
		wxMenu.setRows(10);
		JSONObject object = controller.findGroupByPage(wxMenu);
		
		logger.info(object.toString());
		
	}

}
