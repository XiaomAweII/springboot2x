package com.springboot.chapter3.config;


import com.springboot.chapter3.definition.Person;
import com.springboot.chapter3.pojo.BussinessPerson;
import com.springboot.chapter3.pojo.DataBaseProperties;
import com.springboot.chapter3.pojo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author xiaoweii
 * @create 2025-04-05 15:04
 */
public class IocTest {

    private static Logger log = LoggerFactory.getLogger(IocTest.class);

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfig.class);
        DataBaseProperties properties = ctx.getBean(DataBaseProperties.class);
        System.out.println("properties = " + properties);
        ctx.close();


    }

}
