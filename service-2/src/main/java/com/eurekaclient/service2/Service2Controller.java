package com.eurekaclient.service2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service2Controller {
    @Autowired
    Service1Client service1Client;

    @GetMapping("/get-hello")
    public String getHello() {
        return service1Client.getHello();
    }
}
