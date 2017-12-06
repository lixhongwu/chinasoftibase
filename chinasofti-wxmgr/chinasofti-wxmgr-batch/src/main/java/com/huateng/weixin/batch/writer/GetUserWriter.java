package com.huateng.weixin.batch.writer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.huateng.weixin.batch.bean.WxUserFans;
import com.huateng.weixin.batch.processor.GetUserProcessor;
@Component("getUserWriter")
public class GetUserWriter implements ItemWriter<WxUserFans>{

	private Logger logger = LoggerFactory.getLogger(GetUserProcessor.class);
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
	@Override
	public void write(List<? extends WxUserFans> items) throws Exception {
		for (WxUserFans wxUserFans : items) {
			logger.info("这里的wxUserFans为："+wxUserFans);
		}
	}

}
