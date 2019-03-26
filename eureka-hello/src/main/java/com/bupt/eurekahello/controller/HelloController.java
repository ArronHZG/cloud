package com.bupt.eurekahello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;


@RestController     //等同于同时加上了@Controller和@ResponseBody
public class HelloController {
//    @Autowired
//    GirlProprties girl;
//
//    @Autowired
//    private DiscoveryClient client;

    //访问/hello或者/hi任何一个地址，都会返回一样的结果
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){

//        List<String> list = client.getServices();
//        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
//        for (ServiceInstance element : srvList) {
//            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t" + element.getUri());
//        }
//        System.out.println(girl);

        return "hello";
    }
}
