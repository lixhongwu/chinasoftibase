package com.huateng.weixin.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.huateng.weixin.msgrsp.Article;
import com.huateng.weixin.msgrsp.NewsMessageRsp;
import com.huateng.weixin.msgrsp.TextMessageRsp;
import com.huateng.weixin.service.MsgService;
import com.huateng.weixin.util.MessageUtil;

/**
 * 核心服务类
 * 
 * @author husong 2017年11月1日
 */
@Service("MsgService")
public class MsgServiceImpl implements MsgService {

	private static Logger log = LoggerFactory.getLogger(MsgServiceImpl.class);

	/**
	 * 处理微信发来的请求（包括事件的推送）
	 *
	 * @param request
	 * @return
	 */
	public String processRequest(HttpServletRequest request) {

		String respMessage = null;
		try {
			// 默认返回的文本消息内容
			String respContent = "请求处理异常，请稍候尝试！";
			// xml请求解析
			Map<String, String> requestMap = MessageUtil.parsexml(request);
			// 发送方帐号（open_id）
			String fromUserName = requestMap.get("FromUserName");
			// 公众帐号
			String toUserName = requestMap.get("ToUserName");
			// 消息类型
			String msgType = requestMap.get("MsgType");
			// 回复文本消息
			TextMessageRsp textMessage = new TextMessageRsp();
			textMessage.setToUserName(fromUserName);
			textMessage.setFromUserName(toUserName);
			textMessage.setCreateTime(new Date().getTime());
			textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
			textMessage.setFuncFlag(0);

			// 创建图文消息
			NewsMessageRsp newsMessage = new NewsMessageRsp();
			newsMessage.setToUserName(fromUserName);
			newsMessage.setFromUserName(toUserName);
			newsMessage.setCreateTime(new Date().getTime());
			newsMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);
			newsMessage.setFuncFlag(0);

			List<Article> articleList = new ArrayList<Article>();
			// 接收文本消息内容
			String content = requestMap.get("Content");
			// 自动回复文本消息
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {

				// 如果用户发送表情，则回复同样表情。
				if (isQqFace(content)) {
					respContent = content;
					textMessage.setContent(respContent);
					// 将文本消息对象转换成xml字符串
					respMessage = MessageUtil.textMessageToXml(textMessage);
				} else {
					// 回复固定消息
					switch (content) {

					case "1": {
						StringBuffer buffer = new StringBuffer();
						buffer.append("您好,我是客服机器人,请回复数字选择服务：").append("\n\n");
						buffer.append("11 可查看测试单图文").append("\n");
						buffer.append("12  可测试多图文发送").append("\n");
						buffer.append("13  可测试网址").append("\n");
						buffer.append("或者您可以尝试发送表情").append("\n\n");
						buffer.append("回复“1”显示此帮助菜单").append("\n");
						respContent = String.valueOf(buffer);
						textMessage.setContent(respContent);
						respMessage = MessageUtil.textMessageToXml(textMessage);
						break;
					}
					case "11": {
						// 测试单图文回复
						Article article = new Article();
						article.setTitle("微信公众帐号开发教程Java版");
						// 图文消息中可以使用QQ表情、符号表情
						article.setDescription("javaSE\n\nSpringBoot\n\n点击图文可以跳转到百度首页");
						// 将图片置为空
						article.setPicUrl("http://www.sinaimg.cn/dy/slidenews/31_img/2016_38/28380_733695_698372.jpg");
						article.setUrl("http://www.baidu.com");
						articleList.add(article);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respMessage = MessageUtil.NewsMessageToXml(newsMessage);
						break;
					}
					case "12": {
						// 多图文发送
						Article article1 = new Article();
						article1.setTitle("紧急通知，不要捡这种钱！湛江都已经传疯了！\n");
						article1.setDescription("");
						article1.setPicUrl("http://www.sinaimg.cn/dy/slidenews/31_img/2016_38/28380_733695_698372.jpg");
						article1.setUrl(
								"http://mp.weixin.qq.com/s?__biz=MjM5Njc2OTI4NQ==&mid=2650924309&idx=1&sn=8bb6ae54d6396c1faa9182a96f30b225&chksm=bd117e7f8a66f769dc886d38ca2d4e4e675c55e6a5e01e768b383f5859e09384e485da7bed98&scene=4#wechat_redirect");

						Article article2 = new Article();
						article2.setTitle("湛江谁有这种女儿，请给我来一打！");
						article2.setDescription("");
						article2.setPicUrl("http://www.sinaimg.cn/dy/slidenews/31_img/2016_38/28380_733695_698372.jpg");
						article2.setUrl(
								"http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%BE%AE%E4%BF%A1%E7%BE%8E%E5%A5%B3%E5%9B%BE%E7%89%87&step_word=&hs=2&pn=1&spn=0&di=9166854430&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=4273937109%2C2950399878&os=3436253650%2C2054068332&simid=0%2C0&adpicid=0&lpn=0&ln=1966&fr=&fmq=1510022073180_R&fm=detail&ic=0&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=11&oriquery=&objurl=http%3A%2F%2Fimg.duoziwang.com%2Fuploads%2F1512%2F1-15122H15H20-L.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3B175ztowg2_z%26e3Bv54AzdH3Fijw1AzdH3Fi7wvw5AzdH3Fm8cc8a_z%26e3Bip4s&gsm=0&rpstart=0&rpnum=0");

						Article article3 = new Article();
						article3.setTitle("复制粘贴");
						article3.setDescription("");
						article3.setPicUrl("http://www.sinaimg.cn/dy/slidenews/31_img/2016_38/28380_733695_698372.jpg");
						article3.setUrl(
								"http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%BE%AE%E4%BF%A1%E7%BE%8E%E5%A5%B3%E5%9B%BE%E7%89%87&step_word=&hs=2&pn=12&spn=0&di=142680755690&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=4230523949%2C413472430&os=3625926219%2C1732644361&simid=4042703251%2C580528419&adpicid=0&lpn=0&ln=1966&fr=&fmq=1510022073180_R&fm=detail&ic=0&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fi1.muzisoft.com%2Fuploads%2Fhct%2F20160705%2Fk25fza0shlpk25fza0shlp.png&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3B47ztf5up_z%26e3Bv54AzdH3Ff5upAzdH3Fd0baca_z%26e3Bip4s&gsm=0&rpstart=0&rpnum=0");

						articleList.add(article1);
						articleList.add(article2);
						articleList.add(article3);
						newsMessage.setArticleCount(articleList.size());
						newsMessage.setArticles(articleList);
						respMessage = MessageUtil.NewsMessageToXml(newsMessage);
						break;
					}

					case "13": {
						// 测试网址回复
						respContent = "<a href=\"http://www.baidu.com\">百度主页</a>";
						textMessage.setContent(respContent);
						// 将文本消息对象转换成xml字符串
						respMessage = MessageUtil.textMessageToXml(textMessage);
						break;
					}

					default: {
						respContent = "（这是里面的）很抱歉，现在小8暂时无法提供此功能给您使用。\n\n回复“1”显示帮助信息";
						textMessage.setContent(respContent);
						// 将文本消息对象转换成xml字符串
						respMessage = MessageUtil.textMessageToXml(textMessage);
					}
					}
				}
			}
			// 图片消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
				respContent = "您发送的是图片消息！";
				textMessage.setContent(respContent);
				// 将文本消息对象转换成xml字符串
				respMessage = MessageUtil.textMessageToXml(textMessage);
			}
			// 地理位置消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {
				respContent = "您发送的是地理位置消息！";
				textMessage.setContent(respContent);
				// 将文本消息对象转换成xml字符串
				respMessage = MessageUtil.textMessageToXml(textMessage);
			}
			// 链接消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {
				respContent = "您发送的是链接消息！";
				textMessage.setContent(respContent);
				// 将文本消息对象转换成xml字符串
				respMessage = MessageUtil.textMessageToXml(textMessage);

			}
			// 音频消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {
				respContent = "您发送的是音频消息！";
				textMessage.setContent(respContent);
				// 将文本消息对象转换成xml字符串
				respMessage = MessageUtil.textMessageToXml(textMessage);
					}
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {  
                // 事件类型  
                String eventType = requestMap.get("Event");  
  
                if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {  
                    // 关注  
                    respContent = "感谢您关注偶,这里会给您提供最新的公司资讯和公告！\n";  
                    StringBuffer contentMsg = new StringBuffer();  
                    contentMsg.append("您还可以回复下列数字，体验相应服务").append("\n\n");  
                    contentMsg.append("1  服务帮助").append("\n");  
                    contentMsg.append("11 单图文").append("\n");  
                    contentMsg.append("12 我是多图文").append("\n");  
                    respContent = respContent+contentMsg.toString();  
                      
                } else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {  
                    // 取消关注,用户接受不到我们发送的消息了，可以在这里记录用户取消关注的日志信息  
                	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
                	String canceldate=df.format(new Date());        
                          log.info("该用户在"+canceldate+"时取消关注了微信公众号");
                }  else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {  
  
                    // 事件KEY值，与创建自定义菜单时指定的KEY值对应  
                    String eventKey = requestMap.get("EventKey");  
  
                    // 自定义菜单点击事件  
                    if (eventKey.equals("14")) {  
                        respContent = "天气预报菜单项被点击！";  
                    } else if (eventKey.equals("15")) {  
                        respContent = "公交查询菜单项被点击！";  
                    }  
                }  
                textMessage.setContent(respContent);  
                respMessage = MessageUtil.textMessageToXml(textMessage);  
  
            }  
		} catch (Exception e) {
			e.printStackTrace();
		}

		return respMessage;
	}

	/**
	 * 判断是否是QQ表情
	 *
	 * @param content
	 * @return
	 */
	public static boolean isQqFace(String content) {
		boolean result = false;

		// 判断QQ表情的正则表达式
		String qqfaceRegex = "/::\\)|/::~|/::B|/::\\||/:8-\\)|/::<|/::$|/::X|/::Z|/::'\\(|/::-\\||/::@|/::P|/::D|/::O|/::\\(|/::\\+|/:--b|/::Q|/::T|/:,@P|/:,@-D|/::d|/:,@o|/::g|/:\\|-\\)|/::!|/::L|/::>|/::,@|/:,@f|/::-S|/:\\?|/:,@x|/:,@@|/::8|/:,@!|/:!!!|/:xx|/:bye|/:wipe|/:dig|/:handclap|/:&-\\(|/:B-\\)|/:<@|/:@>|/::-O|/:>-\\||/:P-\\(|/::'\\||/:X-\\)|/::\\*|/:@x|/:8\\*|/:pd|/:<W>|/:beer|/:basketb|/:oo|/:coffee|/:eat|/:pig|/:rose|/:fade|/:showlove|/:heart|/:break|/:cake|/:li|/:bome|/:kn|/:footb|/:ladybug|/:shit|/:moon|/:sun|/:gift|/:hug|/:strong|/:weak|/:share|/:v|/:@\\)|/:jj|/:@@|/:bad|/:lvu|/:no|/:ok|/:love|/:<L>|/:jump|/:shake|/:<O>|/:circle|/:kotow|/:turn|/:skip|/:oY|/:#-0|/:hiphot|/:kiss|/:<&|/:&>";
		Pattern p = Pattern.compile(qqfaceRegex);
		Matcher m = p.matcher(content);
		if (m.matches()) {
			result = true;
		}
		return result;
	}
}
