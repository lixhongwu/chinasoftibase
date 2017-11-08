package com.chinasofti.wxmgr.menu.mapper;

import com.huateng.wxmgr.common.entity.WxMenugroup;
import com.huateng.wxmgr.common.entity.WxMenugroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxMenugroupMapper {
    int countByExample(WxMenugroupExample example);

    int deleteByExample(WxMenugroupExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(WxMenugroup record);

    int insertSelective(WxMenugroup record);

    List<WxMenugroup> selectByExample(WxMenugroupExample example);

    WxMenugroup selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") WxMenugroup record, @Param("example") WxMenugroupExample example);

    int updateByExample(@Param("record") WxMenugroup record, @Param("example") WxMenugroupExample example);

    int updateByPrimaryKeySelective(WxMenugroup record);

    int updateByPrimaryKey(WxMenugroup record);
}