package com.javahash.hibernate.controller.command.impl;

import com.javahash.hibernate.bean.Request;
import com.javahash.hibernate.bean.Response;
import com.javahash.hibernate.controller.command.Command;
import com.javahash.hibernate.pojo.User;
import com.javahash.hibernate.service.UserService;

/**
 * Created by meco on 30.05.2016.
 */
public class ReadAllUsers implements Command {
    public Response execute(Request request) {
        Response response=new Response();
        for(User user:UserService.getAllUsers()){
            System.out.println("user id: "+user.getUserId()+" user name: " +
                    " "+user.getUsername()+"  date of create: "+user.getCreatedDate()+" created by: "+user.getCreatedBy());
        }
        response.setResult(true);
        return response;
    }
}
