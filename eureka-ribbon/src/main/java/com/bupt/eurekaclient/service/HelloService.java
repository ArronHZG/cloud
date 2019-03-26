package com.bupt.eurekaclient.service;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @Hystrix()
    public String helloService() {
        return restTemplate.getForEntity("http://HELLO-SERVER/hello", String.class).getBody();
    }

    public String helloFallback() {
        return "error";
    }
}
