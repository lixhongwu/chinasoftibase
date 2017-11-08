package com.chinasofti.weixin.sdk.kit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.servlet.http.HttpServletRequest;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.config.RequestConfig.Builder;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

/**
 * @author Administrator
 *
 */
public class HttpKit {

	//private static Logger logger = LogManager.getLogger(HttpKit.class);

	public static boolean useProxy = true;;

	public static String proxyHost;
	public static int proxyPort;

	private static final String CHARSET = "UTF-8";

	public static String get(String url) {
		return get(url, null, null);
	}


	/**
	 * https 证书管理
	 */
	private class TrustAnyTrustManager implements X509TrustManager {
		public X509Certificate[] getAcceptedIssuers() {
			return null;
		}

		public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		}

		public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
		}
	}
	
	/**
	 * 带证书pkcs12格式(apiclient_cert.p12的POST请求
	 * @param paramMap
	 * @param mchid
	 * @param requestUrl
	 * @return
	 */
	/*public static Map<String, String> postSSLCertP12(SortedMap<Object, Object> paramMap,String mchid,String requestUrl){
		logger.info("--rquestwx begin---url="+requestUrl);
		long begin = System.currentTimeMillis();
		Map<String, String> resultMap = new HashMap<String, String>();
		CloseableHttpClient httpclient = null;
		try{
			// 创建证书安全连接，发送报文
			httpclient = WeiXinUtil.getSSLHttpClient(mchid);
	    	HttpPost httppost = new HttpPost(requestUrl);
	    	logger.info("requestUrl="+requestUrl);
			if(paramMap==null){
				paramMap = new TreeMap<Object, Object>();
			}
			logger.info("post paramMap="+JsonKit.toJson(paramMap));
			
			 // 默认30秒时间超时
			Builder defaultRequestBuilder = RequestConfig.custom()
//		            .setConnectTimeout(30000)
//		            .setSocketTimeout(30000)
		            ;
	    	if(useProxy){
	    		Param userAgent = Param.dao.cacheGet("userAgent");
	    		if (userAgent != null) {
	    			if ("1".equals(userAgent.getStr("status")) && "1".equals(userAgent.getStr("val"))) {
	    				Param agentHost = Param.dao.cacheGet("agentHost");
	    				Param agentPort = Param.dao.cacheGet("agentPort");
	    				String proxyHost = agentHost.getStr("val");
	    				int proxyPort = Integer.parseInt(agentPort.getStr("val"));
	    				
	    				defaultRequestBuilder.setProxy(new HttpHost(proxyHost, proxyPort));
	    				httppost.setConfig(defaultRequestBuilder.build());
	    			}
	    		}
	    	}
	    	
	    	StringEntity se = new StringEntity(WeiXinUtil.getRequestXmlCDATA(paramMap),CHARSET);
			httppost.setEntity(se);
			CloseableHttpResponse response = httpclient.execute(httppost);
			
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				InputStream input = entity.getContent();
				// 读取输入流
				SAXReader reader = new SAXReader();
				Document document = reader.read(input);
				Element root = document.getRootElement();
				WeiXinUtil.listChild(resultMap, root);
				input.close();
				EntityUtils.consume(entity);
				logger.info("responseContent="+ JsonKit.toJson(resultMap));
			}
		}catch (Exception e) {
			logger.error("带证书pkcs12格式(apiclient_cert.p12的POST请求 异常，"+e.getMessage(),e);
			throw new RuntimeException(e);
		} finally {
			if (httpclient != null) {
				try {
					httpclient.close();
				} catch (IOException e) {
					logger.error("httpclient.close() exception:", e);
				}
			}
		}
		long end = System.currentTimeMillis();
		logger.info("--rquestwx end---url="+requestUrl + " 耗时:"+(end-begin));
		return resultMap;
	}*/
	
    public static CloseableHttpClient createHttpsClient() throws NoSuchAlgorithmException, KeyManagementException {
        PoolingHttpClientConnectionManager connManager;
    	TrustManager[] tm = { new HttpKit().new TrustAnyTrustManager() };
		SSLContext sslContext = SSLContext.getInstance("TLS");
		sslContext.init(null, tm, new java.security.SecureRandom());
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext);

        
        Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory> create()
            .register("http", PlainConnectionSocketFactory.INSTANCE)
            .register("https", sslsf)
            .build();
        connManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
        
        connManager.setMaxTotal(Integer.MAX_VALUE);
        connManager.setDefaultMaxPerRoute(Integer.MAX_VALUE);

        // 默认30秒时间超时
        RequestConfig defaultRequestConfig = RequestConfig.custom()
            .setConnectTimeout(30000)
            .setSocketTimeout(30000)
            .build();


		HttpClientBuilder builder = HttpClients.custom()
	            .setConnectionManager(connManager)
	            .setDefaultRequestConfig(defaultRequestConfig)
	             .setKeepAliveStrategy(createKeepAliveStrategy());
