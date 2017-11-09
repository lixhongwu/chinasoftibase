package com.huateng.weixin.user.util;

public class Constraints {
	
	public static class urls {
		/**
		 * 获取access_token的地址，需要传入appId以及appSecret两个参数
		 */
		public final static String GET_ACCESS_TOKEN = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s";
		
		/**
		 * 创建菜单。需要以post的形式将菜单数据发送给微信
		 */
		public final static String CREATE_MENU = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=%s";
		
		/**
		 * 获取用户信息，需要带有access_token以及用户的openId
		 */
		public final static String USER_BREIF_INFO = "https://api.weixin.qq.com/cgi-bin/user/info?access_token=%s&openid=%s&lang=zh_CN ";
		
		/**
		 * 设置用户备注名
		 */
		public final static String USER_NICK_NAME = "https://api.weixin.qq.com/cgi-bin/user/info/updateremark?access_token=%s";
		
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
