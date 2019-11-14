package com.github.shevstrukk.example.injectList;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DefaultUserServiceTest {
    @Test
    void listBean(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConfigClass.class);
        context.refresh();
        DefaultUserDao userDao = (DefaultUserDao)context.getBean("userDao");
        DefaultUserDao userDao1 = (DefaultUserDao)context.getBean("dao1");
        List<DefaultUserDao> list = (List<DefaultUserDao>)context.getBean("list");
        list.add(userDao);
        list.add(userDao1);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        DefaultUserService userService = (DefaultUserService)context.getBean("userServ",DefaultUserService.class);
        userService.listStart(list);

    }

}
