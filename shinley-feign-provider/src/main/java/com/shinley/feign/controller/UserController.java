package com.shinley.feign.controller;


import com.shinley.cloud.entity.User;
import com.shinley.feign.model.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${dataSource}")
    private String dataSource;

    @RequestMapping("/getUser")
    public User getUser() {
        return new User(1, "cxl");
    }

    @RequestMapping("/getPerson")
    public Person getPerson() {
        return new Person(1, "cxl");
    }

    @RequestMapping("/getDatasource")
    public String getDatasource() {
        return this.dataSource;
    }
}

