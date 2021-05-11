package by.pvt.lessons.les_16.library.controller.command.impl;

import by.pvt.lessons.les_16.library.controller.command.interf.Command;

public class WrongRequest implements Command {
    private final String paramDelimeter = "#";

    @Override
    public String execute(String request) {
        return "Error. Wrong request.";
    }
}
