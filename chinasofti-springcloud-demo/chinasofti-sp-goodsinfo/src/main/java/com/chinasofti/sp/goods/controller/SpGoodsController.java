package com.chinasofti.sp.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.sp.goods.entity.SpGoodsinfo;
import com.chinasofti.sp.goods.entity.SpGoodsinfoExample;
import com.chinasofti.sp.goods.entity.SpGoodsinfoExample.Criteria;
import com.chinasofti.sp.goods.service.SpGoodsService;
import com.google.gson.Gson;

@RequestMapping("goods")
@RestController
public class SpGoodsController {

	@Autowired
	SpGoodsService spGoodsService;

	/**
	 * id查询
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping("/select/{ids}")
	@ResponseBody
	public SpGoodsinfo selectByPrimaryKey(@PathVariable String ids) {

		return spGoodsService.selectByPrimaryKey(ids);

	}

	/**
	 * 全部查询
	 * 
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public List<SpGoodsinfo> findAll(String spGoodsinfo) {

		String compare = "";

		Gson gson = new Gson();
		SpGoodsinfo goods = gson.fromJson(spGoodsinfo, SpGoodsinfo.class);

		SpGoodsinfoExample example = new SpGoodsinfoExample();
		Criteria criteria = example.createCriteria();

		if ((goods.getGoodsType()) != null && !compare.equals(goods.getGoodsType())) {
			criteria.andGoodsTypeEqualTo(goods.getGoodsType());
			return spGoodsService.findAll(example);
		}

		return spGoodsService.findAll(example);

	}

	/**
	 * 商品添加
	 * 
	 * @param spGoodsinfo
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String goodsAdd(String spGoodsinfo) {

		Gson gson = new Gson();
		SpGoodsinfo goods = gson.fromJson(spGoodsinfo, SpGoodsinfo.class);

		spGoodsService.insertSelective(goods);

		return "add";

	}

	/**
	 * 通过ID删除
	 * 
	 * @param ids
	 * @return
	 */
	@RequestMapping(value = "/delete/{ids}")
	public String deleteByPrimaryKey(@PathVariable String ids) {

		spGoodsService.deleteByPrimaryKey(ids);

		return "delete";

	}

	/**
	 * 修改
	 * 
	 * @param spGoodsinfo
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateByPrimaryKey(String spGoodsinfo) {

		Gson gson = new Gson();
		SpGoodsinfo goods = gson.fromJson(spGoodsinfo, SpGoodsinfo.class);

		spGoodsService.updateByPrimaryKey(goods);

		return "update";
	}
	
	/**
	 * 根据分类id查询商品
	 * @author kanmeng
	 * @param ids
	 * @return List<SpGoodsinfo>
	 */
	@GetMapping("/findByClassId/{ids}")
	public List<SpGoodsinfo> findByClassId(@PathVariable String ids){
		return spGoodsService.findByClassIds(ids);
	}

}
