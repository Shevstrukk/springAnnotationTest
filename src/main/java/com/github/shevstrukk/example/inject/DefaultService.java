package com.github.shevstrukk.example.inject;

import org.springframework.beans.factory.annotation.Autowired;

public class DefaultService {

@Autowired //поле
private DefaultDao defaultDao;

//@Autowired конструктор
    public DefaultService(DefaultDao defaultDao) {
        this.defaultDao = defaultDao;
        System.out.println("создался конструктор service");
    }

    public DefaultService() {

    }
//@Autowired сеттер
    public void setDefaultDao(DefaultDao defaultDao) {
        this.defaultDao = defaultDao;
    }

    public void doOrder(){
        defaultDao.doOrder();
    }

}
