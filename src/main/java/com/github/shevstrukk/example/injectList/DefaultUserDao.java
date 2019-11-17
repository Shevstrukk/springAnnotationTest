package com.github.shevstrukk.example.injectList;

import org.springframework.stereotype.Component;

@Component
public class DefaultUserDao implements UserDao {
    public void doOrder(){
        System.out.println("заказ сделан");
    }
}
