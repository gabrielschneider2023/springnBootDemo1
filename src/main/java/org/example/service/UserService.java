package org.example.service;

import org.example.entity.User;
import org.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public User getByUserNameAndPassword(User user) {
        return userMapper.getByUserNameAndPassword(user);
    }
}
