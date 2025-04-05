package com.springboot.chapter3.config;

import com.springboot.chapter3.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaoweii
 * @create 2025-04-05 15:03
 */
@Configuration
//@ComponentScan("com.springboot.chapter3.*")
//@ComponentScan(basePackages = "com.springboot.chapter3.pojo")
@ComponentScan(basePackageClasses = User.class)
public class AppConfig {

}
