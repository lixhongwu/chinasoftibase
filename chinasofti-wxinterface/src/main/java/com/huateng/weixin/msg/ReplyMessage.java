package com.huateng.weixin.msg;

import java.sql.Timestamp;


/**
 * 关键字回复实体类
 * @author Memoa
 *
 */
public class ReplyMessage  {
	private String message_id;
	private String rule_name;//规则名
	private String key_words;//关键字
	private String content;//内容
	private Timestamp create_time;//创建时间
	private Timestamp update_time;//更新时间
	
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public Timestamp getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Timestamp update_time) {
		this.update_time = update_time;
	}
	private String oper_man;//操作者
	public String getMessage_id() {
		return message_id;
	}
	public void setMessage_id(String message_id) {
		this.message_id = message_id;
	}
	public String getRule_name() {
		return rule_name;
	}
	public void setRule_name(String rule_name) {
		this.rule_name = rule_name;
	}
	public String getKey_words() {
		return key_words;
	}
	public void setKey_words(String key_words) {
		this.key_words = key_words;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getOper_man() {
		return oper_man;
	}
	public void setOper_man(String oper_man) {
		this.oper_man = oper_man;
	}
	public ReplyMessage() {
		
	}
	
}
