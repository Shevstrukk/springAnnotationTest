package com.github.shevstrukk.example.injectList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DefaultUserService {
   List<UserDao> dao;

    public List<UserDao> getDao() {
        return dao;
    }

    @Autowired
    public DefaultUserService( List<UserDao> list) {
        this.dao = list;
    }

  void doOrderList(){
      for (UserDao em: dao){
        em.doOrder();
      }
    }
}
