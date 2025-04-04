package com.springboot.springmvc.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/**
 * 配置SpringMVC
 *
 * @author xiaoweii
 * @create 2025-04-04 23:25
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Spring Ioc 容器配置
    @Override
    protected Class<?>[] getRootConfigClasses() {
        // 可以返回Spring的Java配置文件数组
        return new Class<?>[]{};
    }

    // DispatcherServlet的URI映射关系配置
    @Override
    protected Class<?>[] getServletConfigClasses() {
        // 可以返回Spring的Java配置文件数组
        return new Class<?>[]{WebConfig.class};
    }

    // DispatcherServlet拦截请求匹配
    @Override
    protected String[] getServletMappings() {
        return new String[]{"*.do"};
    }
}
