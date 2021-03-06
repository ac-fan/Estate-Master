package com.fan.wuye.dao;


import com.fan.wuye.pojo.AdminInfo;
import com.fan.wuye.pojo.AdminInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface AdminInfoMapper {
    long countByExample(AdminInfoExample example);

    int deleteByExample(AdminInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    List<AdminInfo> selectByExample(AdminInfoExample example);

    AdminInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record")
                                         AdminInfo record, @Param("example")
                                         AdminInfoExample example);

    int updateByExample(@Param("record")
                                AdminInfo record, @Param("example")
                                AdminInfoExample example);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
}

