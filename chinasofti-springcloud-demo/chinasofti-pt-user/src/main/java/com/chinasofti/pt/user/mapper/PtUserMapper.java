package com.chinasofti.pt.user.mapper;

import com.chinasofti.pt.user.entity.PtUser;
import com.chinasofti.pt.user.entity.PtUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtUserMapper {
    int countByExample(PtUserExample example);

    int deleteByExample(PtUserExample example);

    int deleteByPrimaryKey(String ids);

    int insert(PtUser record);

    int insertSelective(PtUser record);

    List<PtUser> selectByExampleWithBLOBs(PtUserExample example);

    List<PtUser> selectByExample(PtUserExample example);

    PtUser selectByPrimaryKey(String ids);

    int updateByExampleSelective(@Param("record") PtUser record, @Param("example") PtUserExample example);

    int updateByExampleWithBLOBs(@Param("record") PtUser record, @Param("example") PtUserExample example);

    int updateByExample(@Param("record") PtUser record, @Param("example") PtUserExample example);

    int updateByPrimaryKeySelective(PtUser record);

    int updateByPrimaryKeyWithBLOBs(PtUser record);

    int updateByPrimaryKey(PtUser record);
}