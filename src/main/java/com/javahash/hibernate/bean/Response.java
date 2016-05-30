package com.javahash.hibernate.bean;

import com.javahash.hibernate.pojo.User;

import java.util.List;

/**
 * Created by meco on 29.05.2016.
 */
public class Response {
    private boolean result;
    private List<User> users;


    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
