package com.eurekaclient.service2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service1")
public interface Service1Client {

    @GetMapping("/hello")
    String getHello();
}

