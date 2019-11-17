package com.github.shevstrukk.example.property.inject;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class DefaultUserDaoTest {
    @Test
    void propertyInject(){
        ApplicationContext context =
                new  AnnotationConfigApplicationContext("com.github.shevstrukk.example.property.inject");
        DefaultUserDao userDao = context.getBean(DefaultUserDao.class);
        userDao.getDriver();
        assertNotNull(userDao);
        assertNotNull(userDao.getDriver());
    }

}
