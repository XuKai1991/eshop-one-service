package com.eshop.eshoponeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrix
public class EshopOneServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EshopOneServiceApplication.class, args);
    }

}
