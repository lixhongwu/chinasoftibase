package com.huateng.wxmgr.common.utils;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;


public class JsonUtils {

	public static String objectToGsonString(Object object) {
		// 将对象转为json传送出去,服务端再转换回来, 也支持中文
		if (object != null) {

			Gson gson = new Gson();
			String json = gson.toJson(object);
			return json;

		}
		return "";
	}

	

	public static Map<String,String> jsonToMap(String json) {

		return  JSON.parseObject(json,Map.class);
	}
}
