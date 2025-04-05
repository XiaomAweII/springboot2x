package com.springboot.chapter3.pojo;

import com.springboot.chapter3.definition.Animal;
import com.springboot.chapter3.definition.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author xiaoweii
 * @create 2025-04-05 16:02
 */
@Component
public class BussinessPerson implements Person {

    private Animal animal = null;

    public BussinessPerson(@Autowired @Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

}
