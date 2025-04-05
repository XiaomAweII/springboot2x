package com.springboot.chapter3.pojo;

import com.springboot.chapter3.definition.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author xiaoweii
 * @create 2025-04-05 18:37
 */
@Component
@Primary
public class Cat implements Animal {

    @Override
    public void use() {
        System.out.println("猫【" + Cat.class.getSimpleName() + "】是抓老鼠的。");
    }
}
