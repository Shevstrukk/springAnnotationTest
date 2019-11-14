package com.github.shevstrukk.example.model;

import org.springframework.stereotype.Component;

@Component
public class PersonAnnotation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
