package com.huateng.weixin.material.util;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.X509TrustManager;
/**
 * 
 * @ClassName:   MyX509TrustManager.java
 * @Description  证书信任管理器（用于https请求)
 *
 * @author       chen email:chen_druid@163.com
 * @version      V1.0
 * @Date         2017年11月8日  下午3:04:34
 */
public class MyX509TrustManager implements X509TrustManager {

	@Override
	public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {

	}

	@Override
	public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {

	}

	@Override
	public X509Certificate[] getAcceptedIssuers() {
		return null;
	}

}
