package com.haruspring.springmysqlmybatis.service;

import com.haruspring.springmysqlmybatis.model.User;
import com.haruspring.springmysqlmybatis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User getUser(int id) {
        return repository.selectUser(id);
    }
}
