package com.chinasofti.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.ticket.entity.PyTicketBase;
import com.chinasofti.ticket.service.TicketService;

@RestController
@RequestMapping("ticket")
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	// 查询全部
	@RequestMapping("/selectAll")
	public List<PyTicketBase> selectAll() {
		return ticketService.findAll();
	}

	// 根据id查询
	@RequestMapping("/selectById/{ids}")
	public PyTicketBase selectById(@PathVariable String ids) {
		return ticketService.selectByPrimaryKey(ids);
	}

	// 根据id删除
	@RequestMapping("deleteById/{ids}")
	public int deleteById(@PathVariable String ids) {
		return ticketService.deleteByPrimaryKey(ids);
	}
	
	//添加
	@RequestMapping("addTicket")
	public int addTicket(PyTicketBase pyTicketBase){
		return ticketService.insertSelective(pyTicketBase);
	}
	

	// 修改
	@RequestMapping("update")
	public int update(PyTicketBase pyTicketBase) {
		return ticketService.updateByPrimaryKey(pyTicketBase);
	}
}