//		if(useProxy){
//	        Param userAgent = Param.dao.cacheGet("userAgent");
//			if(userAgent != null){
//				if("1".equals(userAgent.getStr("status"))&&"1".equals(userAgent.getStr("val"))){
//					Param agentHost = Param.dao.cacheGet("agentHost");
//					Param agentPort = Param.dao.cacheGet("agentPort");
//					logger.info("agentHost=" + agentHost.getStr("val"));
//					proxyHost = agentHost.getStr("val");
//					proxyPort = Integer.parseInt(agentPort.getStr("val"));
//				}
//			}
//
//			HttpHost proxy = new HttpHost(proxyHost, proxyPort, "http");
//			builder.setProxy(proxy);
//		}
		
        CloseableHttpClient httpclient = builder.build();
        return httpclient;
    }
	
    public static ConnectionKeepAliveStrategy createKeepAliveStrategy(){
        ConnectionKeepAliveStrategy myStrategy = new ConnectionKeepAliveStrategy(){
            @Override
            public long getKeepAliveDuration(HttpResponse resp, HttpContext ctx) {
                return 5 * 60 * 1000; //5分钟的连接缓存
            }
        };
        return myStrategy;
    }
	
	public static String get(String url, Map<String, String> queryParas) {
		//logger.info("--rquestwx begin---url="+url);
		long begin = System.currentTimeMillis();
		String result = get(url, queryParas, null);
		long end = System.currentTimeMillis();
		//logger.info("--rquestwx end---url="+url + " 耗时:"+(end-begin));
		return result;
	}
	
	/**
	 * Send GET request
	 */
	public static String get(String url, Map<String, String> queryParas, Map<String, String> headers) {
//		url = url.replace("https://api.weixin.qq.com", "http://128.160.12.151:9080/TopMallProxy/SendMsg/570001");
		CloseableHttpClient httpclient = null;
		try {
			httpclient = createHttpsClient();
			String buildUrl = buildUrlWithQueryString(url, queryParas);
			//logger.info("requestUrl="+buildUrl);
			if(queryParas!=null){
				//logger.info("queryParas="+JsonKit.toJson(queryParas));
			}
			HttpGet httpget = new HttpGet(buildUrl);
			if (headers != null && !headers.isEmpty()) {
				for (Entry<String, String> entry : headers.entrySet()) {
					httpget.setHeader(entry.getKey(), entry.getValue());
				}
			}
			
			CloseableHttpResponse response = httpclient.execute(httpget);
			int statusCode = response.getStatusLine().getStatusCode();
			//logger.info("statusCode=" + statusCode);
			return readResponseString(response);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (httpclient != null) {
				try {
					httpclient.close();
				} catch (IOException e) {
					//logger.error("httpclient.close() exception:", e);
				}
			}
		}
	}

	private static String readResponseString(CloseableHttpResponse response) throws IOException {
		String responseContent = null;
		// 获取响应实体
		HttpEntity entity = response.getEntity();
		if (null != entity) {
			responseContent = EntityUtils.toString(entity, CHARSET);
			// Consume response content
			EntityUtils.consume(entity);
			//logger.info("responseContent="+responseContent);
		}
		return responseContent;
	}

	/**
	 * Build queryString of the url
	 */
	public static String buildUrlWithQueryString(String url, Map<String, String> queryParas) {
		if (queryParas == null || queryParas.isEmpty())
			return url;

		StringBuilder sb = new StringBuilder(url);
		boolean isFirst;
		if (url.indexOf("?") == -1) {
			isFirst = true;
			sb.append("?");
		} else {
			isFirst = false;
		}

		for (Entry<String, String> entry : queryParas.entrySet()) {
			if (isFirst)
				isFirst = false;
			else
				sb.append("&");

			String key = entry.getKey();
			String value = entry.getValue();
			if (value != null && value.length() > 0)
				try {
					value = URLEncoder.encode(value, CHARSET);
				} catch (UnsupportedEncodingException e) {
					throw new RuntimeException(e);
				}
			sb.append(key).append("=").append(value);
		}
		return sb.toString();
	}

	public static String post(String url, Map<String, String> queryParas, String data) {
		return post(url, queryParas, data, null);
	}

	public static String post(String url, String data, Map<String, String> headers) {
		return post(url, null, data, headers);
	}

	public static String post(String url, String data) {
		return post(url, null, data, null);
	}

	/**
	 * Send POST request
	 */
	public static String post(String url, Map<String, String> queryParas, String body, Map<String, String> headers) {
		//url = url.replace("https://api.weixin.qq.com", "http://128.160.12.151:9080/TopMallProxy/SendMsg/570001");
		CloseableHttpClient httpclient = null;

		try {
			httpclient = createHttpsClient();
			String buildUrl = buildUrlWithQueryString(url, queryParas);
			HttpPost httpPost = new HttpPost(buildUrl);
			if (headers != null && !headers.isEmpty()) {
				for (Entry<String, String> entry : headers.entrySet()) {
					httpPost.setHeader(entry.getKey(), entry.getValue());
				}
			}

			if (body != null && body.length() > 0) {
				String mimeType = "application/x-www-form-urlencoded";
				HttpEntity entity = new StringEntity(body, ContentType.create(mimeType, CHARSET));
				httpPost.setEntity(entity);
			}
			//logger.info("requestUrl="+buildUrl);
			if(queryParas!=null){
				//logger.info("queryParas="+JsonKit.toJson(queryParas));
			}
			if(body!=null){
				//logger.info("body="+body);
			}
			CloseableHttpResponse response = httpclient.execute(httpPost);
			int statusCode = response.getStatusLine().getStatusCode();
			//logger.info("statusCode=" + statusCode);
			return readResponseString(response);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (httpclient != null) {
				try {
					httpclient.close();
				} catch (IOException e) {
					//logger.error("httpclient.close() exception:", e);
				}
			}
		}
	}

	public static String readIncommingRequestData(HttpServletRequest request) {
		BufferedReader br = null;
		try {
			StringBuilder result = new StringBuilder();
			br = request.getReader();
			for (String line = null; (line = br.readLine()) != null;) {
				result.append(line).append("\n");
			}

			return result.toString();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					//logger.error("httpclient.readIncommingRequestData() exception:", e);
				}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HttpKit.useProxy = true;
		HttpKit.proxyHost = "172.20.20.20";
		HttpKit.proxyPort = 8080;
		for (int i = 0; i < 5000; i++) {
			String result = HttpKit.get(
					"https://api.weixin.qq.com/sns/userinfo?openid=oMD8As4drpt-sHDU2NY1HFQsDcL4&lang=zh_CN&access_token=OezXcEiiBSKSxW0eoylIeEyzINRqPKtGyxMQFGuGJMDYYalVZkdRf8RXhSDNSN-T1Fq_JssVLZHraU1FFcWbAO7GjMJ70KrWuzLGHONMZIGVSPheJu8J8guuajMZHyAungLCCA3dELSOTi_iu2TvUQ");
			System.out.println("get result=" + result);
		}
		// String postResult =
		// post("https://api.weixin.qq.com/cgi-bin/groups/create?access_token=ACCESS_TOKEN","{\"group\":{\"name\":\"test\"}}");
		// System.out.println("postResult = " + postResult);
	}

}
