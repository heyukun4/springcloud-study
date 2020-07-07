package com.hyk.nacosregister.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("discovery")
public class DiscoveryController {
    @NacosInjected
    NamingService namingService;

    @GetMapping("get")
    public List<Instance> get(@RequestParam String serviceName) throws NacosException {
        return this.namingService.getAllInstances(serviceName);
    }
}
