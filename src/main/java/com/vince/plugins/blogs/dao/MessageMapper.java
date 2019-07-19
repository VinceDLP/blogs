package com.vince.plugins.blogs.dao;

import com.vince.plugins.blogs.entity.Message;
import com.vince.plugins.blogs.entity.MessageExample;
import java.util.List;

public interface MessageMapper {
    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);
}