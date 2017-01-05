package com.suvan.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suvan
 * @create 2017-01-05-14:20
 */
@RestController
@EnableAutoConfiguration
public class HellowController {

    @RequestMapping("hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HellowController.class, args);
    }
}
