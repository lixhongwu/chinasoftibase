package com.huateng.wxmgr.common.utils;

public class Constant {

	public static final String IS_PARENT = "true";
	public static final String SUCCESS = "200";
	public static final String ERROR = "130";
	public static final String CALLBACK = "777";// 熔断后返回callback

	/**
	 * 创建菜单。post请求方式，需要以post的形式将菜单数据发送给微信
	 */
	public final static String CREATE_MENU = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=%s";
	/**
	 * 获取微信当前菜单, get请求.
	 */
	public final static String GET_MENU = "https://api.weixin.qq.com/cgi-bin/menu/get?access_token=%s";
	/**
	 * 获取用户列表 ，GET请求方式（请使用https协议）
	 */
	public final static String USERS_GET = "https://api.weixin.qq.com/cgi-bin/user/get?access_token=%s&next_openid=%s";

	/**
	 * 获取用户信息，GET请求方式，需要带有access_token以及用户的openId
	 */
	public final static String USER_GET_INFO = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=%s&openid=%s&lang=zh_CN";

	/**
	 * 设置用户备注名； POST请求方式（请使用https协议）POST数据格式：
	 * JSON POST数据例子： {"openid":"oDF3iY9ffA-hqb2vVvbr7qxf6A0Q", "remark":"pangzi" }
	 */
	public final static String USER_REMARK_NAME = "https://api.weixin.qq.com/cgi-bin/user/info/updateremark?access_token=%s";

}
