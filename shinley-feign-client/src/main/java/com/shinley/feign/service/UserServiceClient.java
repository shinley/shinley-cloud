package com.shinley.feign.service;


import com.shinley.cloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient(value = "SHINLEY-FEIGN-PROVIDER", url = "http://localhost:3366")         // 直連
@FeignClient(value = "SHINLEY-FEIGN-PROVIDER")      // 从eureka获取
public interface UserServiceClient {
    @RequestMapping("/getUser")
    User getUser();
}
