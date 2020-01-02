package com.example.demo1.service;

import com.example.demo1.model.UserDo;

import java.util.List;

public interface UserService {
    List<UserDo> selectAll();
}
