package com.chinasofti.sp.goods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasofti.sp.goods.entity.SpParameterManage;
import com.chinasofti.sp.goods.mapper.SpParameterManageMapper;

@Service
public class SpParamenterService {

	@Autowired
	SpParameterManageMapper spParameterManageMapper;

	/**
	 * 展示参数管理
	 * 
	 * @return
	 */
	public List<SpParameterManage> selectParamenter() {
		return spParameterManageMapper.selectByExample(null);
	}

	/**
	 * 根据id查看对应的参数配置
	 * 
	 * @param ids
	 * @return
	 */
	public SpParameterManage queryByID(int ids) {
		return spParameterManageMapper.selectByPrimaryKey(ids);
	}

	/**
	 * 删除一条数据
	 * @param ids
	 */
	public void deleteParam(int ids) {
		spParameterManageMapper.deleteByPrimaryKey(ids);
	}
	/**
	 * 修改一条数据
	 * @param record
	 */
	public void updateParam(SpParameterManage record) {
		spParameterManageMapper.updateByPrimaryKey(record);
	}
	/**
	 * 插入一条数据
	 * @param record
	 */
	public void insertParam(SpParameterManage record) {
		spParameterManageMapper.insert(record);
	}
}
