package com.shinley.feign.controller;

import com.shinley.cloud.entity.User;
import com.shinley.feign.model.Person;
import com.shinley.feign.service.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceClient userServiceClient;

    @Value("${dataSource}")
    private String dataSource;

    @RequestMapping("/user")
    public User findUser() {
        User user = userServiceClient.getUser();
        return user;
    }

    @RequestMapping("/person")
    public Person findPerson() {
        Person person = userServiceClient.getPerson();
        return person;
    }

    @RequestMapping("/getDatasource")
    public String getDatasource() {
        return this.dataSource;
    }
}
