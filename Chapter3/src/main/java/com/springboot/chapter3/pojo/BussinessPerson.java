package com.springboot.chapter3.pojo;

import com.springboot.chapter3.definition.Animal;
import com.springboot.chapter3.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xiaoweii
 * @create 2025-04-05 16:02
 */
@Component
public class BussinessPerson implements Person {

    @Autowired
    private Animal animal = null;

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
