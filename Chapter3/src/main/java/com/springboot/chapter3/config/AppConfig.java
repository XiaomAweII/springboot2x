package com.springboot.chapter3.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.springboot.chapter3.condition.DatabaseConditional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author xiaoweii
 * @create 2025-04-05 15:03
 */
@Configuration
//@ComponentScan("com.springboot.chapter3.*")
//@ComponentScan(basePackages = "com.springboot.chapter3.pojo")
//@ComponentScan(basePackageClasses = User.class)
@ComponentScan(basePackages = "com.springboot.chapter3.*",
        excludeFilters = {@Filter(classes = Service.class)},
        lazyInit = true)
public class AppConfig {

    // 启动项目时配置 JAVA_OPTS="-Dspring.profiles.active=dev" 启动Profile机制
    @Bean(value = "druidDataSource", destroyMethod = "close")
    @Profile("dev")
    public DruidDataSource getDevDruidDataSource() {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/dev_spring_boot?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC");
        props.setProperty("username", "root");
        props.setProperty("password", "123456");
        DruidDataSource dataSource = null;
        try {
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    @Bean(value = "druidDataSource", destroyMethod = "close")
    @Conditional(DatabaseConditional.class)
    @Profile("test")
    public DruidDataSource getTestDruidDataSource() {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/test_spring_boot?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC");
        props.setProperty("username", "root");
        props.setProperty("password", "123456");
        DruidDataSource dataSource = null;
        try {
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
