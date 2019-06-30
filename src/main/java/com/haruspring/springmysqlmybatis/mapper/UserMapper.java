package com.haruspring.springmysqlmybatis.mapper;

import com.haruspring.springmysqlmybatis.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    public User selectUser(@Param("id") int id);
}
