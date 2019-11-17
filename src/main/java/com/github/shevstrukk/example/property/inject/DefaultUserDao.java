package com.github.shevstrukk.example.property.inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultUserDao implements UserDao {

    @Value("${jdbc.driverClassName:default}")
    private String driver;

    public String getDriver(){
        System.out.println(driver);
        return driver;
    }

}
