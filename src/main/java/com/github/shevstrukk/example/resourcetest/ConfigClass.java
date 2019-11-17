package com.github.shevstrukk.example.resourcetest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean("daoUser1")
    DaoOrder daoUser1(){
        return new DefaultOrderDao();
    }
    @Bean("daoUser2")
    DaoOrder daoUser2(){
        return new DefaultOrderDao2();
    }

    @Bean("order")
    OrderService order(){
        return new OrderService();
    }
}
