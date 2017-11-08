package com.jfinal.weixin.sdk.kit;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.huateng.mgr.model.YxCouponCode;
import com.huateng.mgr.model.YxPrizePickupRecord;
import com.huateng.mgr.service.YxPrizePickupRecordService;
import com.huateng.weixin.service.ApiConfigService;
import com.jfinal.kit.JsonKit;
import com.jfinal.weixin.sdk.api.ApiConfig;
import com.jfinal.weixin.sdk.api.ApiConfigKit;
import com.jfinal.weixin.sdk.api.ApiResult;
import com.jfinal.weixin.sdk.api.TicketCardApi;

/**
 * @ClassName: ThreadSetCouponInvalid
 * @Description: TODO(异步将已加入微信卡包的商城优惠券置为失效)
 * @author 何国庆
 * @date 2016年6月24日 下午3:03:08
 */
public class ThreadSetCouponInvalid {
	private static Logger log = LogManager.getLogger(ThreadSetCouponInvalid.class);
	public YxPrizePickupRecord ppr;
	public YxCouponCode cc;
	public String urltoken;
	public String card_id;

	public ThreadSetCouponInvalid(YxPrizePickupRecord ppr, YxCouponCode cc, String urltoken, String card_id) {
		super();
		this.ppr = ppr;
		this.cc = cc;
		this.urltoken = urltoken;
		this.card_id = card_id;
	}

	public void start() {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				if (ppr != null && cc != null) {
					ApiConfig ac = ApiConfigService.service.getApiConfig(urltoken);
					ApiConfigKit.setThreadLocalApiConfig(ac);
					
					//先查询卡券状态是否正常，正常时才置为失效
					Map<String, Object> msgMapx = new HashMap<String, Object>();
					msgMapx.put("card_id", card_id);
					msgMapx.put("code", cc.getStr("WX_COUPON_CODE"));
					msgMapx.put("check_consume", true);
					String jsonDatax = JsonKit.toJson(msgMapx);
					log.info("查询卡券状态是否正常的报文：" + jsonDatax);
					ApiResult resultx = TicketCardApi.getCodeInfo(jsonDatax);
					boolean deleteflag = false;
					if (resultx.isSucceed()) {
						/*
						 * 当前code对应卡券user_card_status的状态 
							NORMAL       正常 
							CONSUMED     已核销 
							EXPIRE       已过期 
							GIFTING      转赠中
							GIFT_TIMEOUT 转赠超时 
							DELETE       已删除
							UNAVAILABLE  已失效 
						 */
						String user_card_status = resultx.get("user_card_status");
						if("NORMAL".equals(user_card_status)){
							deleteflag = true;//卡券正常才置为失效
						}
					}
					
					if(deleteflag){
						// 将微信卡包中的卡券置为失效
						Map<String, Object> msgMap = new HashMap<String, Object>();
						msgMap.put("code", cc.getStr("WX_COUPON_CODE"));
						String jsonData = JsonKit.toJson(msgMap);
						log.info("发送将微信卡包中的卡券置为失效的报文：" + jsonData);
						ApiResult result = TicketCardApi.unavailableCode(jsonData);
						if (result.isSucceed()) {
							//
						} else {
							//若同步删除微信卡包中卡券失败则还原商城卡券
							ppr.set("STATUS", "1");
							ppr.set("DELETE_TIME", null);
							YxPrizePickupRecordService.service.update(ppr);
							
							log.error("线程异步将微信卡包中的卡券置为失效 失败！我的优惠券ID：" + ppr.getPKValue());
						}
					}
					
				}

			}

		});
		thread.start();
	}

}
