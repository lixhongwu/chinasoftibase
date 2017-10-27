package com.chinasofti.sp.user.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasofti.common.sp.entity.SpUser;
import com.chinasofti.common.sp.entity.SpUserExample;

public interface SpUserMapper {
    int countByExample(SpUserExample example);

    int deleteByExample(SpUserExample example);

    int deleteByPrimaryKey(String ids);

    int insert(SpUser record);

    int insertSelective(SpUser record);

    List<SpUserExample> selectByExample(SpUserExample example);

    SpUser selectByPrimaryKey(String ids);

    int updateByExampleSelective(@Param("record") SpUser record, @Param("example") SpUserExample example);

    int updateByExample(@Param("record") SpUser record, @Param("example") SpUserExample example);

    int updateByPrimaryKeySelective(SpUser record);

    int updateByPrimaryKey(SpUser record);
}