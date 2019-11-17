package com.github.shevstrukk.example.injectList;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;


class DefaultUserServiceTest {

    @Test
    void listBean(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.github.shevstrukk.example.injectList");
        DefaultUserService userService =
                (DefaultUserService)context.getBean(DefaultUserService.class);
        userService.doOrderList();
        assertNotNull(userService);
        assertNotNull(userService.getDao());

    }

}
