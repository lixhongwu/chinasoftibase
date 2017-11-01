package com.chinasofti.springcloud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.chinasofti.common.sp.entity.PyMainGoodsorder;
import com.chinasofti.springcloud.feign.OrderFeignClient;


@RequestMapping("/goodsorder")
@RestController
public class GoodsOrderController {
	
	@Autowired
	OrderFeignClient orderFeignClient;
	
	
	/**
	 * 返回订单列表页
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView getView() {
		return  new ModelAndView("/goodsorder/goodsorder");
	}
	
	/**
	 * id查询
	 * @param ids
	 * @return
	 */
	@RequestMapping("/select/{ids}")
	@ResponseBody
	public PyMainGoodsorder selectByPrimaryKey(@PathVariable String ids){
		
		return orderFeignClient.selectByPrimaryKey(ids);
		
	}
	
	/**
	 * 查询所有
	 * @return
	 */
	@RequestMapping(value="/list", method = RequestMethod.POST)
	@ResponseBody
	public List<PyMainGoodsorder> selectAll(PyMainGoodsorder pyMainGoodsorder){
		
		return orderFeignClient.selectAll(pyMainGoodsorder);
	}
	
	
	/**
	 * 商品添加
	 * 
	 * @param pyMainGoodsorder
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public int goodsAdd(PyMainGoodsorder pyMainGoodsorder) {

		return orderFeignClient.goodsAdd(pyMainGoodsorder);
	}

	/**
	 * 通过ID删除
	 * 
	 * @return
	 */
	@RequestMapping(value = "/delete/{ids}")
	public int goodsDeleteById(@PathVariable String ids) {

		return orderFeignClient.goodsDeleteById(ids);

	}
	
	
	/**
	 * 修改
	 * @param pyMainGoodsorder
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public int goodsUpdate(PyMainGoodsorder pyMainGoodsorder) {

		return orderFeignClient.goodsUpdate(pyMainGoodsorder);

	}
	
}
