package com.chinasofti.sp.goodssku.mapper;

import com.chinasofti.sp.goodssku.entity.SpGoodsSku;
import com.chinasofti.sp.goodssku.entity.SpGoodsSkuExample;
import com.chinasofti.sp.goodssku.entity.SpGoodsSkuWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpGoodsSkuMapper {
    int countByExample(SpGoodsSkuExample example);

    int deleteByExample(SpGoodsSkuExample example);

    int deleteByPrimaryKey(String ids);

    int insert(SpGoodsSkuWithBLOBs record);

    int insertSelective(SpGoodsSkuWithBLOBs record);

    List<SpGoodsSkuWithBLOBs> selectByExampleWithBLOBs(SpGoodsSkuExample example);

    List<SpGoodsSku> selectByExample(SpGoodsSkuExample example);

    SpGoodsSkuWithBLOBs selectByPrimaryKey(String ids);

    int updateByExampleSelective(@Param("record") SpGoodsSkuWithBLOBs record, @Param("example") SpGoodsSkuExample example);

    int updateByExampleWithBLOBs(@Param("record") SpGoodsSkuWithBLOBs record, @Param("example") SpGoodsSkuExample example);

    int updateByExample(@Param("record") SpGoodsSku record, @Param("example") SpGoodsSkuExample example);

    int updateByPrimaryKeySelective(SpGoodsSkuWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SpGoodsSkuWithBLOBs record);

    int updateByPrimaryKey(SpGoodsSku record);
}