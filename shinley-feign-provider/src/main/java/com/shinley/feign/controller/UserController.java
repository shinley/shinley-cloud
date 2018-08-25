package com.shinley.feign.controller;


import com.shinley.cloud.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/getUser")
    public User getUser() {
        return new User(1, "cxl");
    }
}

