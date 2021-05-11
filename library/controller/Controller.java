package by.pvt.lessons.les_16.library.controller;

import by.pvt.lessons.les_16.library.controller.command.CommandProvider;
import by.pvt.lessons.les_16.library.controller.command.interf.Command;

public class Controller {
    private final CommandProvider provider = new CommandProvider();
    private final char paramDelimetr = ' ';

    public String executeTask(String request){
        String commandName;
        Command executionCommand;

        commandName = request.substring(0, request.indexOf(paramDelimetr));
        executionCommand = provider.getCommand(commandName);

        String response;
        response = executionCommand.execute(request);

        return response;
    }
}
