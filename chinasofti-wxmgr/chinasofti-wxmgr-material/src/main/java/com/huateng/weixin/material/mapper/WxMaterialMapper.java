package com.huateng.weixin.material.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huateng.wxmgr.common.entity.WxMaterial;
import com.huateng.wxmgr.common.entity.WxMaterialExample;

public interface WxMaterialMapper {
    int countByExample(WxMaterialExample example);

    int deleteByExample(WxMaterialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxMaterial record);

    int insertSelective(WxMaterial record);

    List<WxMaterial> selectByExample(WxMaterialExample example);

    WxMaterial selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxMaterial record, @Param("example") WxMaterialExample example);

    int updateByExample(@Param("record") WxMaterial record, @Param("example") WxMaterialExample example);

    int updateByPrimaryKeySelective(WxMaterial record);

    int updateByPrimaryKey(WxMaterial record);
}