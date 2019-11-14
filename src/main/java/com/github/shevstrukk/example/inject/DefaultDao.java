package com.github.shevstrukk.example.inject;

public class DefaultDao implements Dao{

    public DefaultDao() {
        System.out.println("конструктор DefaultDao");
    }

    public void doOrder(){
        System.out.println("делаем заказ");
    }
}
