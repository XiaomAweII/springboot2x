package com.springboot.chapter3.service;

import com.springboot.chapter3.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author xiaoweii
 * @create 2025-04-05 15:27
 */
@Service
public class UserService {
    public void printUser(User user) {
        System.out.println("编号:" + user.getId());
        System.out.println("用户名称:" + user.getUserName());
        System.out.println("备注:" + user.getNote());
    }
}
