package com.huateng.wxmgr.userbatch.processor;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huateng.wxmgr.common.entity.WxUserFans;
import com.huateng.wxmgr.common.utils.DateUtils;
import com.huateng.wxmgr.userbatch.service.UserService;

@Component("wxUserOpenidProcessor")
public class WxUserOpenidProcessor implements ItemProcessor<List<WxUserFans>, List<WxUserFans>> {

	private final static Logger logger = LoggerFactory.getLogger(WxUserOpenidProcessor.class);

	@Autowired
	private UserService userService;

	@Override
	public List<WxUserFans> process(List<WxUserFans> item) throws Exception {
		logger.info(">>>>>>>>>>>WxUserOpenidProcessor {}", item.toString());

		// 获取黑名单列表
		//List<String> allBlackUsers = userService.getAllBlackUsers(null);
		//
		for (WxUserFans wxUserFans : item) {
			//设置更新时间。
			String currentTime = DateUtils.getCurrentTime();
			wxUserFans.setAppid(currentTime);
			// 判断是否是黑名单。
			wxUserFans.setBlack("0");
//			if (allBlackUsers.contains(wxUserFans.getIds())) {
//				wxUserFans.setBlack("1");
//			}
		}
		return item;
	}

}
