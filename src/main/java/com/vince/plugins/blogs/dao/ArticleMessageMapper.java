package com.vince.plugins.blogs.dao;

import com.vince.plugins.blogs.entity.ArticleMessage;
import com.vince.plugins.blogs.entity.ArticleMessageExample;
import java.util.List;

public interface ArticleMessageMapper {
    int insert(ArticleMessage record);

    int insertSelective(ArticleMessage record);

    List<ArticleMessage> selectByExample(ArticleMessageExample example);
}