package com.shinley.feign.controller;

import com.shinley.cloud.entity.User;
import com.shinley.feign.service.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServiceClient userServiceClient;

    @RequestMapping("/user")
    public User findUser() {
        User user = userServiceClient.getUser();
        return user;
    }
}
