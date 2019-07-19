package com.vince.plugins.blogs.dao;

import com.vince.plugins.blogs.entity.ArticleInfo;
import com.vince.plugins.blogs.entity.ArticleInfoExample;
import java.util.List;

public interface ArticleInfoMapper {
    int insert(ArticleInfo record);

    int insertSelective(ArticleInfo record);

    List<ArticleInfo> selectByExample(ArticleInfoExample example);
}