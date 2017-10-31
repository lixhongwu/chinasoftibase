package com.chinasofti.app.hystrix;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.chinasofti.app.api.GoodsClassFeignClient;
import com.chinasofti.common.sp.entity.SpClientGoodsClass;

@Component
public class GoosClassFeignClientHystrix implements GoodsClassFeignClient{

	@Override
	public List<SpClientGoodsClass> selectGoodsClassByPid(String ids) {
		return new ArrayList<>();
	}

}
