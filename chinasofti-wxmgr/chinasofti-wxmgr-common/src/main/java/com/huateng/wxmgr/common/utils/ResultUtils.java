package com.huateng.wxmgr.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.json.JSONObject;

public class ResultUtils {

	private static final Logger logger = LoggerFactory.getLogger(ResultUtils.class);
	/**
	 * 判断微信服务器响应是否成功
	 * @param result
	 * @return
	 */
	public static boolean Result(JSONObject result) {
		
		String errcode = null;
		if (result == null || result.size() == 0) {
			logger.error("Result>>>>>>>>>>>>>>>>>响应失败！");
			return false;
		} else {
			//是否有errcode
			if (result.has("errcode")) {
				errcode = result.getString("errcode");
				//errcode是否为0
				if (errcode.equals("0")) {
					logger.info("Result>>>>>>>>>>>>>>>>>服务器响应了成功：" + result.toString());
					return true;
				} else {
					logger.error("Result>>>>>>>>>>>>>>>>>服务器响应了异常：" + result.get("errmsg").toString() + ",错误码为："
							+ result.get("errcode").toString());
					return false;
				}
			} else {
				logger.info("Result>>>>>>>>>>>>>>>>>服务器响应了成功：" + result.toString());
				return true;
			}
		}
	}

}
