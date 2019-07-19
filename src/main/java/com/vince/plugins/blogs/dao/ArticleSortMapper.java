package com.vince.plugins.blogs.dao;

import com.vince.plugins.blogs.entity.ArticleSort;
import com.vince.plugins.blogs.entity.ArticleSortExample;
import java.util.List;

public interface ArticleSortMapper {
    int insert(ArticleSort record);

    int insertSelective(ArticleSort record);

    List<ArticleSort> selectByExample(ArticleSortExample example);
}