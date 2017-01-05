package com.suvan.demo.demo;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author suvan
 * @create 2017-01-05-14:20
 */
@RestController
@EnableAutoConfiguration
public class HellowController {

    @RequestMapping("hello")
    public String hello(Map<String, Object> model) {
        List<String> l= Lists.newArrayList();
        l.add("哈喽，hadoop");
        l.add("哈喽，hbase");
        l.add("哈喽，hive");
        l.add("哈喽，pig");
        l.add("哈喽，zookeeper");
        l.add("哈喽，三劫散仙");
        //将数据存放map里面，可以直接在velocity页面，使用key访问
        model.put("data",l);
        return "hello";
    }

    @RequestMapping("demo")
    public String demo() {
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.error("This is a error message");
        return "Spring Boot + Logback Demo";
    }

}
