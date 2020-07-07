package com.hyk.feignfirst.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "demo-service",fallback = DemoServiceFallback.class)
public interface DemoService {
    @GetMapping("hello")
    String hello();
}
