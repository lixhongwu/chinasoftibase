package com.huateng.wxmgr.web.controller;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.huateng.wxmgr.web.feign.MaterialFeignClient;
import com.huateng.wxmgr.web.model.WxMaterial;

@RestController
@RequestMapping("wxmaterial")
public class MaterialController {

	private static Logger log = LoggerFactory.getLogger(MaterialController.class);
	@Autowired
	private MaterialFeignClient materialFeignClient;

	@RequestMapping("/material") 
	public ModelAndView getView() {
		return new ModelAndView("material/material");
	} 

	//从数据库中获取素材
	@RequestMapping("/findAll")
	public List<WxMaterial> findAll() {
		List<WxMaterial> list = null;
		try {
			list = materialFeignClient.findAll();
		} catch (Exception e) { 
			e.printStackTrace();
			log.info("获取数据库素材失败");
		}
		return list;
	} 
	
	//获取素材列表（调用微信接口）
	@RequestMapping(value="/listPermanentMaterial", method = RequestMethod.POST)
	public JSONObject listPermanentMaterial(){
		try {
			JSONObject listPermanentMaterial = materialFeignClient.listPermanentMaterial();
			return listPermanentMaterial;
		} catch (Exception e) {
			e.printStackTrace();
			log.info(">>>>>>>>>>>>>>获取素材列表失败");
			return null;
		}
	}

	//上传素材（临时素材和永久素材）
	@RequestMapping(value = "/uploadTempMaterial", method = RequestMethod.POST)
	public JSONObject uploadTempMaterial(@RequestBody(required=true) MultipartFile file,String flag) {
		//当页面选择临时素材上传单选按钮时 flag是"0" 选永久素材为"1"
		if("0".equals(flag)){
			String name = file.getOriginalFilename();
			log.info(name);
			String newPath = "D:\\";
			newPath = newPath + name;
			copyFile(file, newPath); 
			String fileDir = newPath;
			JSONObject uploadTempMaterial = materialFeignClient.uploadTempMaterial(fileDir);
			return uploadTempMaterial;
		}
			String name = file.getOriginalFilename();
			log.info(name);
			String newPath = "D:\\";
			newPath = newPath + name;
			copyFile(file, newPath); 
			String fileDir = newPath;
			JSONObject uploadTempMaterial = materialFeignClient.uploadPermanentMaterial(fileDir);
			return uploadTempMaterial;
	} 
	//删除永久素材
	@RequestMapping(value="/deletePermanentMaterial", method = RequestMethod.POST)
	public JSONObject deletePermanentMaterial(@RequestParam(value="mediaId") String mediaId){
			JSONObject deletePermanentMaterial = materialFeignClient.deletePermanentMaterial(mediaId);
			return deletePermanentMaterial;
	}

	//读写form表单file文件到本地磁盘
	public static void copyFile(MultipartFile file, String newPath) {
		try {
			int bytesum = 0;
			int byteread = 0;
			byte[] bytes = file.getBytes();
			if (!file.isEmpty()) { // 文件存在时
				InputStream inputStream = file.getInputStream();
				FileOutputStream fs = new FileOutputStream(newPath);
				byte[] buffer = new byte[1024];
				while ((byteread = inputStream.read(buffer)) != -1) {
					bytesum += byteread; // 字节数 文件大小
					System.out.println(bytesum);
					fs.write(buffer, 0, byteread);
				}
				inputStream.close();
				fs.close();
			}
		} catch (Exception e) {
			System.out.println("复制单个文件操作出错");
			e.printStackTrace();
		}
	}
}
