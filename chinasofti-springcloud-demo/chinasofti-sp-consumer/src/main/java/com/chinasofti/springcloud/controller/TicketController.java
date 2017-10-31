package com.chinasofti.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.chinasofti.common.py.entity.PyTicketBase;
import com.chinasofti.springcloud.feign.TicketFeignClient;

@RestController
@RequestMapping("ticket")
public class TicketController {

	@Autowired
	private TicketFeignClient ticketFeignClient;

	/**
	 * 跳转到卡券页面
	 * 
	 * @return
	 */
	@RequestMapping("/index")
	public ModelAndView getview() {
		return new ModelAndView("/ticket/ticket");
	}

	// 查询全部
	@RequestMapping("/selectAll")
	public List<PyTicketBase> selectAll() {
		return ticketFeignClient.selectAll();
	}

	// 根据id查询
	@RequestMapping("/selectById/{ids}")
	public PyTicketBase selectById(@PathVariable String ids) {
		return ticketFeignClient.selectById(ids);
	}

	// 添加
	@RequestMapping("add")
	public int add(PyTicketBase pyTicketBase) {
		return ticketFeignClient.addTicket(pyTicketBase);
	}

	// 根据id删除
	@RequestMapping("deleteById/{ids}")
	public int deleteById(@PathVariable String ids) {
		return ticketFeignClient.deleteById(ids);
	}

	// 修改
	@RequestMapping("update")
	public int update(PyTicketBase pyTicketBase) {
		return ticketFeignClient.update(pyTicketBase);
	}
}
