package com.hyk.feignfirst.controller;

import com.hyk.feignfirst.feign.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private DemoService demoService;
    @RequestMapping("hello")
    public String hello(){
        return this.demoService.hello();
    }
}
