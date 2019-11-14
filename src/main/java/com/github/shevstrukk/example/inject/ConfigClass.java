package com.github.shevstrukk.example.inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {
    @Bean
    DefaultDao defaultDao(){
        return new DefaultDao();
    }
    @Bean
    DefaultService defaultService(){
        return new DefaultService();
    }
}
