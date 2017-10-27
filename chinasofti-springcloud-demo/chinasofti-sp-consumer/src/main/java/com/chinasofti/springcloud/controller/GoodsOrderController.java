package com.chinasofti.springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.common.sp.entity.PyMainGoodsorder;
import com.chinasofti.common.utils.JsonUtils;


@RequestMapping("/goodsorder")
@RestController
public class GoodsOrderController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${user.goodsOrderServicepath}")
	private String goodsOrderServicepath;
	
	/**
	 * id查询
	 * @param ids
	 * @return
	 */
	@RequestMapping("/select/{ids}")
	@ResponseBody
	public PyMainGoodsorder selectByPrimaryKey(@PathVariable String ids){
		
		return restTemplate.getForObject(this.goodsOrderServicepath + "goodsorder/select/" + ids, PyMainGoodsorder.class);
		
	}
	
	/**
	 * 查询所有
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public ResponseEntity<String> selectAll(PyMainGoodsorder pyMainGoodsorder){
		
		HttpEntity<LinkedMultiValueMap<String, String>> he = transmitObject(pyMainGoodsorder);

		ResponseEntity<String> response = restTemplate.postForEntity(this.goodsOrderServicepath + "goodsorder/list", he,
				String.class);

		return response;
	}
	
	
	/**
	 * 返回订单列表页
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView getView() {
		return  new ModelAndView("/goodsorder/goodsorder");
	}
	
	/**
	 * 商品添加
	 * 
	 * @param pyMainGoodsorder
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<String> goodsAdd(PyMainGoodsorder pyMainGoodsorder) {

		HttpEntity<LinkedMultiValueMap<String, String>> he = transmitObject(pyMainGoodsorder);

		ResponseEntity<String> response = restTemplate.postForEntity(this.goodsOrderServicepath + "goodsorder/add", he,
				String.class);

		return response;
	}

	/**
	 * 通过ID删除
	 * 
	 * @return
	 */
	@RequestMapping(value = "/delete/{ids}")
	public String goodsDeleteById(@PathVariable String ids) {

		return this.restTemplate.getForObject(this.goodsOrderServicepath + "goodsorder/delete/" + ids, String.class);

	}
	
	
	/**
	 * 修改
	 * @param pyMainGoodsorder
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ResponseEntity<String> goodsUpdate(PyMainGoodsorder pyMainGoodsorder) {

		HttpEntity<LinkedMultiValueMap<String, String>> he = transmitObject(pyMainGoodsorder);

		ResponseEntity<String> response = restTemplate.postForEntity(this.goodsOrderServicepath + "goodsorder/update", he,
				String.class);

		return response;

	}
	
	/**
	 * 对象转集合
	 * @param object
	 * @return
	 */
	public static HttpEntity<LinkedMultiValueMap<String, String>> transmitObject(Object object){
		
		LinkedMultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();

		String objectToString = JsonUtils.objectToGsonString(object);

		map.add("pyMainGoodsorder", objectToString);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

		HttpEntity<LinkedMultiValueMap<String, String>> he = new HttpEntity<LinkedMultiValueMap<String, String>>(map,
				headers);

		return he;
		
	}
	
	
}
