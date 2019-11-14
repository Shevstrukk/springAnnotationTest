package com.github.shevstrukk.example.javaconfig;

import com.github.shevstrukk.example.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

    @Bean
    Person createPerson(){
        return new Person();
    }
}
