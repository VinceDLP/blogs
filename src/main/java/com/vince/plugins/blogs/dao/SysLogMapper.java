package com.vince.plugins.blogs.dao;

import com.vince.plugins.blogs.entity.SysLog;
import com.vince.plugins.blogs.entity.SysLogExample;
import java.util.List;

public interface SysLogMapper {
    int insert(SysLog record);

    int insertSelective(SysLog record);

    List<SysLog> selectByExample(SysLogExample example);
}