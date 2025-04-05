package com.springboot.chapter3.pojo;

import com.springboot.chapter3.definition.Animal;
import com.springboot.chapter3.definition.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author xiaoweii
 * @create 2025-04-05 16:02
 */
@Component
public class BussinessPerson implements Person, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private Animal animal = null;

    @Override
    public void service() {
        this.animal.use();
    }

    @Override
    @Autowired
    @Qualifier("dog")
    public void setAnimal(Animal animal) {
        System.err.println("延迟依赖注入");
        this.animal = animal;
    }

    @Override
    public void setBeanName(String s) {
        System.err.println("【" + this.getClass().getSimpleName()
                + "】调用 BeanNameAware 的 setBeanName方法");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.err.println("【" + this.getClass().getSimpleName()
                + "】调用 BeanFactory 的 setBeanFactory 方法");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.err.println("【" + this.getClass().getSimpleName()
                + "】调用 ApplicationContextAware 的 setApplicationContext方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.err.println("【" + this.getClass().getSimpleName()
                + "】调用 InitializingBean 的 afterPropertiesSet方法");
    }

    @PostConstruct
    public void init() {
        System.err.println("【" + this.getClass().getSimpleName()
                + "】注解 @PostConstruct 定义的自定义初始化方法");
    }

    @PostConstruct
    public void destry1() {
        System.err.println("【" + this.getClass().getSimpleName() +
                "】注解 @PostConstruct 定义的自定义销毁方法");
    }

    @Override
    public void destroy() throws Exception {
        System.err.println("【" + this.getClass().getSimpleName()
                + "】DisposableBean ");
    }

}
