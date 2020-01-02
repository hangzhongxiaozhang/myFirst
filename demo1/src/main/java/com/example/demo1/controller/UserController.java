package com.example.demo1.controller;

import com.example.demo1.model.UserDo;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //@ResponseBody ＋ @Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/selectAll")
    public List<UserDo> selectAll(){
        return userService.selectAll();
    }
}
