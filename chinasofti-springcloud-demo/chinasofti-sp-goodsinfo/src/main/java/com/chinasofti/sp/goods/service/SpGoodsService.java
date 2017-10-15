package com.chinasofti.sp.goods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.sp.goods.entity.SpGoodsinfo;
import com.chinasofti.sp.goods.entity.SpGoodsinfoExample;
import com.chinasofti.sp.goods.mapper.SpGoodsinfoMapper;
import com.chinasofti.sp.goods.utils.PageHelperUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class SpGoodsService {

	@Autowired
	SpGoodsinfoMapper spGoodsinfoMapper;

	public PageHelperUtil selectByExample(Integer page,Integer rows) {
		
		//设置分页信息
		PageHelper.startPage(page, rows);

		SpGoodsinfoExample example = new SpGoodsinfoExample();

		List<SpGoodsinfo> goodsList = spGoodsinfoMapper.selectByExample(example);
		//获取分页查询的数据
		PageInfo<SpGoodsinfo> pageInfo = new PageInfo<SpGoodsinfo>(goodsList);
		//封装结果对象，并返回
		PageHelperUtil pageHelperUtil = new PageHelperUtil();

		pageHelperUtil.setRows(goodsList);
		pageHelperUtil.setTotal(pageInfo.getTotal());

		return pageHelperUtil;

	}

	/**
	 * 通过id查询
	 * 
	 * @param ids
	 * @return
	 */
	public SpGoodsinfo selectByPrimaryKey(String ids) {

		return spGoodsinfoMapper.selectByPrimaryKey(ids);

	}

	/**
	 * 全部查询
	 * 
	 * @return
	 */
	public List<SpGoodsinfo> findAll(SpGoodsinfoExample example) {
		return spGoodsinfoMapper.selectByExample(example);
	}

	/**
	 * 添加插入(过滤空字段)
	 * 
	 * @param spGoodsinfo
	 */
	public void insertSelective(SpGoodsinfo spGoodsinfo) {
		spGoodsinfoMapper.insertSelective(spGoodsinfo);
	}

	/**
	 * ID删除
	 * 
	 * @param ids
	 */
	public void deleteByPrimaryKey(String ids) {
		spGoodsinfoMapper.deleteByPrimaryKey(ids);
	}

	/**
	 * 修改
	 * 
	 * @param spGoodsinfo
	 */
	public void updateByPrimaryKey(SpGoodsinfo spGoodsinfo) {
		spGoodsinfoMapper.updateByPrimaryKey(spGoodsinfo);
	}
}
