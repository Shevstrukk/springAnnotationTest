package com.github.shevstrukk.example.injectList;

import org.springframework.stereotype.Component;

@Component
public class DefaultUserDao2 implements UserDao {

    public void doOrder() {
        System.out.println("Заказ не выполнен");
    }
}
