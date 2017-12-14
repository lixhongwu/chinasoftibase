package com.huateng.wxmgr.common.utils;

public class Constant {

	public static final String IS_PARENT = "true";
	public static final String SUCCESS = "200";
	public static final String ERROR = "130";
	public static final String CALLBACK = "777";// 熔断后返回callback
	public static final int CALLBACK_INT = 777;// 熔断后返回callback
	/**
	 * 获取access_token的地址，需要传入appId以及appSecret两个参数
	 */
	public final static String GET_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";

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
	 * 批量获取用户信息，POST请求方式:
	 */
	public final static String USERS_BATCHGET_INFO = "https://api.weixin.qq.com/cgi-bin/user/info/batchget?access_token=%s";
	/**
	 * 设置用户备注名； POST请求方式（请使用https协议）
	 */
	public final static String USER_REMARK_NAME = "https://api.weixin.qq.com/cgi-bin/user/info/updateremark?access_token=%s";

	/**
	 * 获取黑名单用户列表 http请求方式：POST（请使用https协议）
	 */
	public final static String USER_GET_BLACK = "https://api.weixin.qq.com/cgi-bin/tags/members/getblacklist?access_token=%s";

	/**
	 * 拉黑用户，一次最多能拉黑20个用户。http请求方式：POST（请使用https协议）
	 */
	public final static String USER_SET_BLACK = "https://api.weixin.qq.com/cgi-bin/tags/members/batchblacklist?access_token=%s";

	/**
	 * 解除黑名单，一次最多能解除20个用户，http请求方式：POST（请使用https协议）
	 */
	public final static String USER_UN_BLACK = "https://api.weixin.qq.com/cgi-bin/tags/members/batchunblacklist?access_token=%s";

	public static class urls {
		/**
		 * 获取access_token的地址，需要传入appId以及appSecret两个参数
		 */
		public final static String GET_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";

		/**
		 * 创建菜单。需要以post的形式将菜单数据发送给微信
		 */
		public final static String CREATE_MENU = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=%s";

		// 下面的是标签相关

		/**
		 * 创建一个标签，需要使用POST方法传参
		 */
		public final static String TAG_CREATE = "https://api.weixin.qq.com/cgi-bin/tags/create?access_token=%s";

		/**
		 * 获取已创建的标签，需要使用GET方法请求
		 */
		public final static String TAG_GET = "https://api.weixin.qq.com/cgi-bin/tags/get?access_token=%s";

		/**
		 * 编辑标签，需要使用POST方法请求
		 */
		public final static String TAG_UPDATE = "https://api.weixin.qq.com/cgi-bin/tags/update?access_token=%s";

		/**
		 * 删除一个标签，需要使用POST方法传参
		 */
		public final static String TAG_DELETE = "https://api.weixin.qq.com/cgi-bin/tags/delete?access_token=%s";

		/**
		 * 获取一个标签下的粉丝列表
		 */
		public final static String TAG_FANS = "https://api.weixin.qq.com/cgi-bin/user/tag/get?access_token=%s";

		/**
		 * 批量给用户添加标签，需要使用POST传参
		 */
		public final static String TAG_BATCH_TAG = "https://api.weixin.qq.com/cgi-bin/tags/members/batchtagging?access_token=%s";

		/**
		 * 批量为用户取消标签，需要使用POST传参
		 */
		public final static String TAG_BATCH_UNTAG = "https://api.weixin.qq.com/cgi-bin/tags/members/batchuntagging?access_token=%s";

		/**
		 * 获取用户身上的标签列表
		 */
		public final static String TAG_GET_LIST = "https://api.weixin.qq.com/cgi-bin/tags/getidlist?access_token=%s";
	}
}
