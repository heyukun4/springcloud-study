package com.hyk.feignfirst.feign;

import org.springframework.stereotype.Component;

@Component
public class DemoServiceFallback implements DemoService {
    @Override
    public String hello() {
        return "fallback";
    }
}
