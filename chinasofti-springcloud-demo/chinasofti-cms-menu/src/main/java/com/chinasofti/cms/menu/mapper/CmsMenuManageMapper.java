package com.chinasofti.cms.menu.mapper;

import com.chinasofti.cms.menu.entity.CmsMenuManage;
import com.chinasofti.cms.menu.entity.CmsMenuManageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsMenuManageMapper {
    int countByExample(CmsMenuManageExample example);

    int deleteByExample(CmsMenuManageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CmsMenuManage record);

    int insertSelective(CmsMenuManage record);

    List<CmsMenuManage> selectByExample(CmsMenuManageExample example);

    CmsMenuManage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CmsMenuManage record, @Param("example") CmsMenuManageExample example);

    int updateByExample(@Param("record") CmsMenuManage record, @Param("example") CmsMenuManageExample example);

    int updateByPrimaryKeySelective(CmsMenuManage record);

    int updateByPrimaryKey(CmsMenuManage record);
}