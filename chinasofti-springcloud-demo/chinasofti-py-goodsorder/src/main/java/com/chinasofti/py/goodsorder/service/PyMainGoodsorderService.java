package com.chinasofti.py.goodsorder.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.chinasofti.py.goodsorder.entity.PyMainGoodsorder;
import com.chinasofti.py.goodsorder.entity.PyMainGoodsorderExample;
import com.chinasofti.py.goodsorder.mapper.PyMainGoodsorderMapper;


@Service
public class PyMainGoodsorderService {
	
	@Autowired
	PyMainGoodsorderMapper pyMainGoodsorderMapper;
	/**
	 * 通过id查询
	 * @param ids
	 * @return
	 */
	public PyMainGoodsorder selectByPrimaryKey(String ids){
		
		return pyMainGoodsorderMapper.selectByPrimaryKey(ids);
		
	}
	

	/**
	 * 查询所有
	 * @param example
	 * @return
	 */
	public List<PyMainGoodsorder> selectAll(){
		PyMainGoodsorderExample example = new PyMainGoodsorderExample();
//		example.setOrderByClause("ids ASC");
		 if (StringUtils.isEmpty(example.getOrderByClause())) {
	            example.setOrderByClause("ids ASC");
	        }
		return pyMainGoodsorderMapper.selectByExample(example);
	}
	
	/**
	 * 添加插入(过滤空字段)
	 * @param pyMainGoodsorder
	 */
	public void insertSelective(PyMainGoodsorder pyMainGoodsorder) {
		pyMainGoodsorderMapper.insertSelective(pyMainGoodsorder);
	}
	
	/**
	 * ID删除
	 * @param ids
	 */
	public void deleteByPrimaryKey(String ids) {
		pyMainGoodsorderMapper.deleteByPrimaryKey(ids);
	}

	/**
	 * 修改
	 * @param pyMainGoodsorder
	 */
	public void updateByPrimaryKey(PyMainGoodsorder pyMainGoodsorder) {
		pyMainGoodsorderMapper.updateByPrimaryKey(pyMainGoodsorder);
	}
	
}
