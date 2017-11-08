package com.jfinal.weixin.sdk.kit;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import little.ant.platform.common.constants.SysMsgStatusEnum;
import little.ant.platform.tools.CommonHelper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.huateng.mgr.model.SysMessage;
import com.huateng.mgr.service.SysMessageService;
import com.huateng.weixin.service.ApiConfigService;
import com.jfinal.kit.JsonKit;
import com.jfinal.weixin.sdk.api.ApiConfig;
import com.jfinal.weixin.sdk.api.ApiConfigKit;
import com.jfinal.weixin.sdk.api.ApiResult;
import com.jfinal.weixin.sdk.api.TemplateMsgApi;
import com.jfinal.weixin.sdk.pojo.Template;

/**
 * 
* @ClassName: ThreadSendTemplate
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 李中武
* @date 2016年6月22日 下午3:03:08 
*
 */
public class ThreadSendTemplate {
	private static Logger log = LogManager.getLogger(ThreadSendTemplate.class);
	public Template template;

	public ThreadSendTemplate(Template template) {
		super();
		this.template = template;
	}

	public void start(){
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				//推送模板消息
				 try{
					 if(template!=null){
						 if(isValid(template)){
							 ApiConfig ac = ApiConfigService.service.getApiConfig(template.getUrlToken());
							 ApiConfigKit.setThreadLocalApiConfig(ac);
							 
								Map<String, Object> msgMap = new HashMap<String, Object>();
								msgMap.put("touser", template.getToUser());// openid
								msgMap.put("template_id", template.getTemplateId());//"bcqg3y9JlNcX2THzKU4WPp_UKFKrcCxb5_i1j4tYmPk"
								String url=template.getUrl();
								msgMap.put("url", url);
								msgMap.put("data", template.getDataMap());
								String jsonData = JsonKit.toJson(msgMap);
								log.info("模板报文："+jsonData);
								//保存发送日记
								SysMessage sysMessage=new SysMessage();
								sysMessage.set("MSG_TYPE", "template");
								sysMessage.set("TITLE", template.getTitle());
								sysMessage.set("CONTENTS", jsonData);
								sysMessage.set("STATUS", SysMsgStatusEnum.PENDING.getValue());
								sysMessage.set("CREATE_TIME", CommonHelper.getForamtDate(new Date(), "yyyyMMddHHmmss"));
								sysMessage.set("CREATE_BY", "sys");
								sysMessage.set("TARGET_USERIDS", template.getUserIds());
								sysMessage.set("TEMPLATE_ID", template.getTemplateId());
								SysMessageService.service.save(sysMessage);
								
								ApiResult result=TemplateMsgApi.send(jsonData);
								if (result.isSucceed()) {
									sysMessage.set("MSGID", result.get("msgid"));
									sysMessage.set("STATUS", SysMsgStatusEnum.SENT_SUCCESS.getValue());
								}else{
									sysMessage.set("STATUS", SysMsgStatusEnum.SENT_FAIL.getValue());
									sysMessage.set("FAIL_NUMS", 1);
									sysMessage.set("FAIL_MESSAGE",result.getErrorMsg()!=null&&result.getErrorMsg().length()>1000?result.getErrorMsg().substring(0, 1000):result.getErrorMsg());
								}
								SysMessageService.service.update(sysMessage);
						 }else{
							 log.error("模板消息发送失败：template 参数错误 " +template.toString());
						 }
					 }
				
				 }catch(Exception e){
						log.error("模板消息发送失败：" + e.getMessage(), e);
					 e.printStackTrace();
				 }
				
			}
			
		});
		thread.start();
	}

	protected boolean isValid(Template Template) {
		// TODO Auto-generated method stub
		if(CommonHelper.notNulls(Template.getUrlToken())&&CommonHelper.notNulls(Template.getToUser())&&CommonHelper.notNulls(Template.getTemplateId())){
			return true;
		}else{
			return false;
		}
		
	}

}
