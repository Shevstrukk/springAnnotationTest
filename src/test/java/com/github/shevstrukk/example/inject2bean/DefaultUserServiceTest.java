package com.github.shevstrukk.example.inject2bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class DefaultUserServiceTest {
    @Test
    void inject2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.registerBean("daoUser",DefaultUserDao.class);
    context.registerBean("bean2", DefaultUserDao.class);
    context.registerBean("userService",DefaultUserService.class);
    context.refresh();
    DefaultUserService userService = (DefaultUserService)context.getBean("userService");
    userService.doOrder();
    }
}
