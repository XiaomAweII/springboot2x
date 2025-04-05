package com.springboot.chapter3.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.springboot.chapter3.pojo.User;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
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

    @Bean("dbcpDataSource")
    public DataSource getDbcpDataSource() {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/chapter");
        props.setProperty("username", "root");
        props.setProperty("password", "root");
        DataSource dataSource = null;
        try {
            dataSource = BasicDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    @Bean("druidDataSource")
    public DataSource getDruidDataSource() {
        Properties props = new Properties();
        props.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        props.setProperty("url", "jdbc:mysql://localhost:3306/chapter");
        props.setProperty("username", "root");
        props.setProperty("password", "root");
        DataSource dataSource = null;
        try {
            dataSource = DruidDataSourceFactory.createDataSource(props);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dataSource;
    }
}
