package com.chinasofti.springcloud.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chinasofti.common.sp.entity.PyMainGoodsorder;
import com.chinasofti.springcloud.hystrix.OrderFeignClientHystrix;

@FeignClient(name = "py-goodsorderservice",fallback=OrderFeignClientHystrix.class)
public interface OrderFeignClient {
	
	/**
	 * id查询
	 * @param ids
	 * @return
	 */
	@RequestMapping("/select/{ids}")
	public PyMainGoodsorder selectByPrimaryKey(@PathVariable String ids);
	
	/**
	 * 查询所有
	 * @return
	 */
	@RequestMapping("/list")
	public List<PyMainGoodsorder> selectAll(PyMainGoodsorder pyMainGoodsorder);
	
	
	/**
	 * 商品添加
	 * @param pyMainGoodsorder
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public int goodsAdd(PyMainGoodsorder pyMainGoodsorder); 

	/**
	 * 通过ID删除
	 * 
	 * @return
	 */
	@RequestMapping(value = "/delete/{ids}")
	public int goodsDeleteById(@PathVariable String ids);
	
	
	/**
	 * 修改
	 * @param pyMainGoodsorder
	 * @return
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public int goodsUpdate(PyMainGoodsorder pyMainGoodsorder);
	
}
