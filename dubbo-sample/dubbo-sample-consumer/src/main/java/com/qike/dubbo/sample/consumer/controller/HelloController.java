package com.qike.dubbo.sample.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qike.dubbo.sample.api.interfacep.HelloProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class HelloController {


    @Reference(version = "${provider.service.version}")
    HelloProvider helloProvider;

    @GetMapping("/hello")
    public Object hello(String message){
        return  helloProvider.hello(message);
    }

}
