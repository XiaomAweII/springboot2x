package com.springboot.chapter1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaoweii
 * @create 2025-04-05 00:51
 */
@Controller
// 启用 SpringBoot 自动装配
@EnableAutoConfiguration
public class Chapter1Main {

    @RequestMapping("/test")
    @ResponseBody
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        return map;
    }

    public static void main(String[] args) {
        SpringApplication.run(Chapter1Main.class, args);
    }
}
