package com.chinasofti.springcloud.feign;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chinasofti.common.sp.entity.PyMainGoodsorder;
import com.chinasofti.springcloud.hystrix.OrderFeignClientHystrix;

@FeignClient(name = "py-goodsorderService",fallback=OrderFeignClientHystrix.class)
public interface OrderFeignClient {
	
	/**
	 * id查询
	 * @param ids
	 * @return
	 */
	@RequestMapping("/goodsorder/select/{ids}")
	public PyMainGoodsorder selectByPrimaryKey(@PathVariable("ids") String ids);
	 
	/**
	 * 查询所有
	 * @return
	 */
	@RequestMapping(value="/goodsorder/list", method = RequestMethod.POST)
	public List<PyMainGoodsorder> selectAll(PyMainGoodsorder pyMainGoodsorder);
	
	
	/**
	 * 商品添加
	 * @param pyMainGoodsorder
	 * @return
	 */
	@RequestMapping(value = "/goodsorder/add", method = RequestMethod.POST)
	public int goodsAdd(PyMainGoodsorder pyMainGoodsorder); 

	/**
	 * 通过ID删除
	 * 
	 * @return
	 */
	@RequestMapping(value = "/goodsorder/delete/{ids}")
	public int goodsDeleteById(@PathVariable("ids") String ids);
	
	
	/**
	 * 修改
	 * @param pyMainGoodsorder
	 * @return
	 */
	@RequestMapping(value = "/goodsorder/update", method = RequestMethod.POST)
	public int goodsUpdate(PyMainGoodsorder pyMainGoodsorder);
	
}
