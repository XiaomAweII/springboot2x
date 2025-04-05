package com.springboot.chapter3.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author xiaoweii
 * @create 2025-04-05 19:24
 */
@Component
public class BeanPostProcessorExample implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.err.println("BeanPostProcessor 调用"
                + "postProcessBeforeInitialization 方法，参数【"
                + bean.getClass().getSimpleName() + "】【" + beanName + "】");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.err.println("BeanPostProcessor 调用"
                + "postProcessAfterInitialization 方法，参数【"
                + bean.getClass().getSimpleName() + "】【" + beanName + "】");
        return bean;
    }
}
