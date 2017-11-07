package com.huateng.weixin.util;


import java.io.InputStream;
import java.io.Writer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.huateng.weixin.msgrsp.Article;
import com.huateng.weixin.msgrsp.ImageMessageRsp;

import com.huateng.weixin.msgrsp.MusicMessageRsp;
import com.huateng.weixin.msgrsp.NewsMessageRsp;
import com.huateng.weixin.msgrsp.TextMessageRsp;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;



public class MessageUtil {

    /**
     * 返回消息类型：文本
     */
    public static final String RESP_MESSAGE_TYPE_TEXT = "text";

    /**
     * 返回消息类型：音乐
     */
    public static final String RESP_MESSAGE_TYPE_MUSIC = "music";

    /**
     * 返回消息类型：图文
     */
    public static final String RESP_MESSAGE_TYPE_NEWS = "news";

    /**
     * 请求消息类型：文本
     */
    public static final String REQ_MESSAGE_TYPE_TEXT = "text";

    /**
     * 请求消息类型：图片
     */
    public static final String REQ_MESSAGE_TYPE_IMAGE = "image";

    /**
     * 请求消息类型：链接
     */
    public static final String REQ_MESSAGE_TYPE_LINK = "link";

    /**
     * 请求消息类型：地理位置
     */
    public static final String REQ_MESSAGE_TYPE_LOCATION = "location";

    /**
     * 请求消息类型：音频
     */
    public static final String REQ_MESSAGE_TYPE_VOICE = "voice";

    /**
     * 请求消息类型：推送
     */
    public static final String REQ_MESSAGE_TYPE_EVENT = "event";

    /**
     * 事件类型：subscribe(订阅)and 未关注群体扫描二维码
     */
    public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";

    /**
     * 事件类型：已关注群体扫描二维码
     */
    public static final String EVENT_TYPE_SCAN="SCAN";
    /**
     * 事件类型：unsubscribe(取消订阅)
     */
    public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";

    /**
     * 事件类型：CLICK(自定义菜单点击事件)
     */
    public static final String EVENT_TYPE_CLICK = "CLICK";
    /**
     * 事件类型：VIEW(点击自定义菜单跳转链接时的事件)
     */
    public static final String EVENT_TYPE_VIEW = "VIEW";

    /**
     * 事件类型：transfer_customer_service(把消息推送给客服)
     */
    public static final String EVENT_TYPE_TRANSFER_CUSTOMER_SERVICE = "transfer_customer_service";
    
    /**
     * 解析xml
     * @param request
     * @return
     * @throws Exception
     */
    public static Map<String,String> parsexml (HttpServletRequest request )throws Exception{
    	//将解析结果存储在map里面
    	Map<String,String> map=new HashMap<String,String>();
    	//从request里面获取输入流
    	InputStream input=request.getInputStream();
        // 读取输入流
        SAXReader reader = new SAXReader();
        Document document = reader.read(input);
        // 得到xml根元素
        Element root = document.getRootElement();
        // 得到根元素的所有子节点
        List<Element> elementList = root.elements();
        // 遍历所有子节点
        for (Element e : elementList)
            map.put(e.getName(), e.getText());

        // 释放资源
        input.close();
        input = null;
        return map;	
    }
    
    /**
     * 文本消息对象转换成xml
     *
     * @param textMessage 文本消息对象
     * @return xml
     */
    public static String textMessageToXml(TextMessageRsp textMessage) {
    	XStream xStream = new XStream();
    	xStream.alias("xml", textMessage.getClass());
        return xStream.toXML(textMessage);
    }
    
    /**
     * 图片消息对象转换成xml
     * @param imageMessage
     * @return xml
     */
    public static String ImageMessageToXml(ImageMessageRsp imageMessage) {
    	XStream xStream = new XStream();
    	xStream.alias("xml", imageMessage.getClass());
    	return  xStream.toXML(imageMessage);
    }
    /**
     * 图文消息对象转换成xml
     * @param linkMessage
     * @return xml
     */
    public static String NewsMessageToXml(NewsMessageRsp newsMessage) {
    	XStream xStream =new XStream();
    	xStream.alias("xml", newsMessage.getClass());
    	xStream.alias("item", new Article().getClass());
    	return xStream.toXML(newsMessage);
    }
    /**
     * 音频消息对象转换成xml
     * @param musicMessage
     * @return
     */
    public static String MusicMessageToXml(MusicMessageRsp musicMessage) {
    	XStream xStream =new XStream();
    	xStream.alias("xml", musicMessage.getClass());
    	return xStream.toXML(musicMessage);
    }
    
  /**
   * 写好的xml加上CDATA标签
   */
    private static XStream xstream = new XStream(new XppDriver() {
        public HierarchicalStreamWriter createWriter(Writer out) {
            return new PrettyPrintWriter(out) {
                // 对所有xml节点的转换都增加CDATA标记
                boolean cdata = true;

                @SuppressWarnings("unchecked")
                public void startNode(String name, Class clazz) {
                    super.startNode(name, clazz);
                }

                protected void writeText(QuickWriter writer, String text) {
                    if (cdata) {
                        writer.write("<![CDATA[");
                        writer.write(text);
                        writer.write("]]>");
                    } else {
                        writer.write(text);
                    }
                }
            };
        }
    });

}
