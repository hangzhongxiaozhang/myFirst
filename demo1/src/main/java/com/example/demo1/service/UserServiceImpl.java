package com.example.demo1.service;

import com.example.demo1.mapper.UserMapper;
import com.example.demo1.model.UserDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserDo> selectAll() {
        return userMapper.findAll();
    }
}
