package com.jfinal.weixin.sdk.api;

import com.jfinal.kit.HttpKit;

/**
 * 卡券相关接口
 * <p>
 * Description: 描述该类概要功能描述
 * </p>
 * 
 * @company 上海华腾软件系统有限公司
 * @author 李中武
 * @version v1.0
 * @data 2016年5月30日
 * @copyright Copyright 2015, Shanghai Huateng Software Systems Co., Ltd. All
 *            right reserved.
 */
public class TicketCardApi {

	private static final String batchgetURL = "https://api.weixin.qq.com/card/batchget?access_token=";
	private static final String getCardURL = "https://api.weixin.qq.com/card/get?access_token=";
	private static final String updateCardURL = "https://api.weixin.qq.com/card/update?access_token=";
	private static final String modifystockURL = "https://api.weixin.qq.com/card/modifystock?access_token=";
	private static final String updateCodeURL = "https://api.weixin.qq.com/card/code/update?access_token=";
	private static final String deleteCardURL = "https://api.weixin.qq.com/card/delete?access_token=";
	private static final String unavailableCodeURL = "https://api.weixin.qq.com/card/code/unavailable?access_token=";
	private static final String getTotalCardCountInfoURL = "https://api.weixin.qq.com/datacube/getcardbizuininfo?access_token=";
	private static final String getCardCountInfoURL = "https://api.weixin.qq.com/datacube/getcardcardinfo?access_token=";
	private static final String getMemberCardCountInfoURL = "https://api.weixin.qq.com/datacube/getcardmembercardinfo?access_token=";
	private static final String createCardURL = "https://api.weixin.qq.com/card/create?access_token=";
	private static final String decryptCodeURL = "https://api.weixin.qq.com/card/code/decrypt?access_token=";
	private static final String getCodeInfoURL = "https://api.weixin.qq.com/card/code/get?access_token=";
	private static final String consumeCodeURL = "https://api.weixin.qq.com/card/code/consume?access_token=";

	/**
	 * 批量查询卡列表
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr
	 *            { "offset": 0, "count": 10, "status_list":
	 *            ["CARD_STATUS_VERIFY_OK", "CARD_STATUS_DISPATCH"] }
	 * @return { "errcode":0, "errmsg":"ok",
	 *         "card_id_list":["ph_gmt7cUVrlRk8swPwx7aDyF-pg"], "total_num":1 }
	 */

