package com.javahash.hibernate.controller.command.impl;

import com.javahash.hibernate.bean.Request;
import com.javahash.hibernate.bean.Response;
import com.javahash.hibernate.controller.command.Command;
import com.javahash.hibernate.pojo.User;
import com.javahash.hibernate.service.ServiceException;
import com.javahash.hibernate.service.UserService;

/**
 * Created by meco on 30.05.2016.
 */
public class ReadUser implements Command {
    public Response execute(Request request) {
        Response response=new Response();

        User user= null;
        try {
            user = UserService.readUser(request.getUser());
            System.out.println(user.getUsername()+" "+user.getCreatedBy());
        } catch (ServiceException e) {
            System.out.println("No such user.Chech other id: ");
            System.out.println(e.getMessage().toString());
            return response;
        }catch (Exception e){
            System.out.println("No such user.Chech other id: ");
            System.out.println(e.toString());
            return response;

        }

        return response;
    }
}
