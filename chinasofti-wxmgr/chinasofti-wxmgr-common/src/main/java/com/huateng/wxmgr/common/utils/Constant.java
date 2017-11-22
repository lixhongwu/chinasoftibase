package com.huateng.wxmgr.common.utils;

public class Constant {
	
	public static final String IS_PARENT = "true";
	public static final String SUCCESS = "200";
	public static final String ERROR = "130";
	public static final String CALLBACK="777";//熔断后返回callback
	
	
	/**
	 * 创建菜单。需要以post的形式将菜单数据发送给微信
	 */
	public final static String CREATE_MENU = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=%s";
	/**
	 * 获取微信当前菜单, get请求.
	 */
    public final static String GET_MENU = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=%s";


}
