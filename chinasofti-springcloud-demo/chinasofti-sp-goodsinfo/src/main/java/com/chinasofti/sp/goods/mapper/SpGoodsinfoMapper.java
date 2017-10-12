package com.chinasofti.sp.goods.mapper;

import com.chinasofti.sp.goods.entity.SpGoodsinfo;
import com.chinasofti.sp.goods.entity.SpGoodsinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpGoodsinfoMapper {
    int countByExample(SpGoodsinfoExample example);

    int deleteByExample(SpGoodsinfoExample example);

    int deleteByPrimaryKey(String ids);

    int insert(SpGoodsinfo record);

    int insertSelective(SpGoodsinfo record);

    List<SpGoodsinfo> selectByExampleWithBLOBs(SpGoodsinfoExample example);

    List<SpGoodsinfo> selectByExample(SpGoodsinfoExample example);
    
    List<SpGoodsinfo> findAll();

    /**
     * 通过id查询
     * @param ids
     * @return
     */
    SpGoodsinfo selectByPrimaryKey(String ids);

    int updateByExampleSelective(@Param("record") SpGoodsinfo record, @Param("example") SpGoodsinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") SpGoodsinfo record, @Param("example") SpGoodsinfoExample example);

    int updateByExample(@Param("record") SpGoodsinfo record, @Param("example") SpGoodsinfoExample example);

    int updateByPrimaryKeySelective(SpGoodsinfo record);

    int updateByPrimaryKeyWithBLOBs(SpGoodsinfo record);

    int updateByPrimaryKey(SpGoodsinfo record);
}