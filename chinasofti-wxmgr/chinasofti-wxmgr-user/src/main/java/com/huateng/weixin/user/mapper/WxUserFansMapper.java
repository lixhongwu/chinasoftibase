package com.huateng.weixin.user.mapper;

import com.huateng.wxmgr.common.entity.WxUserFans;
import com.huateng.wxmgr.common.entity.WxUserFansExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxUserFansMapper {
    int countByExample(WxUserFansExample example);

    int deleteByExample(WxUserFansExample example);

    int deleteByPrimaryKey(String ids);

    int insert(WxUserFans record);

    int insertSelective(WxUserFans record);

    List<WxUserFans> selectByExample(WxUserFansExample example);

    WxUserFans selectByPrimaryKey(String ids);

    int updateByExampleSelective(@Param("record") WxUserFans record, @Param("example") WxUserFansExample example);

    int updateByExample(@Param("record") WxUserFans record, @Param("example") WxUserFansExample example);

    int updateByPrimaryKeySelective(WxUserFans record);

    int updateByPrimaryKey(WxUserFans record);
}