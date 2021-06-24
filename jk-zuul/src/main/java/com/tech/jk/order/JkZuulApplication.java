package com.tech.jk.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class JkZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(JkZuulApplication.class, args);
    }

}