	public static ApiResult getCardTicketList(String jsonStr) {
		String jsonResult = HttpKit.post(batchgetURL + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * 查看卡券详情
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr{
	 *            "card_id":"pFS7Fjg8kV1IdDz01r4SQwMkuCKc" }
	 * @return { "errcode": 0, "errmsg": "ok", "card": { "card_type": "GROUPON",
	 *         "groupon": { "base_info": { "status": 1, "id":
	 *         "p1Pj9jr90_SQRaVqYI239Ka1erkI", "logo_url":
	 *         "http://mmbiz.qpic.cn/mmbiz/iaL1LJM1mF9aRKPZJkmG8xXhiaHqkKSVMMWeN3hLut7X7hicFNjakmxibMLGWpXrEXB33367o7zHN0CwngnQY7zb7g/0",
	 *         "appid": "wx588def6b0089dd48", "code_type": "CODE_TYPE_TEXT",
	 *         "brand_name": "海底捞", "title": "132元双人火锅套餐", "sub_title":
	 *         "DATE_TYPE_FIX_TIME_RANGE", "date_info": { "type":
	 *         "DATE_TYPE_FIX_TIME_RANGE", "begin_timestamp": 1397577600,
	 *         "end_timestamp": 1399910400 }, "color": "#3373bb", "notice":
	 *         "使用时向服务员出示此券", "service_phone": "020-88888888", "description":
	 *         "不可与其他优惠同享\n如需团购券发票，请在消费时向商户提出\n店内均可使用，仅限堂食\n餐前不可打包，餐后未吃完，可打包\n本团购券不限人数，建议2人使用，超过建议人数须另收酱料费5元/位\n本单谢绝自带酒水饮料",
	 *         "use_limit": 1, "get_limit": 3, "can_share": true,
	 *         "location_id_list" : [123, 12321, 345345] "custom_url_name":
	 *         "立即使用", "custom_url": "http://www.qq.com",
	 *         "custom_url_sub_title": "6个汉字tips", "promotion_url_name": "更多优惠",
	 *         "promotion_url": "http://www.qq.com", "source": "大众点评" "sku": {
	 *         "quantity": 0 "total_quantity":1000 } }, "deal_detail":
	 *         "以下锅底2选1（有菌王锅、麻辣锅、大骨锅、番茄锅、清补凉锅、酸菜鱼锅可选）：\n大锅1份 12元\n小锅2份 16元\n以下菜品2选1\n特级肥牛1份 30元\n洞庭鮰鱼卷1份 20元\n其他\n鲜菇猪肉滑1份 18元\n金针菇1份 16元\n黑木耳1份 9元\n娃娃菜1份 8元\n冬瓜1份 6元\n火锅面2个 6元\n欢乐畅饮2位 12元\n自助酱料2位 10元"
	 *         }
	 */
	public static ApiResult getCardDetails(String jsonStr) {
		String jsonResult = HttpKit.post(getCardURL + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * 更新卡券信息
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr
	 *            {"card_id":"ph_gmt7cUVrlRk8swPwx7aDyF-pg", "member_card": {
	 *            //填写该cardid相应的卡券类型（小写）。 "base_info": { "logo_url":
	 *            "http:\/\/www.supadmin.cn\/uploads\/allimg\/120216\/1_120216214725_1.jpg",
	 *            "color": "Color010", "notice": "使用时向服务员出示此券", "service_phone":
	 *            "020-88888888", "description":
	 *            "不可与其他优惠同享\n如需团购券发票，请在消费时向商户提出\n店内均可使用，仅限堂食\n餐前不可打包，餐后未吃完，可打包\n本团购券不限人数，建议2人使用，超过建议人数须另收酱料费5元/位\n本单谢绝自带酒水饮料"
	 *            "location_id_list" : [123, 12321, 345345] }, "bonus_cleared":
	 *            "aaaaaaaaaaaaaa", "bonus_rules": "aaaaaaaaaaaaaa",
	 *            "prerogative": "" } }
	 * @return { "errcode":0, "errmsg":"ok", "send_check":false }
	 */
	public static ApiResult updateCardInfo(String jsonStr) {
		String jsonResult = HttpKit.post(updateCardURL + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * 更新卡券库存
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr
	 *            { "card_id": "pFS7Fjg8kV1IdDz01r4SQwMkuCKc",
	 *            "increase_stock_value": 1231231, "reduce_stock_value": 1231231
	 *            }
	 * @return { "errcode":0, "errmsg":"ok" }
	 */
	public static ApiResult modifyStock(String jsonStr) {
		String jsonResult = HttpKit.post(modifystockURL + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * 更新券号
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr
	 *            { "code": "12345678", "card_id":
	 *            "pFS7Fjg8kV1IdDz01r4SQwMkuCKc", "new_code": "3495739475" }
	 * @return { "errcode":0, "errmsg":"ok"}
	 */
	public static ApiResult updateCode(String jsonStr) {
		String jsonResult = HttpKit.post(updateCodeURL + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * 删除卡券
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr
	 *            { "card_id": "pFS7Fjg8kV1IdDz01r4SQwMkuCKc" }
	 * @return { "errcode":0, "errmsg":"ok" }
	 */
	public static ApiResult deleteCard(String jsonStr) {
		String jsonResult = HttpKit.post(deleteCardURL + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * 设置卡券失效
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr非自定义卡券的请求
	 *            { "code": "12312313" } 或自定义code卡券的请求。 { "code": "12312313",
	 *            "card_id": "pFS7Fjg8kV1IdDz01r4SQwMkuCKc" }
	 * @return { "errcode":0, "errmsg":"ok", }
	 */
	public static ApiResult unavailableCode(String jsonStr) {
		String jsonResult = HttpKit.post(unavailableCodeURL + AccessTokenApi.getAccessToken().getAccessToken(),
				jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * 获取卡券统计信息（所有指定渠道卡券）
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr
	 *            ｛ "begin_date":"2015-06-15", //请开发者按示例格式填写日期，否则会报错date format
	 *            error "end_date":"2015-06-30", "cond_source": 0 ｝
	 * @return { "list": [ { "ref_date": "2015-06-23", "view_cnt": 1,
	 *         "view_user": 1, "receive_cnt": 1, "receive_user": 1,
	 *         "verify_cnt": 0, "verify_user": 0, "given_cnt": 0, "given_user":
	 *         0, "expire_cnt": 0, "expire_user": 0 } ] }
	 */
	public static ApiResult getTotalCardCountInfo(String jsonStr) {
		String jsonResult = HttpKit.post(getTotalCardCountInfoURL + AccessTokenApi.getAccessToken().getAccessToken(),
				jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * 获取单张卡券（免费券）的统计信息
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr
	 *            ｛ "begin_date":"2015-06-15", "end_date":"2015-06-30",
	 *            "cond_source": 0, "card_id": "po8pktyDLmakNY2fn2VyhkiEPqGE" ｝
	 * @return { "list": [ { "ref_date": "2015-06-23", "card_id":
	 *         "po8pktyDLmakNY2fn2VyhkiEPqGE", "card_type":3, "view_cnt": 1,
	 *         "view_user": 1, "receive_cnt": 1, "receive_user": 1,
	 *         "verify_cnt": 0, "verify_user": 0, "given_cnt": 0, "given_user":
	 *         0, "expire_cnt": 0, "expire_user": 0 } ] }
	 */
	public static ApiResult getCardCountInfo(String jsonStr) {
		String jsonResult = HttpKit.post(getCardCountInfoURL + AccessTokenApi.getAccessToken().getAccessToken(),
				jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * 获取会员卡统计信息
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr
	 *            ｛ "begin_date":"2015-06-15", "end_date":"2015-06-30",
	 *            "cond_source": 0 ｝
	 * @return { "list": [ { "ref_date": "2015-06-23", "view_cnt": 0,
	 *         "view_user": 0, "receive_cnt": 0, "receive_user": 0,
	 *         "active_user": 0, "verify_cnt": 0, "verify_user": 0,
	 *         "total_user": 86, "total_receive_user": 95 ] }
	 */
	public static ApiResult getMemberCardCountInfo(String jsonStr) {
		String jsonResult = HttpKit.post(getMemberCardCountInfoURL + AccessTokenApi.getAccessToken().getAccessToken(),
				jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * 创建卡券
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr
	 *            { "card": { "card_type": "GROUPON", "groupon": { "base_info":
	 *            { "logo_url":
	 *            "http://mmbiz.qpic.cn/mmbiz/iaL1LJM1mF9aRKPZJkmG8xXhiaHqkKSVMMWeN3hLut7X7hicFNjakmxibMLGWpXrEXB33367o7zHN0CwngnQY7zb7g/0",
	 *            "brand_name": "海底捞", "code_type": "CODE_TYPE_TEXT", "title":
	 *            "132元双人火锅套餐", "sub_title": "周末狂欢必备", "color": "Color010",
	 *            "notice": "使用时向服务员出示此券", "service_phone": "020-88888888",
	 *            "description": "不可与其他优惠同享\n如需团购券发票，请在消费时向商户提出\n店内均可使用，仅限堂食",
	 *            "date_info": { "type": "DATE_TYPE_FIX_TIME_RANGE",
	 *            "begin_timestamp": 1397577600, "end_timestamp": 1422724261 },
	 *            "sku": { "quantity": 500000 }, "get_limit": 3,
	 *            "use_custom_code": false, "bind_openid": false, "can_share":
	 *            true, "can_give_friend": true, "location_id_list": [ 123,
	 *            12321, 345345 ], "center_title": "顶部居中按钮", "center_sub_title":
	 *            "按钮下方的wording", "center_url": "www.qq.com", "custom_url_name":
	 *            "立即使用", "custom_url": "http://www.qq.com",
	 *            "custom_url_sub_title": "6个汉字tips", "promotion_url_name":
	 *            "更多优惠", "promotion_url": "http://www.qq.com", "source": "大众点评"
	 *            }, "deal_detail":
	 *            "以下锅底2选1（有菌王锅、麻辣锅、大骨锅、番茄锅、清补 凉锅、酸菜鱼锅可选）：\n大锅1份 12元\n小锅2份 16元 "
	 *            } } }
	 * @return { "errcode":0, "errmsg":"ok",
	 *         "card_id":"p1Pj9jr90_SQRaVqYI239Ka1erkI" }
	 */
	public static ApiResult createCard(String jsonStr) {
		String jsonResult = HttpKit.post(createCardURL + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * code解码
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr
	 *            { "encrypt_code":
	 *            "XXIzTtMqCxwOaawoE91+VJdsFmv7b8g0VZIZkqf4GWA60Fzpc8ksZ/5ZZ0DVkXdE"
	 *            }
	 * @return { "errcode":0, "errmsg":"ok", "code":"751234212312" }
	 */
	public static ApiResult decryptCode(String jsonStr) {
		String jsonResult = HttpKit.post(decryptCodeURL + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * 获取code信息
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr
	 *            { "card_id" : "card_id_123+", "code" : "123456789",
	 *            "check_consume" : true }
	 * @return { "errcode":0, "errmsg":"ok",
	 *         "openid":"oFS7Fjl0WsZ9AMZqrI80nbIq8xrA", "card":{
	 *         "card_id":"pFS7Fjg8kV1IdDz01r4SQwMkuCKc", "begin_time":
	 *         1404205036, "end_time": 1404205036, "user_card_status": "NORMAL",
	 *         "can_consume":"true" } } 卡券状态异常：
	 * 
	 *         { "errcode": 40127, "errmsg":
	 *         "invalid user-card status! Hint: the card was given to user, but may be    deleted or set unavailable ! hint: [iHBD40040ent3]"
	 *         }
	 */
	public static ApiResult getCodeInfo(String jsonStr) {
		String jsonResult = HttpKit.post(getCodeInfoURL + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
		return new ApiResult(jsonResult);
	}

	/**
	 * 核销卡券
	 * 
	 * @date 2016年1月6日
	 * @auther 李中武
	 * @param jsonStr
	 *            非自定义Code卡券的请求 { "code": "12312313" } 或自定义Code卡券的请求 { "code":
	 *            "12312313", "card_id": "pFS7Fjg8kV1IdDz01r4SQwMkuCKc" }
	 * @return { "errcode":0, "errmsg":"ok",
	 *         "card":{"card_id":"pFS7Fjg8kV1IdDz01r4SQwMkuCKc"},
	 *         "openid":"oFS7Fjl0WsZ9AMZqrI80nbIq8xrA" }
	 */
	public static ApiResult consumeCode(String jsonStr) {
		String jsonResult = HttpKit.post(consumeCodeURL + AccessTokenApi.getAccessToken().getAccessToken(), jsonStr);
		return new ApiResult(jsonResult);
	}
}
