package com.hyk.feignfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringCloudApplication
public class FeignFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignFirstApplication.class, args);
    }

}
