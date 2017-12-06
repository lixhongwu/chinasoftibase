package com.huateng.weixin.batch.reader;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.beans.factory.annotation.Autowired;
import com.huateng.weixin.batch.bean.WxUserFans;
import com.huateng.weixin.batch.mapper.WxUserFansMapper;
public class GetUserReader implements ItemReader<WxUserFans>{
	
	private Logger logger = LoggerFactory.getLogger(GetUserReader.class);
	
	@Autowired
	private WxUserFansMapper wxUserFansMapper ;


	@Override
	public WxUserFans read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		
		
		List<WxUserFans> list = wxUserFansMapper.selectUser();
		if(list!=null && list.size()>0){
			logger.info("list>>>>>>>>>>>>>:"+list);
			return list.remove(0);
		}else{
			return null ;
		}
	}


}
