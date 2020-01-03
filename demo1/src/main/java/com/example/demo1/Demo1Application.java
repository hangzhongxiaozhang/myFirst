package com.example.demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//这个是springboot的入口，主函数
@SpringBootApplication
//SpringBoot不能自动扫描mapper
@MapperScan("com.example.demo1.mapper")
public class Demo1Application {
    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }
}
