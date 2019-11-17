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
    DefaultUserDao daoUser = context.getBean("daoUser", DefaultUserDao.class);
    DefaultUserDao bean2 = context.getBean("bean2", DefaultUserDao.class);
    DefaultUserService userService =
            (DefaultUserService)context.getBean("userService", DefaultUserService.class);
    userService.doOrder();
        assertNotNull(daoUser);
        assertNotNull(bean2);
        assertNotNull(userService);
        assertTrue(daoUser.getClass().equals(DefaultUserDao.class));
        assertTrue(bean2.getClass().equals(DefaultUserDao.class));
        assertTrue(userService.getClass().equals(DefaultUserService.class));
    }
}
