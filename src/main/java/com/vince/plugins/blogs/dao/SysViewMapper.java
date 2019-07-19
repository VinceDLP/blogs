package com.vince.plugins.blogs.dao;

import com.vince.plugins.blogs.entity.SysView;
import com.vince.plugins.blogs.entity.SysViewExample;
import java.util.List;

public interface SysViewMapper {
    int insert(SysView record);

    int insertSelective(SysView record);

    List<SysView> selectByExample(SysViewExample example);
}