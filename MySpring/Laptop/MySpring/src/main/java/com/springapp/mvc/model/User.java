package com.springapp.mvc.model;

import javax.persistence.Entity;

/**
 * Created by Christian on 20/8/2015.
 */
@Entity
@SuppressWarnings("user")
public class User {

    private String username;
    private String password;

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
}
