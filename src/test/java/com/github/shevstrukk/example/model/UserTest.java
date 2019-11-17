package com.github.shevstrukk.example.model;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void getName() {
        final AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        context.refresh();
        User bean = (User)context.getBean("user");
        //user.setName("Vitalij");
        System.out.println(bean.getName());
        assertNotNull(bean.getName());
    }
}
