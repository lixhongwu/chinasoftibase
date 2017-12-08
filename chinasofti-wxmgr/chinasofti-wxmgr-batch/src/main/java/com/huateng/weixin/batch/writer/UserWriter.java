package com.huateng.weixin.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.huateng.weixin.batch.model.TemplateMessageModel;


@Component("userWriter")
public class UserWriter<T> implements ItemWriter<T> {

	@Override
	public void write(List<? extends T> arg0) throws Exception {
		
	}


}
