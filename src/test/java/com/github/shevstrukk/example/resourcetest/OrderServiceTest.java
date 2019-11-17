package com.github.shevstrukk.example.resourcetest;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void testResource(){
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ConfigClass.class);
        OrderService bean = context.getBean(OrderService.class);
        bean.showDetail();
    }

}
