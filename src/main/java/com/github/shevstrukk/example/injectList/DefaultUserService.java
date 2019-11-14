package com.github.shevstrukk.example.injectList;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DefaultUserService {
    private List<DefaultUserDao> list;

@Autowired
    public DefaultUserService(List<DefaultUserDao> list) {
    this.list = list;
    listStart(list);
    }

    public DefaultUserService() {

    }

    void listStart(List<DefaultUserDao> list){
        for(DefaultUserDao elem: list){
            elem.doOrder();
         }
    }

}
