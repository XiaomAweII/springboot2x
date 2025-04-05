package com.springboot.chapter3.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.springboot.chapter3.condition.DatabaseConditional;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
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

    @Bean(value = "druidDataSource", destroyMethod = "close")
    @Conditional(DatabaseConditional.class)
    public DruidDataSource getDruidDataSource(
            @Value("${database.driverName}") String driver,
            @Value("${database.url}") String url,
            @Value("${database.username}") String username,
            @Value("${database.password}") String password) {
        Properties props = new Properties();
        props.setProperty("driver", driver);
        props.setProperty("url", url);
        props.setProperty("username", username);
        props.setProperty("password", password);
        DruidDataSource dataSource = null;
        try {
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
