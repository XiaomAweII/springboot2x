package com.springboot.chapter3.pojo;

import com.springboot.chapter3.definition.Animal;
import org.springframework.stereotype.Component;

/**
 * @author xiaoweii
 * @create 2025-04-05 16:03
 */
@Component
public class Dog implements Animal {

    @Override
    public void use() {
        System.out.println("狗【" + Dog.class.getSimpleName() + "】是看门用的。");
    }
}
