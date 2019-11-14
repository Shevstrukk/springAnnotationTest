package com.github.shevstrukk.example.injectList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {

    @Bean("userDao")
    @Order(1)
    DefaultUserDao userDao(){
        return new DefaultUserDao();
    }

    @Bean("dao1")
    @Order(2)
    DefaultUserDao dao1(){
        return new  DefaultUserDao();
    }

    @Bean("userServ")
    DefaultUserService userService(){
        return new DefaultUserService();
    }

    @Bean("list")
    List<DefaultUserDao> list(){
        return new ArrayList<>();
    }
}
