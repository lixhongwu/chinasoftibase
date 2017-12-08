package com.huateng.weixin.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.huateng.weixin.batch.model.TemplateMessageModel;


@Component("templateMessageWriter")
public class TemplateMessageWriter implements ItemWriter<TemplateMessageModel>{

	@Override
	public void write(List<? extends TemplateMessageModel> arg0)
			throws Exception {
		
	}

}
