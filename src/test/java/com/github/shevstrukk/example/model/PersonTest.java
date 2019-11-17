package com.github.shevstrukk.example.model;

import com.github.shevstrukk.example.javaconfig.PersonConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        final AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
        context.register(PersonConfig.class);
        context.refresh();
        Person bean = context.getBean(Person.class);
        assertNotNull(bean);
        assertNotNull(bean.getName());
        System.out.println(bean.getName());
    }
}
