package com.tw.leewin.crm.model;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by lwzhang on 4/4/15.
 */

public class Customer implements Person, Serializable {

    private static final long serialVersionUID = 1L;

    private String userName;
    private String password;
    private String firstName;
    private String lastName;

    public Customer() {
    }

    public Customer(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String greet() {
        return "Hello, I'm "+firstName+" "+lastName+"!";
    }
}
