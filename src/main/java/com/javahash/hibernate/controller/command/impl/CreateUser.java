package com.javahash.hibernate.controller.command.impl;

import com.javahash.hibernate.bean.Request;
import com.javahash.hibernate.bean.Response;
import com.javahash.hibernate.controller.command.Command;
import com.javahash.hibernate.service.UserService;

/**
 * Created by meco on 29.05.2016.
 */
public class CreateUser implements Command {


    public Response execute(Request request) {
        Response response=new Response();
        response.setResult(UserService.createUser(request.getUser()));
        return response;
    }
}
