package com.chinasofti.py.goodsorder.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> f9d932afdbe70a26948e932dfba405eeb244734e
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.py.goodsorder.entity.PyMainGoodsorder;
import com.chinasofti.py.goodsorder.service.PyMainGoodsorderService;
<<<<<<< HEAD

@RequestMapping("goodsorder")
=======
import com.google.gson.Gson;

@RequestMapping("/goodsorder")
>>>>>>> f9d932afdbe70a26948e932dfba405eeb244734e
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
	
<<<<<<< HEAD
=======
	/**
	 * 查询所有
	 * @return
	 */
	@RequestMapping("/list")
	@ResponseBody
	public List<PyMainGoodsorder> selectAll(){
		
		return pyGoodsService.selectAll();
	}
	
	/**
	 * 添加订单
	 * @param pyMainGoodsorder
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String goodsAdd(String pyMainGoodsorder) {

		Gson gson = new Gson();
		PyMainGoodsorder goodsorder = gson.fromJson(pyMainGoodsorder, PyMainGoodsorder.class);

		pyGoodsService.insertSelective(goodsorder);

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
	public String updateByPrimaryKey(String pyMainGoodsorder) {

		Gson gson = new Gson();
		PyMainGoodsorder goodsorder = gson.fromJson(pyMainGoodsorder, PyMainGoodsorder.class);

		pyGoodsService.updateByPrimaryKey(goodsorder);

		return "update";
	}
	
>>>>>>> f9d932afdbe70a26948e932dfba405eeb244734e
	
}
