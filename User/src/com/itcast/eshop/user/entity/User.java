package com.itcast.eshop.user.entity;

public class User  extends Person {
    private String username;
    private String password;
    private String role = "NORMAL";

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
}
