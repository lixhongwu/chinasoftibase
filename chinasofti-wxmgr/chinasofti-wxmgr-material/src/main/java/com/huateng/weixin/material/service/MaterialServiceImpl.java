package com.huateng.weixin.material.service;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.huateng.weixin.material.mapper.WxMaterialMapper;
import com.huateng.weixin.material.model.MaterialList;
import com.huateng.weixin.material.model.WxMaterial;
import com.huateng.weixin.material.util.WeixinUtil;

import net.sf.json.JSONObject;

@Component("materialService")
public class MaterialServiceImpl implements MaterialService {

	@Autowired
	private WxMaterialMapper wxTemporaryMaterialMapper;

	// 新增临时素材
	private String material_upload_url = "https://api.weixin.qq.com/cgi-bin/media/upload?access_token=ACCESS_TOKEN&type=TYPE";

	// 获取永久素材列表
	private String material_getlist_url = "https://api.weixin.qq.com/cgi-bin/material/batchget_material?access_token=ACCESS_TOKEN";

	// 获取临时素材
	private String material_get_url = "https://api.weixin.qq.com/cgi-bin/media/get?access_token=ACCESS_TOKEN&media_id=MEDIA_ID";

	// 新增永久素材
	private String material_add_material_url = "https://api.weixin.qq.com/cgi-bin/material/add_material?access_token=ACCESS_TOKEN&type=TYPE";

