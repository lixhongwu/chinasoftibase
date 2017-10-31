package com.chinasofti.springcloud.hystrix;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.chinasofti.common.py.entity.PyTicketBase;
import com.chinasofti.springcloud.feign.TicketFeignClient;

@Component
public class TicketFeignClientHystrix implements TicketFeignClient {
	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<PyTicketBase> selectAll() {
		List list = new ArrayList();
		list.add(0,"error");
		return list;
	}

	@Override
	public PyTicketBase selectById(String ids) {
		return new PyTicketBase();
	}

	@Override
	public int deleteById(String ids) {
		return -1;
	}

	@Override
	public int update(PyTicketBase pyTicketBase) {
		return -1;
	}

	@Override
	public int addTicket(PyTicketBase pyTicketBase) {
		return -1;
	}

}
