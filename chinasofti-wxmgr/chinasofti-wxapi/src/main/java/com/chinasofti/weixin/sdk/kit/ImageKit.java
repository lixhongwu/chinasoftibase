package com.chinasofti.weixin.sdk.kit;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.codec.binary.Base64;

import com.jfinal.kit.StrKit;

/**
 * 远程图片转为base64
 * @author wanglvwei
 *
 */
public class ImageKit {
    
    public static String UrlToBase64(String imgSrc){
        if (StrKit.isBlank(imgSrc)) {
            return "";
        }
        InputStream in = null;
        byte[] data = null;
        // 读取图片字节数组
        try {
            URL url = new URL(imgSrc);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            
            conn.setConnectTimeout(19000);
            conn.setReadTimeout(19000);
            conn.connect();
            in = conn.getInputStream();
             
            data = readInputStream(in);
          
        } catch (Exception e) {
             return "";
        }finally{
            try {
            	if(in!=null){
            		in.close();
            	}
            } catch (IOException e) {
                return "";
            }
        }
        // 对字节数组Base64编码
        
         
        return "data:image/png;base64,"+Base64.encodeBase64String(data).replaceAll("\n", "");
    }
    
    private static byte[] readInputStream(InputStream inStream) throws Exception{  
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();  
        //创建一个Buffer字符串  
        byte[] buffer = new byte[1024];  
        //每次读取的字符串长度，如果为-1，代表全部读取完毕  
        int len = 0;  
        //使用一个输入流从buffer里把数据读取出来  
        while( (len=inStream.read(buffer)) != -1 ){  
            //用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度  
            outStream.write(buffer, 0, len);  
        }  
        //关闭输入流  
        inStream.close();  
        //把outStream里的数据写入内存  
        return outStream.toByteArray();  
    }  
}
