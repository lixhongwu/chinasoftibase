package com.chinasofti.ticket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.common.py.entity.PyTicketBase;
import com.chinasofti.common.py.entity.PyTicketBaseExample;
import com.chinasofti.ticket.mapper.PyTicketBaseMapper;

@Service
public class TicketService {
	
	@Autowired
	PyTicketBaseMapper pyTicketBaseMapper;
	

	/**
	 * 通过id查询
	 * @param ids
	 * @return
	 */
	public PyTicketBase selectByPrimaryKey(String ids) {
		return pyTicketBaseMapper.selectByPrimaryKey(ids);
	}

	/**
	 * 全部查询
	 * @return
	 */
	public List<PyTicketBase> findAll() {
		PyTicketBaseExample pyTicketBaseExample = new PyTicketBaseExample();
		pyTicketBaseExample.setOrderByClause("ids ASC");
		pyTicketBaseMapper.selectByExample(pyTicketBaseExample);
		return pyTicketBaseMapper.selectByExample(pyTicketBaseExample);
	}

	/**
	 * 插入数据
	 * @param pyTicketBase
	 * @return
	 */
	public int insertSelective(PyTicketBase pyTicketBase) {
		return pyTicketBaseMapper.insertSelective(pyTicketBase);
	}

	/**
	 * 通过ID删除
	 * @param ids
	 */
	public int deleteByPrimaryKey(String ids) {
		return pyTicketBaseMapper.deleteByPrimaryKey(ids);
	}

	/**
	 * 修改
	 * @param spGoodsinfo
	 */
	public int updateByPrimaryKey(PyTicketBase pyTicketBase) {
		return pyTicketBaseMapper.updateByPrimaryKey(pyTicketBase);
	}
	
}
