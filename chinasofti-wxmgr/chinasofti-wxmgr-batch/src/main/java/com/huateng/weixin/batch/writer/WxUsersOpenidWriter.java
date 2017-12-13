package com.huateng.weixin.batch.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.huateng.weixin.batch.mapper.WxUserFansMapper;
import com.huateng.wxmgr.common.entity.WxUserFans;

@Component("wxUsersOpenidWriter")
public class WxUsersOpenidWriter implements ItemWriter<List<WxUserFans>> {

	@Autowired
	private WxUserFansMapper mapper;

	private final static Logger logger = LoggerFactory.getLogger(WxUsersOpenidWriter.class);

	@Override
	@Transactional
	public void write(List<? extends List<WxUserFans>> items) throws Exception {

		logger.info("WxUsersOpenidWriter>>>>>>>>>>{}", items.get(0).toString());

		List<WxUserFans> userFansList = items.get(0);
		mapper.deleteUserfansByList(userFansList);
		mapper.insertUserfansByList(userFansList);

	}

}
