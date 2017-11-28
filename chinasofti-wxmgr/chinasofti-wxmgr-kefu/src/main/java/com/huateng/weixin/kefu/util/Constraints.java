package com.huateng.weixin.kefu.util;

public class Constraints {
	
	public static class urls {
		/**
		 * 获取access_token的地址，需要传入appId以及appSecret两个参数
		 */
		public final static String GET_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";
		
		
	}
	
}
