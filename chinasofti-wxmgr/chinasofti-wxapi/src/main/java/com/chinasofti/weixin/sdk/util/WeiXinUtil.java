package com.chinasofti.weixin.sdk.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

import javax.net.ssl.SSLContext;
import javax.servlet.http.HttpServletRequest;

import little.ant.platform.tools.Path;
import little.ant.platform.tools.ToolWeb;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.huateng.weixin.service.WxPayService;
import com.jfinal.kit.PathKit;
import com.jfinal.kit.PropKit;
import com.jfinal.kit.StrKit;

@SuppressWarnings("deprecation")
public class WeiXinUtil {
	
	private static Logger logger = LogManager.getLogger(WeiXinUtil.class);
    /**
     * 创建随机数
     * 
     * @param length
     * @return
     */
    public static String createNoncestr(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String res = "";
        Random rd = new Random();
        for (int i = 0; i < length; i++) {
            res += chars.charAt(rd.nextInt(chars.length() - 1));
        }
        return res;
    }

    /**
     * 创建随机数，16位
     * 
     * @return
     */
    public static String createNoncestr() {
        return createNoncestr(16);
    }

    /**
     * 对参数进行md5加密
     * 
     * @param
     * @param parameters
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static String createSign(SortedMap<Object, Object> parameters, String urltoken) {
        StringBuffer sb = new StringBuffer();
        Set es = parameters.entrySet();
        Iterator it = es.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String k = (String) entry.getKey();
            Object v = entry.getValue();
            if (null != v && !"".equals(v) && !"sign".equalsIgnoreCase(k) && !"key".equalsIgnoreCase(k)) {
                sb.append(k + "=" + v + "&");
            }
        }
        String key = WxPayService.service.getPayByUrltoken(urltoken).getStr("wxkey");// 此处需要修改为根据urltoken获取支付key
        sb.append("key=" + key);
        String sign = MD5Encode(sb.toString(), "utf-8").toUpperCase();
        return sign;
    }

    /**
     * 生成js参数签名
     * 
     * @param
     * @param parameters
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static String createJsSign(SortedMap<Object, Object> parameters) {
        StringBuffer sb = new StringBuffer();
        Set es = parameters.entrySet();
        Iterator it = es.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String k = (String) entry.getKey();
            Object v = entry.getValue();
            if (null != v && !"".equals(v) && !"sign".equalsIgnoreCase(k) && !"key".equalsIgnoreCase(k)) {
                if (StrKit.isBlank(sb.toString())) {
                    sb.append(k + "=" + v);
                } else {
                    sb.append("&" + k + "=" + v);
                }

            }
        }
        StringBuffer hexstr = new StringBuffer();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(sb.toString().getBytes("UTF-8"));
            byte[] digest = md.digest();

            String shaHex = "";
            for (int i = 0; i < digest.length; i++) {
                shaHex = Integer.toHexString(digest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexstr.append(0);
                }
                hexstr.append(shaHex);
            }
        } catch (Exception e) {
        	//logger.error("createJsSign",e);
        }
        return hexstr.toString();

    }
    
    /**
     * 生成apitikect签名
     * @date 2016年1月7日
     * @auther 王侣为
     * @param parameters
     * @return
     */
    public static String createJsTicketSign(List<String> list) {
        StringBuffer sb = new StringBuffer();
        Collections.sort(list);
        
        for (String string : list) {
			sb.append(string);
		}
        
        StringBuffer hexstr = new StringBuffer();
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.update(sb.toString().getBytes("UTF-8"));
            byte[] digest = md.digest();

            String shaHex = "";
            for (int i = 0; i < digest.length; i++) {
                shaHex = Integer.toHexString(digest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexstr.append(0);
                }
                hexstr.append(shaHex);
            }
        } catch (Exception e) {
        	//logger.error("createJsTicketSign",e);
        }
        return hexstr.toString();

    }

    /**
     * 将参数封装为xml信息
     * 
     * @param parameters
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static String getRequestXml(SortedMap<Object, Object> parameters) {
        StringBuffer sb = new StringBuffer();
        sb.append("<xml>");
        Set es = parameters.entrySet();
        Iterator it = es.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String k = (String) entry.getKey();
            String v = (String) entry.getValue();
            // if ("attach".equalsIgnoreCase(k) || "body".equalsIgnoreCase(k)
            // || "sign".equalsIgnoreCase(k)) {
            // sb.append("<" + k + ">" + "<![CDATA[" + v + "]]></" + k + ">");
            // } else {
            sb.append("<" + k + ">" + v + "</" + k + ">");
            // }
        }
        sb.append("</xml>");
        return sb.toString();
    }

    /**
     * 将参数封装为xml信息  带< ! [CDATA[ ] ] > 格式
     * <![CDATA[" + v + "]]>
     * @param parameters
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static String getRequestXmlCDATA(SortedMap<Object, Object> parameters) {
        StringBuffer sb = new StringBuffer();
        sb.append("<xml>");
        Set es = parameters.entrySet();
        Iterator it = es.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String k = (String) entry.getKey();
            String v = (String) entry.getValue();
            
            sb.append("<" + k + ">" + "<![CDATA[" + v + "]]></" + k + ">");
        }
        sb.append("</xml>");
        return sb.toString();
    }
    
    /**
     * xml字符串转成map
     * 
     * @param xml
     * @return
     * @throws Exception
     */
    public static Map<String, String> setXMLToMap(String xml) throws Exception {
        Map<String, String> map = new HashMap<String, String>();

        Document document = DocumentHelper.parseText(xml);
        Element root = document.getRootElement();
        WeiXinUtil.listChild(map, root);

        return map;
    }

    /**
     * 
     * 设置单独的一条xml信息
     * 
     * @param return_code
     * @param return_msg
     * @return
     */
    public static String setXML(String return_code, String return_msg) {
        return "<xml><return_code><![CDATA[" + return_code + "]]></return_code><return_msg><![CDATA[" + return_msg + "]]></return_msg></xml>";
    }

    /**
     * 获取请求的ip地址
     * 
     * @param request
     * @return
     */
    public static String getIpAddr(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if ("0:0:0:0:0:0:0:1%0".equals(ip)) {
            ip = "127.0.0.1";
        }
        if("0:0:0:0:0:0:0:1".equals(ip)){
            ip = "127.0.0.1";
        }
        return ip;
    }

    private static final String hexDigits[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

    private static String byteArrayToHexString(byte b[]) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++)
            resultSb.append(byteToHexString(b[i]));
        return resultSb.toString();
    }

    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n += 256;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    /**
     * md5加密
     * 
     * @param origin
     * @param charsetname
     * @return
     */
    public static String MD5Encode(String origin, String charsetname) {
        String resultString = null;
        try {
            resultString = origin;
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (charsetname == null || "".equals(charsetname)) {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes("UTF-8")));
            } else {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetname)));
            }
        } catch (Exception exception) {
        	//logger.error("MD5Encode",exception);
        }
        return resultString;
    }

    @SuppressWarnings("unchecked")
    public static void listChild(Map<String, String> map, Element e) {
        if (!"xml".equals(e.getName())) {
            map.put(e.getName(), e.getText());
        }
        List<Element> list = e.elements();
        for (Element child : list) {
            listChild(map, child);
        }
    }

    /**
     * xml解析
     * <p>
     * <strong>Description:</strong> parseXML
     * </p>
     * 
     * @param request
     * @return
     * @author <a href="mailto:wanglvwei@chinasofti.com">Wang Lvwei</a>
     * @update 日期: 2014-6-18
     */
    public static Map<String, String> parseXML(HttpServletRequest request) throws Exception {

        Map<String, String> map = new HashMap<String, String>();

        InputStream input = request.getInputStream();

        // 读取输入流
        SAXReader reader = new SAXReader();
        // Document document = reader.read(new
        // File("E:\\Workspaces\\MyEclipse 8.5\\YeeknetWeChat\\WebRoot\\test.xml"));

        Document document = reader.read(input);

        // 获取root
        Element root = document.getRootElement();

        // 获取所有子节点
        // List<Element> elementList = root.elements();

        // 遍历节点

        listChild(map, root);

        input.close();
        return map;
    }

    /**
     * 将普通map转为sortmap便于进行签名
     * 
     * @param requestMap
     * @return
     */
    public static SortedMap<Object, Object> mapToSortMap(Map<String, String> requestMap) {
        SortedMap<Object, Object> map = new TreeMap<Object, Object>();
        for (Entry<String, String> entry : requestMap.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    /**
     * 校验微信返回消息的签名是否正确
     * 
     * @param map
     * @return
     */
    public static boolean isWxSignVali(Map<String, String> map, String urltoken) {
        if (map.get("sign") == null) {
            return false;
        }
        String signTemp = map.get("sign");

        SortedMap<Object, Object> sortedMap = mapToSortMap(map);

        String sign = createSign(sortedMap, urltoken);

        if (signTemp.equals(sign)) {
            return true;
        }
        return false;
    }

    /**
     * 获取证书加密链接
     * 
     * @return
     * @throws Exception
     */
    public static CloseableHttpClient getSSLHttpClient(String mchid) throws Exception {
        KeyStore keyStore = KeyStore.getInstance("PKCS12");

//        String classPath = WeiXinUtil.class.getResource("/").getPath();
        // /D:/TEST/WebRoot/WEB-INF/classes/pack/
        String classPath=PathKit.getRootClassPath()+File.separator;
        
       logger.info("PathKit.getRootClassPath():   "+classPath);
//        classPath = classPath.substring(0, classPath.indexOf("classes") + 7) + "/";

        FileInputStream instream = new FileInputStream(new File(classPath + PropKit.get("config.apiclient_cert.name")));
        try {
            keyStore.load(instream, mchid.toCharArray());
        } finally {
            instream.close();
        }

        // Trust own CA and all self-signed certs
        SSLContext sslcontext = SSLContexts.custom().loadKeyMaterial(keyStore, mchid.toCharArray()).build();
        // Allow TLSv1 protocol only
        SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[] { "TLSv1" }, null,
                SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
        
        return httpclient;
    }

    /**
     * 获取本机的ip地址
     * 
     * @return
     * @throws Exception
     */
    public static String getLoacalIP() throws Exception {
        InetAddress addr = InetAddress.getLocalHost();
        return addr.getHostAddress();// 获得本机IP
    }
    

}
