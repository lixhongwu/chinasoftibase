package com.huateng.weixin.batch.reader;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huateng.weixin.batch.service.UserService;
import com.huateng.wxmgr.common.entity.WxUserFans;
import com.huateng.wxmgr.common.entity.WxUserOpenId;

@Component
public class WxUserOpenidReader implements ItemReader<List<WxUserFans>> {

	private final static Logger logger = LoggerFactory.getLogger(WxUserOpenidReader.class);
	@Autowired
	private UserService userService;

	private String nextOpenid;

	public void setNextOpenid(String nextOpenid) {
		this.nextOpenid = nextOpenid;
	}
	int i;

	@Override
	public List<WxUserFans> read()
			throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		logger.info("WxUserOpenidReader>>>>>>>>> {}", nextOpenid);
		if (nextOpenid.equals("begin")){
			nextOpenid = "";
		}
		WxUserOpenId usersOpenId = userService.getUsersOpenId(nextOpenid);
		List<WxUserFans> usersInfoList = null;
		if(usersOpenId!=null){
			logger.info("WxUserOpenidReader>>>>>>>>> {}", usersOpenId.toString());
		 usersInfoList = userService.getAllUsersInfo(usersOpenId.getOpenidList());
		this.nextOpenid = usersOpenId.getNext_openid();
		}
		return usersInfoList;
	}

}
