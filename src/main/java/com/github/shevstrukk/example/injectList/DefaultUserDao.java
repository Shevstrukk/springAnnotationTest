package com.github.shevstrukk.example.injectList;

public class DefaultUserDao implements DaoUser {
    public void doOrder(){
        System.out.println("заказ сделан");
    }
}
