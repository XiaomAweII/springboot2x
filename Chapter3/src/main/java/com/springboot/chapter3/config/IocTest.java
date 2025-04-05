package com.springboot.chapter3.config;


import com.springboot.chapter3.definition.Person;
import com.springboot.chapter3.pojo.BussinessPerson;
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
        ApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);
        log.info("user.getId : {} ; user.getUserName : {}",
                user.getId(), user.getUserName());

        Person person = ctx.getBean(BussinessPerson.class);
        person.service();

    }

}
