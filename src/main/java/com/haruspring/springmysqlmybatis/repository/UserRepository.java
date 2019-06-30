package com.haruspring.springmysqlmybatis.repository;

import com.haruspring.springmysqlmybatis.mapper.UserMapper;
import com.haruspring.springmysqlmybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

  @Autowired private UserMapper mapper;

  public User selectUser(int id) {
    return mapper.selectUser(id);
  }
}
