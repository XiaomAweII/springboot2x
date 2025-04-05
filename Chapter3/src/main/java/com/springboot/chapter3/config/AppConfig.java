package com.springboot.chapter3.config;

import com.springboot.chapter3.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaoweii
 * @create 2025-04-05 15:03
 */
@Configuration
public class AppConfig {

    @Bean(name = "user")
    public User initUser() {
        User user = new User();
        user.setId(1L);
        user.setUserName("user_name_1");
        user.setNote("note_1");
        return user;
    }
}
