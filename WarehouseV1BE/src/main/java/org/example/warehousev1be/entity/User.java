package org.example.warehousev1be.entity;

import lombok.Data;

public class User {
    //与数据表的字段保持一致
    private int id;
    private String username;
    private String password;

    //GET/SET方法

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
