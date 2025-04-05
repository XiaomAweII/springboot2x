package com.springboot.chapter3.pojo;

import java.util.concurrent.locks.Lock;

/**
 * @author xiaoweii
 * @create 2025-04-05 15:02
 */
public class User {

    private Long id;
    private String userName;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
