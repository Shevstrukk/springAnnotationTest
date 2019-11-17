package com.github.shevstrukk.example.resourcetest;


import javax.annotation.Resource;

public class OrderService {

    @Resource(name = "daoUser1")
    private DaoOrder orderDao;

    public void showDetail(){
        orderDao.doOrder();
    }
}
