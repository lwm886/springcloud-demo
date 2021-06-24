package com.tech.jk.order;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class JkOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(JkOrderApplication.class, args);
    }

    @GetMapping("/hello")
    String hello(){
        log.info("=================order hello================");
        return "hello word";
    }
}
