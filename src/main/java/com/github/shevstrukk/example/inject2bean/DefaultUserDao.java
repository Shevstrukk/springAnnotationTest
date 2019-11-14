package com.github.shevstrukk.example.inject2bean;

public class DefaultUserDao implements DaoUser {
    public void doOrder(){
        System.out.println("заказ сделан");
    }
}
