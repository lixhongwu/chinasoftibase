package com.huateng.wxmgr.userbatch.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.huateng.wxmgr.common.entity.WxUserFans;

@Component("wxUsersOpenidWriter")
public class WxUsersOpenidWriter  implements ItemWriter<List<WxUserFans>>{
	
	private final static Logger logger = LoggerFactory.getLogger(WxUsersOpenidWriter.class);

	@Override
	public void write(List<? extends List<WxUserFans>> items) throws Exception {
		// TODO Auto-generated method stub
		
		logger.info("WxUsersOpenidWriter>>>>>>>>>>{}",items.get(0).toString());
		
	}

	

}
