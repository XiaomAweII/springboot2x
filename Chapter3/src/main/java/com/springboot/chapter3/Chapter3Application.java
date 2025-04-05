package com.springboot.chapter3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Service;

/**
 * @author xiaoweii
 * @create 2025-04-05 00:51
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.springboot.chapter3.*",
        excludeFilters = {@Filter(classes = Service.class)})
public class Chapter3Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter3Application.class, args);
    }
}
