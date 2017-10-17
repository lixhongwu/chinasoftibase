package com.chinasofti.sp.goods.mapper;

import com.chinasofti.sp.goods.entity.SpParameterManage;
import com.chinasofti.sp.goods.entity.SpParameterManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpParameterManageMapper {
    int countByExample(SpParameterManageExample example);

    int deleteByExample(SpParameterManageExample example);

    int deleteByPrimaryKey(Integer ids);

    int insert(SpParameterManage record);

    int insertSelective(SpParameterManage record);

    List<SpParameterManage> selectByExample(SpParameterManageExample example);

    SpParameterManage selectByPrimaryKey(Integer ids);

    int updateByExampleSelective(@Param("record") SpParameterManage record, @Param("example") SpParameterManageExample example);

    int updateByExample(@Param("record") SpParameterManage record, @Param("example") SpParameterManageExample example);

    int updateByPrimaryKeySelective(SpParameterManage record);

    int updateByPrimaryKey(SpParameterManage record);
}