	/**
	 * 上传临时素材
	 */
	public String uploadTemporaryMedia(String accessToken, File file, String title, String introduction) {
		try {
			// File file = new File("C:/Users/chen/Desktop/kobe.jpg");
			// 这块是用来处理如果上传的类型是video的类型的
			JSONObject j = new JSONObject();
			j.put("title", title);
			j.put("introduction", introduction);

			// 拼装请求地址(type写死成image)
			String type = "image"; // 我这里写死
			String uploadMediaUrl = material_upload_url;
			uploadMediaUrl = uploadMediaUrl.replace("ACCESS_TOKEN", accessToken).replace("type", type);

			URL url = new URL(uploadMediaUrl);
			String result = null;
			long filelength = file.length();
			String fileName = file.getName();
			// String
			// suffix=fileName.substring(fileName.lastIndexOf("."),fileName.length());

			/**
			 * 你们需要在这里根据文件后缀suffix将type的值设置成对应的mime类型的值
			 */
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST"); // 以Post方式提交表单，默认get方式
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setUseCaches(false); // post方式不能使用缓存
			// 设置请求头信息
			con.setRequestProperty("Connection", "Keep-Alive");
			con.setRequestProperty("Charset", "UTF-8");

			// 设置边界,这里的boundary是http协议里面的分割符，不懂的可惜百度(http 协议
			// boundary)，这里boundary 可以是任意的值(111,2222)都行
			String BOUNDARY = "----------" + System.currentTimeMillis();
			con.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);
			// 请求正文信息
			// 第一部分：

			StringBuilder sb = new StringBuilder();

			// 这块是post提交type的值也就是文件对应的mime类型值
			sb.append("--"); // 必须多两道线
								// 这里说明下，这两个横杠是http协议要求的，用来分隔提交的参数用的，不懂的可以看看http
								// 协议头
			sb.append(BOUNDARY);
			sb.append("\r\n");
			sb.append("Content-Disposition: form-data;name=\"type\" \r\n\r\n"); // 这里是参数名，参数名和值之间要用两次
			sb.append(type + "\r\n"); // 参数的值

			// 这块是上传video是必须的参数，你们可以在这里根据文件类型做if/else 判断
			if (type.equals("video")) {
				sb.append("--"); // 必须多两道线
				sb.append(BOUNDARY);
				sb.append("\r\n");
				sb.append("Content-Disposition: form-data;name=\"description\" \r\n\r\n");
				sb.append(j.toString() + "\r\n");
			}
			/**
			 * 这里重点说明下，上面两个参数完全可以卸载url地址后面 就想我们平时url地址传参一样，
			 * http://api.weixin.qq.com/cgi-bin/material/add_material?
			 * access_token=##ACCESS_TOKEN##&type=""&description={}
			 * 这样，如果写成这样，上面的 那两个参数的代码就不用写了，不过media参数能否这样提交我没有试，感兴趣的可以试试
			 */

			sb.append("--"); // 必须多两道线
			sb.append(BOUNDARY);
			sb.append("\r\n");
			// 这里是media参数相关的信息，这里是否能分开下我没有试，感兴趣的可以试试
			sb.append("Content-Disposition: form-data;name=\"media\";filename=\"" + fileName + "\";filelength=\""
					+ filelength + "\" \r\n");
			sb.append("Content-Type:application/octet-stream\r\n\r\n");
			System.out.println(sb.toString());
			byte[] head = sb.toString().getBytes("utf-8");
			// 获得输出流
			OutputStream out = new DataOutputStream(con.getOutputStream());
			// 输出表头
			out.write(head);
			// 文件正文部分
			// 把文件已流文件的方式 推入到url中
			DataInputStream in = new DataInputStream(new FileInputStream(file));
			int bytes = 0;
			byte[] bufferOut = new byte[1024];
			while ((bytes = in.read(bufferOut)) != -1) {
				out.write(bufferOut, 0, bytes);
			}
			in.close();
			// 结尾部分，这里结尾表示整体的参数的结尾，结尾要用"--"作为结束，这些都是http协议的规定
			byte[] foot = ("\r\n--" + BOUNDARY + "--\r\n").getBytes("utf-8");// 定义最后数据分隔线
			out.write(foot);
			out.flush();
			out.close();
			StringBuffer buffer = new StringBuffer();
			BufferedReader reader = null;
			// 定义BufferedReader输入流来读取URL的响应
			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String line = null;
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			if (result == null) {
				result = buffer.toString();
			}
			// 使用JSON-lib解析返回结果
			JSONObject jsonObject = JSONObject.fromObject(result);
			if (jsonObject.has("media_id")) {
				String media_id = jsonObject.getString("media_id");
				WxMaterial wxMaterial = new WxMaterial();
				wxMaterial.setFlag(0);
				wxMaterial.setMediaId(media_id);
				wxMaterial.setFileName(file.getName());
				wxMaterial.setFilePath(file.getPath());
				wxMaterial.setCreateTime(new Date());
				wxTemporaryMaterialMapper.insert(wxMaterial);
				return media_id;
			} else {
				return "逻辑错误，json数组中没media_id";
			}

		} catch (IOException e) {
			e.printStackTrace();
			return "错误信息";
		}
	}

	/**
	 * 获取素材列表
	 */
	@Override
	public String getlist(MaterialList materialList, String accessToken) {
		String url = material_getlist_url.replace("ACCESS_TOKEN", accessToken);
		String json = JSONObject.fromObject(materialList).toString();
		JSONObject jsonObject = WeixinUtil.httpRequest(url, "POST", json);
		return String.valueOf(jsonObject);
	}

	@Override
	public String get(WxMaterial wxMaterial, String accessToken) {
		String url = material_get_url.replace("ACCESS_TOKEN", accessToken);
		String json = JSONObject.fromObject(wxMaterial).toString();
		JSONObject jsonObject = WeixinUtil.httpRequest(url, "GET", json);
		return String.valueOf(jsonObject);
	}

	@Override
	public String uploadPermanentMedia(String accessToken, File file, String title, String introduction) {
		try {
			// File file = new File("C:/Users/chen/Desktop/kobe.jpg");
			// 这块是用来处理如果上传的类型是video的类型的
			JSONObject j = new JSONObject();
			j.put("title", title);
			j.put("introduction", introduction);

			// 拼装请求地址(type写死成image)
			String type = "image"; // 我这里写死
			String uploadMediaUrl = material_add_material_url;
			uploadMediaUrl = uploadMediaUrl.replace("ACCESS_TOKEN", accessToken).replace("type", type);

			URL url = new URL(uploadMediaUrl);
			String result = null;
			long filelength = file.length();
			String fileName = file.getName();
			// String
			// suffix=fileName.substring(fileName.lastIndexOf("."),fileName.length());

			/**
			 * 你们需要在这里根据文件后缀suffix将type的值设置成对应的mime类型的值
			 */
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST"); // 以Post方式提交表单，默认get方式
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setUseCaches(false); // post方式不能使用缓存
			// 设置请求头信息
			con.setRequestProperty("Connection", "Keep-Alive");
			con.setRequestProperty("Charset", "UTF-8");

			// 设置边界,这里的boundary是http协议里面的分割符，不懂的可惜百度(http 协议
			// boundary)，这里boundary 可以是任意的值(111,2222)都行
			String BOUNDARY = "----------" + System.currentTimeMillis();
			con.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);
			// 请求正文信息
			// 第一部分：

			StringBuilder sb = new StringBuilder();

			// 这块是post提交type的值也就是文件对应的mime类型值
			sb.append("--"); // 必须多两道线
								// 这里说明下，这两个横杠是http协议要求的，用来分隔提交的参数用的，不懂的可以看看http
								// 协议头
			sb.append(BOUNDARY);
			sb.append("\r\n");
			sb.append("Content-Disposition: form-data;name=\"type\" \r\n\r\n"); // 这里是参数名，参数名和值之间要用两次
			sb.append(type + "\r\n"); // 参数的值

			// 这块是上传video是必须的参数，你们可以在这里根据文件类型做if/else 判断
			if (type.equals("video")) {
				sb.append("--"); // 必须多两道线
				sb.append(BOUNDARY);
				sb.append("\r\n");
				sb.append("Content-Disposition: form-data;name=\"description\" \r\n\r\n");
				sb.append(j.toString() + "\r\n");
			}
			/**
			 * 这里重点说明下，上面两个参数完全可以卸载url地址后面 就想我们平时url地址传参一样，
			 * http://api.weixin.qq.com/cgi-bin/material/add_material?
			 * access_token=##ACCESS_TOKEN##&type=""&description={}
			 * 这样，如果写成这样，上面的 那两个参数的代码就不用写了，不过media参数能否这样提交我没有试，感兴趣的可以试试
			 */

			sb.append("--"); // 必须多两道线
			sb.append(BOUNDARY);
			sb.append("\r\n");
			// 这里是media参数相关的信息，这里是否能分开下我没有试，感兴趣的可以试试
			sb.append("Content-Disposition: form-data;name=\"media\";filename=\"" + fileName + "\";filelength=\""
					+ filelength + "\" \r\n");
			sb.append("Content-Type:application/octet-stream\r\n\r\n");
			System.out.println(sb.toString());
			byte[] head = sb.toString().getBytes("utf-8");
			// 获得输出流
			OutputStream out = new DataOutputStream(con.getOutputStream());
			// 输出表头
			out.write(head);
			// 文件正文部分
			// 把文件已流文件的方式 推入到url中
			DataInputStream in = new DataInputStream(new FileInputStream(file));
			int bytes = 0;
			byte[] bufferOut = new byte[1024];
			while ((bytes = in.read(bufferOut)) != -1) {
				out.write(bufferOut, 0, bytes);
			}
			in.close();
			// 结尾部分，这里结尾表示整体的参数的结尾，结尾要用"--"作为结束，这些都是http协议的规定
			byte[] foot = ("\r\n--" + BOUNDARY + "--\r\n").getBytes("utf-8");// 定义最后数据分隔线
			out.write(foot);
			out.flush();
			out.close();
			StringBuffer buffer = new StringBuffer();
			BufferedReader reader = null;
			// 定义BufferedReader输入流来读取URL的响应
			reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String line = null;
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			if (result == null) {
				result = buffer.toString();
			}
			// 使用JSON-lib解析返回结果
			JSONObject jsonObject = JSONObject.fromObject(result);
			if (jsonObject.has("media_id")) {
				String media_id = jsonObject.getString("media_id");
				String url2 = jsonObject.getString("url");
				WxMaterial wxMaterial = new WxMaterial();
				wxMaterial.setFlag(1);
				wxMaterial.setUrl(url2);
				wxMaterial.setMediaId(media_id);
				wxMaterial.setFileName(file.getName());
				wxMaterial.setFilePath(file.getPath());
				wxMaterial.setCreateTime(new Date());
				wxTemporaryMaterialMapper.insert(wxMaterial);
//				System.out.println("======================="+jsonObject.toString());
				return jsonObject.getString("media_id");
			} else {
				return "逻辑错误，json数组中没media_id";
			}

		} catch (IOException e) {
			e.printStackTrace();
			return "错误信息";
		}
	}

}
