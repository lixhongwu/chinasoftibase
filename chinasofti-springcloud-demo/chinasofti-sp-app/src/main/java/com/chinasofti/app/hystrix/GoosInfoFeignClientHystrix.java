package com.chinasofti.app.hystrix;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.chinasofti.app.api.GoodsInfoFeignClient;
import com.chinasofti.common.sp.entity.SpGoodsinfo;

@Component
public class GoosInfoFeignClientHystrix implements GoodsInfoFeignClient {
	
	@Override
	public List<SpGoodsinfo> selectGoodsByClassId(String ids) {
		return new ArrayList<>();
	}

}
