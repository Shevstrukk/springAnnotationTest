package com.github.shevstrukk.example.inject2bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DefaultUserService {
@Autowired
@Qualifier("daoUser")
    private DaoUser daoUser;

    private DaoUser daoUser2;
@Autowired
@Qualifier("bean2")
    public void setDaoUser2(DaoUser daoUser2) {
        this.daoUser2 = daoUser2;
    }
    void doOrder(){
    daoUser2.doOrder();
    }
}
