package com.hyk.springbootnacosexample.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("config")
public class ConfigController {
    @NacosValue(value = "${userLocalCache:false}",autoRefreshed = true)
    private boolean userLocalCache;

    @GetMapping("get")
    public boolean get(){
        return this.userLocalCache;
    }

}
