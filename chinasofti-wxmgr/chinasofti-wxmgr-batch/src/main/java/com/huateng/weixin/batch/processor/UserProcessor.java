package com.huateng.weixin.batch.processor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.huateng.weixin.batch.model.TemplateMessageModel;
import com.huateng.weixin.batch.model.UserModel;
import com.huateng.weixin.batch.util.DataMapInstance;


/**
 * 数据处理
 * @author Memoa
 *
 */
@Component("userProcessor")
public class UserProcessor implements ItemProcessor<UserModel, TemplateMessageModel>{
	Map<String,UserModel> map = new HashMap<String,UserModel>();
	@Override
	public TemplateMessageModel process(UserModel userModel) throws Exception {
		// TODO Auto-generated method stub
		//数据入缓存类
		if(DataMapInstance.getInstance().getMap().size()<=0){
			map.put(userModel.getOPENID(), userModel);
			DataMapInstance.getInstance().setMap(map);
		}
		return null;
	}


	

}
