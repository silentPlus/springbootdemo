package com.suvan.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author suvan
 * @create 2017-01-05-14:32
 */
@Configuration                       // 配置控制
@EnableAutoConfiguration             // 启用自动配置
@ComponentScan                       // 组件扫描
public class ApplicationMain {

    /*启动Spring Boot项目唯一入口，放在src/main/java包下的第一层结构中*/
    public static void main(String[] args) {
        SpringApplication.run(ApplicationMain.class, args);
    }
}
