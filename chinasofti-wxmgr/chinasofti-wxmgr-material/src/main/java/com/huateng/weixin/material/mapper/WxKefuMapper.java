package com.huateng.weixin.material.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.huateng.wxmgr.common.entity.WxKefu;
import com.huateng.wxmgr.common.entity.WxKefuExample;

public interface WxKefuMapper {
    int countByExample(WxKefuExample example);

    int deleteByExample(WxKefuExample example);

    int insert(WxKefu record);

    int insertSelective(WxKefu record);

    List<WxKefu> selectByExample(WxKefuExample example);

    int updateByExampleSelective(@Param("record") WxKefu record, @Param("example") WxKefuExample example);

    int updateByExample(@Param("record") WxKefu record, @Param("example") WxKefuExample example);
}