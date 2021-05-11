package by.pvt.lessons.les_16.library.controller.command;

import by.pvt.lessons.les_16.library.controller.CommandName;
import by.pvt.lessons.les_16.library.controller.command.impl.AddBook;
import by.pvt.lessons.les_16.library.controller.command.impl.Register;
import by.pvt.lessons.les_16.library.controller.command.impl.SignIn;
import by.pvt.lessons.les_16.library.controller.command.impl.WrongRequest;
import by.pvt.lessons.les_16.library.controller.command.interf.Command;

import java.util.HashMap;
import java.util.Map;

public class CommandProvider {
    private final Map<CommandName, Command> repository = new HashMap<>();
    public CommandProvider(){
        repository.put(CommandName.ADD_BOOK, new AddBook());
        repository.put(CommandName.REGISTER, new Register());
        repository.put(CommandName.SING_IN, new SignIn());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequest());
    }
    public Command getCommand(String name){
        CommandName commandName = null;
        Command command = null;
        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        }catch (IllegalArgumentException | NullPointerException e){
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
