package com.vince.plugins.blogs.dao;

import com.vince.plugins.blogs.entity.SortInfo;
import com.vince.plugins.blogs.entity.SortInfoExample;
import java.util.List;

public interface SortInfoMapper {
    int insert(SortInfo record);

    int insertSelective(SortInfo record);

    List<SortInfo> selectByExample(SortInfoExample example);
}