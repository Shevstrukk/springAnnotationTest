package com.github.shevstrukk.example.inject;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class DefaultServiceTest {
    @Test
    void byConstructor(){
        final AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
        context.register(ConfigClass.class);
        context.refresh();
        DefaultService service = (DefaultService) context.getBean(DefaultService.class);
        service.doOrder();
        assertNotNull(service);
        assertTrue(service.getClass().equals(DefaultService.class));

    }

}
