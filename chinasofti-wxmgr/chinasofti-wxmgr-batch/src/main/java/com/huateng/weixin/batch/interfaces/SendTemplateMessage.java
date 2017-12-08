package com.huateng.weixin.batch.interfaces;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huateng.weixin.batch.util.WxUtil;

@Component("sendTemplateMessage")
public class SendTemplateMessage {
	@Autowired
	WxUtil wxUtil;
	private static final String TMP_URL="https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
	
	public void send(String body){
		String token = "KEWQJAP6nCX0L-PLge7pUawbgQNzwqeA-iB19cnwDrd6tVCrH7nKoK41mwMn84fBA-hn2n1d-aVEaDtblIo0jJuiQnX3ZF8mAaIZkfc07omj-dq90SXjTZa3SspINH32TBZgADAHPN";
		String url = TMP_URL.replace("ACCESS_TOKEN", token);
		JSONObject jsonObject = wxUtil.doPostStr(url, body);
		System.out.println(jsonObject);
	}
}
