package com.huateng.wxmgr.web.hystrix;

import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.huateng.wxmgr.web.feign.MaterialFeignClient;
import com.huateng.wxmgr.web.model.WxMaterial;

@Component
public class MaterialFeignClientHystrix implements MaterialFeignClient {

	@Override
	public List<WxMaterial> findAll() {
		return null;
	}
	@Override
	public JSONObject uploadTempMaterial(String fileDir) {
		return null;
	}
	@Override
	public JSONObject uploadPermanentMaterial(String fileDir) {
		return null;
	}
	@Override
	public JSONObject deletePermanentMaterial(String mediaId) {
		return null;
	}
	@Override
	public JSONObject listPermanentMaterial() {
		return null;
	}
	

}
