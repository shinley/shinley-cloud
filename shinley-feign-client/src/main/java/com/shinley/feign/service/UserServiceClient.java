package com.shinley.feign.service;


import com.shinley.cloud.entity.User;
import com.shinley.feign.model.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "SHINLEY-FEIGN-PROVIDER", url = "${feign.provider.url}")         // 直連
//@FeignClient(value = "SHINLEY-FEIGN-PROVIDER")      // 从eureka获取
public interface UserServiceClient {
    @RequestMapping("/getUser")
    User getUser();

    @RequestMapping("/getPerson")
    Person getPerson();
}
