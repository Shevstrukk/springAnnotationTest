package com.github.shevstrukk.example.inject2bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean("bean2")
    DefaultUserDao defaultUserDao(){
        return new DefaultUserDao();
    }
    @Bean
    DefaultUserDao userDao(){
        return new DefaultUserDao();
    }
    @Bean("userService")
    DefaultUserService defaultUserService(){
        return new DefaultUserService();
    }
}
