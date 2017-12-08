package com.huateng.weixin.batch.util;

import java.util.HashMap;
import java.util.Map;

import com.huateng.weixin.batch.model.UserModel;


public class DataMapInstance {
	private static final DataMapInstance da = new DataMapInstance();
	private Map<String, UserModel> map = new HashMap<String,UserModel>();
	private DataMapInstance(){
		
	}

	public static DataMapInstance getInstance(){
		
		return da;
	}

	public Map<String, UserModel> getMap() {
		return map;
	}

	public void setMap(Map<String, UserModel> map) {
		this.map = map;
	}

}
