package by.pvt.lessons.les_16.library.controller.command.impl;

import by.pvt.lessons.les_16.library.bean.User;
import by.pvt.lessons.les_16.library.controller.command.interf.Command;
import by.pvt.lessons.les_16.library.service.ClientServise;
import by.pvt.lessons.les_16.library.service.exception.ServiceException;
import by.pvt.lessons.les_16.library.service.factory.ServiceFactory;

public class SignIn implements Command {
    private final String paramDelimetr = "#";

    @Override
    public String execute(String request) {
        String[] checkRequest = request.split(paramDelimetr);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ClientServise clientServise = serviceFactory.getClientServise();

        String login = null;
        String password = null;
        String response;


        try {
            login = checkRequest[0];
            password = checkRequest[1];
            clientServise.singIn(login, password);
            response = "Welcome";
        }catch (ServiceException e){
            response = "Что-то пошло не так";
        }
        return response;

    }
}
