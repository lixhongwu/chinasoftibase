package com.chinasofti.springcloud.hystrix;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.chinasofti.common.sp.entity.PyMainGoodsorder;
import com.chinasofti.springcloud.feign.OrderFeignClient;

@Component
public class OrderFeignClientHystrix implements OrderFeignClient {

	@Override
	public PyMainGoodsorder selectByPrimaryKey(String ids) {
		return new PyMainGoodsorder();
	}

	@Override
	public List<PyMainGoodsorder> selectAll(PyMainGoodsorder pyMainGoodsorder) {
		return new ArrayList<>();
	}

	@Override
	public int goodsAdd(PyMainGoodsorder pyMainGoodsorder) {
		return -1;
	}

	@Override
	public int goodsDeleteById(String ids) {
		return -1;
	}

	@Override
	public int goodsUpdate(PyMainGoodsorder pyMainGoodsorder) {
		return -1;
	}
	
	

}
