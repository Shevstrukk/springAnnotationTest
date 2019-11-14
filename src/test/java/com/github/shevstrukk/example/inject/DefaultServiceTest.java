package com.github.shevstrukk.example.inject;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class DefaultServiceTest {
    @Test
    void byConstructor(){
        final AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
        context.register(DefaultDao.class);
        context.register(DefaultService.class);
        context.refresh();
        DefaultService defaultService = (DefaultService) context.getBean(DefaultService.class);
        defaultService.doOrder();

    }

}
