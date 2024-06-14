package com.eurekaclient.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service 1";
    }
}

