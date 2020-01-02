package com.example.demo1.mapper;

import com.example.demo1.model.UserDo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface UserMapper {
    List<UserDo> findAll();
}
