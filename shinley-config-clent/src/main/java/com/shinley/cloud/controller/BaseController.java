package com.shinley.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
//    @Value("${app.name}")
    private String appName;

    @Value("${dataSource}")
    private String dataSource;

    @RequestMapping("/test")
    public String getAppName() {
        return this.appName;
    }

    @RequestMapping("/getDatasource")
    public String getDatasource() {
        return this.dataSource;
    }
}
