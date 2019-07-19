package com.vince.plugins.blogs.dao;

import com.vince.plugins.blogs.entity.ArticleContent;
import com.vince.plugins.blogs.entity.ArticleContentExample;
import java.util.List;

public interface ArticleContentMapper {
    int insert(ArticleContent record);

    int insertSelective(ArticleContent record);

    List<ArticleContent> selectByExampleWithBLOBs(ArticleContentExample example);

    List<ArticleContent> selectByExample(ArticleContentExample example);
}