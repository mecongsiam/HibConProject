package com.javahash.hibernate.controller;

import com.javahash.hibernate.bean.Request;
import com.javahash.hibernate.bean.Response;
import com.javahash.hibernate.controller.command.Command;
import com.javahash.hibernate.controller.command.CommandHelper;

/**
 * Created by meco on 29.05.2016.
 */
public class Controller {
    private final CommandHelper commandHelper=new CommandHelper();
    Response response=null;

    public Response doAction(Request request){
        String commandName=request.getCommandName();
        Command command=commandHelper.getCommand(commandName);
        response=command.execute(request);
        return response;

    }

}
