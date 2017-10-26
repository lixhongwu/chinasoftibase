package com.chinasofti.sp.user.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.chinasofti.common.spuser.entity.SpUser;
import com.chinasofti.common.spuser.entity.SpUserExample;
import com.chinasofti.common.spuser.entity.SpUserWithBLOBS;

public interface SpUserMapper {
    int countByExample(SpUserExample example);

    int deleteByExample(SpUserExample example);

    int deleteByPrimaryKey(String ids);

    int insert(SpUserWithBLOBS record);

    int insertSelective(SpUserWithBLOBS record);

    List<SpUserWithBLOBS> selectByExample(SpUserExample example);

    SpUserWithBLOBS selectByPrimaryKey(String ids);

    int updateByExampleSelective(@Param("record") SpUserWithBLOBS record, @Param("example") SpUserExample example);

    int updateByExample(@Param("record") SpUser record, @Param("example") SpUserExample example);

    int updateByPrimaryKeySelective(SpUserWithBLOBS record);

    int updateByPrimaryKey(SpUser record);
}