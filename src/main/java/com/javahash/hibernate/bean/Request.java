package com.javahash.hibernate.bean;

import com.javahash.hibernate.pojo.User;

/**
 * Created by meco on 29.05.2016.
 */
public class Request {
    private String commandName;
    private User user;

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
