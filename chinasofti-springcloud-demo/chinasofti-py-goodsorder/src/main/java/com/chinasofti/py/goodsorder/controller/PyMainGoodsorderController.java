package com.chinasofti.py.goodsorder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.common.sp.entity.PyMainGoodsorder;
import com.chinasofti.common.sp.entity.PyMainGoodsorderExample;
import com.chinasofti.common.sp.entity.PyMainGoodsorderExample.Criteria;
import com.chinasofti.py.goodsorder.service.PyMainGoodsorderService;
import com.google.gson.Gson;


@RequestMapping("/goodsorder")
@RestController
public class PyMainGoodsorderController {
	
	@Autowired
	PyMainGoodsorderService pyGoodsService;
	
	/**
	 * id查询
	 * @param ids
	 * @return
	 */
	@RequestMapping("/select/{ids}")
	@ResponseBody
	public PyMainGoodsorder selectByPrimaryKey(@PathVariable String ids){
		
		return pyGoodsService.selectByPrimaryKey(ids);
		
	}
	
	/**
	 * 条件查询
	 * @return
	 */
	@RequestMapping(value="/list", method = RequestMethod.POST)
	@ResponseBody
	public List<PyMainGoodsorder> selectAll(PyMainGoodsorder pyMainGoodsorder){
				
		PyMainGoodsorderExample example = new PyMainGoodsorderExample();
		
		if (pyMainGoodsorder != null) {
			Criteria criteria = example.createCriteria();
			
			if ((pyMainGoodsorder.getBigorderId()) != null && !pyMainGoodsorder.getBigorderId().equals("")) {
				criteria.andBigorderIdLike("%" + pyMainGoodsorder.getBigorderId() + "%");
			}
			
			if ((pyMainGoodsorder.getVendorIds()) != null && !pyMainGoodsorder.getVendorIds().equals("")) {
				criteria.andVendorIdsLike("%" + pyMainGoodsorder.getVendorIds() + "%");
			}
			
			return pyGoodsService.findAll(example);
		}
		

		return pyGoodsService.findAll(example);
	}
	
	/**
	 * 添加订单
	 * @param pyMainGoodsorder
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String goodsAdd(PyMainGoodsorder pyMainGoodsorder) {

		pyGoodsService.insertSelective(pyMainGoodsorder);

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

		pyGoodsService.deleteByPrimaryKey(ids);

		return "delete";

	}

	/**
	 * 修改订单
	 * 
	 * @param pyMainGoodsorder
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateByPrimaryKey(PyMainGoodsorder pyMainGoodsorder) {

		pyGoodsService.updateByPrimaryKey(pyMainGoodsorder);

		return "update";
	}
	

}
