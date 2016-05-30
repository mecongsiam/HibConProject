package com.javahash.hibernate.controller.command;

import com.javahash.hibernate.controller.command.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by meco on 29.05.2016.
 */
public class CommandHelper {
    private Map<CommandName, Command> commands = new HashMap<CommandName, Command>();

    public CommandHelper() {
        commands.put(CommandName.CREATE_USER, new CreateUser());
        commands.put(CommandName.UPDATE_USER, new UpdateUser());
        commands.put(CommandName.READ_USER, new ReadUser());
        commands.put(CommandName.DELETE_USER, new DeleteUser());
        commands.put(CommandName.READ_ALL_USERS, new ReadAllUsers());


    }

    public Command getCommand(String commandName) {
        CommandName name = CommandName.valueOf(commandName);
        Command command = commands.get(name);
        return command;

    }
}
