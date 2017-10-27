package com.chinasofti.ticket.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.chinasofti.common.py.entity.PyTicketBase;
import com.chinasofti.common.py.entity.PyTicketBaseExample;



public interface PyTicketBaseMapper {
    int countByExample(PyTicketBaseExample example);

    int deleteByExample(PyTicketBaseExample example);

    int deleteByPrimaryKey(String ids);

    int insert(PyTicketBase record);

    int insertSelective(PyTicketBase record);

    List<PyTicketBase> selectByExample(PyTicketBaseExample example);

    PyTicketBase selectByPrimaryKey(String ids);

    int updateByExampleSelective(@Param("record") PyTicketBase record, @Param("example") PyTicketBaseExample example);

    int updateByExample(@Param("record") PyTicketBase record, @Param("example") PyTicketBaseExample example);

    int updateByPrimaryKeySelective(PyTicketBase record);

    int updateByPrimaryKey(PyTicketBase record);
}