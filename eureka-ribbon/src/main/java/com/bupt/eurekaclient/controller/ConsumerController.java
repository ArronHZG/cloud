package com.bupt.eurekaclient.controller;

import com.bupt.eurekaclient.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

//
//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
//        return restTemplate.getForEntity("http://HELLO-SERVER/hello", String.class).getBody();
        return helloService.helloService();
    }
}
