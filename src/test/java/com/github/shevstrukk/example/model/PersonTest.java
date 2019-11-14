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
        Person person = context.getBean(Person.class);
        person.setName("Vitali");
        System.out.println(person.getName());
    }
}
