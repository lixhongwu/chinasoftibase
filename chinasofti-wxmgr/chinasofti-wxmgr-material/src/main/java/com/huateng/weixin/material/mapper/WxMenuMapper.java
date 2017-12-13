package com.huateng.weixin.material.mapper;

import com.huateng.wxmgr.common.entity.WxMenu;
import com.huateng.wxmgr.common.entity.WxMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxMenuMapper {
    int countByExample(WxMenuExample example);

    int deleteByExample(WxMenuExample example);

    int deleteByPrimaryKey(String ids);

    int insert(WxMenu record);

    int insertSelective(WxMenu record);

    List<WxMenu> selectByExample(WxMenuExample example);

    WxMenu selectByPrimaryKey(String ids);

    int updateByExampleSelective(@Param("record") WxMenu record, @Param("example") WxMenuExample example);

    int updateByExample(@Param("record") WxMenu record, @Param("example") WxMenuExample example);

    int updateByPrimaryKeySelective(WxMenu record);

    int updateByPrimaryKey(WxMenu record);
}