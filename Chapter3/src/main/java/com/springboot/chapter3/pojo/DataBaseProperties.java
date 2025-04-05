package com.springboot.chapter3.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xiaoweii
 * @create 2025-04-05 22:59
 */
@Component
public class DataBaseProperties {

    @Value("${database.driverName}")
    private String driverName = null;

    @Value("${database.url}")
    private String url = null;

    private String username = null;

    private String password = null;

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        System.err.println(driverName);
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        System.err.println(url);
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    @Value("${database.username}")
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    @Value("${database.password}")
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "DataBaseProperties{" +
                "driverName='" + driverName + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
