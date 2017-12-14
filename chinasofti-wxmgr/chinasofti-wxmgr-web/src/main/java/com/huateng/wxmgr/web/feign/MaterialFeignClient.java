package com.huateng.wxmgr.web.feign;

import java.io.File;
import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;
import com.huateng.wxmgr.common.entity.WxMaterial;
import com.huateng.wxmgr.web.hystrix.MaterialFeignClientHystrix;


@FeignClient(name="chinasofti-wxmgr-materialservice",fallback=MaterialFeignClientHystrix.class)
public interface MaterialFeignClient {

	@RequestMapping("/material/findAll")
	public List<WxMaterial> findAll();
	
	@RequestMapping(value="/material/uploadTempMaterial",method=RequestMethod.POST)
	public JSONObject uploadTempMaterial(@RequestParam(value="fileDir") String fileDir); 
	
	@RequestMapping(value="/material/uploadPermanentMaterial",method=RequestMethod.POST)
	public JSONObject uploadPermanentMaterial(@RequestParam(value="fileDir") String fileDir);
	
	@RequestMapping(value="/material/deletePermanentMaterial",method=RequestMethod.POST)
	public JSONObject deletePermanentMaterial(@RequestParam(value="mediaId") String mediaId);
	
	@RequestMapping(value="/material/listPermanentMaterial",method=RequestMethod.POST)
	public JSONObject listPermanentMaterial();
}
