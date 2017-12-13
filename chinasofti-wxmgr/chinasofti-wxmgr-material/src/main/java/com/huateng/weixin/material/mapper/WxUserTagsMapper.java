package com.huateng.weixin.material.mapper;

import com.huateng.wxmgr.common.entity.WxUserTags;
import com.huateng.wxmgr.common.entity.WxUserTagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxUserTagsMapper {
    int countByExample(WxUserTagsExample example);

    int deleteByExample(WxUserTagsExample example);

    int deleteByPrimaryKey(Integer ids);

    int insert(WxUserTags record);

    int insertSelective(WxUserTags record);

    List<WxUserTags> selectByExample(WxUserTagsExample example);

    WxUserTags selectByPrimaryKey(Integer ids);

    int updateByExampleSelective(@Param("record") WxUserTags record, @Param("example") WxUserTagsExample example);

    int updateByExample(@Param("record") WxUserTags record, @Param("example") WxUserTagsExample example);

    int updateByPrimaryKeySelective(WxUserTags record);

    int updateByPrimaryKey(WxUserTags record);
}