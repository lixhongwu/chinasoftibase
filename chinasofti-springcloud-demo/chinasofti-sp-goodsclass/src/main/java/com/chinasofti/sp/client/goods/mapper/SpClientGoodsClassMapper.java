package com.chinasofti.sp.client.goods.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasofti.sp.client.goods.entity.SpClientGoodsClass;
import com.chinasofti.sp.client.goods.entity.SpClientGoodsClassExample;

public interface SpClientGoodsClassMapper {
    int countByExample(SpClientGoodsClassExample example);

    int deleteByExample(SpClientGoodsClassExample example);

    int deleteByPrimaryKey(String ids);

    int insert(SpClientGoodsClass record);

    int insertSelective(SpClientGoodsClass record);

    List<SpClientGoodsClass> selectByExample(SpClientGoodsClassExample example);

    SpClientGoodsClass selectByPrimaryKey(String ids);

    int updateByExampleSelective(@Param("record") SpClientGoodsClass record, @Param("example") SpClientGoodsClassExample example);

    int updateByExample(@Param("record") SpClientGoodsClass record, @Param("example") SpClientGoodsClassExample example);

    int updateByPrimaryKeySelective(SpClientGoodsClass record);

    int updateByPrimaryKey(SpClientGoodsClass record);
}