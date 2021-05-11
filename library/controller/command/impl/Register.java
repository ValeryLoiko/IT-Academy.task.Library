package by.pvt.lessons.les_16.library.controller.command.impl;

import by.pvt.lessons.les_16.library.bean.User;
import by.pvt.lessons.les_16.library.controller.command.interf.Command;
import by.pvt.lessons.les_16.library.service.ClientServise;
import by.pvt.lessons.les_16.library.service.exception.ServiceException;
import by.pvt.lessons.les_16.library.service.factory.ServiceFactory;

public class Register implements Command {
    private final String paramDelimetr = "#";
    @Override
    public String execute(String request) {
        String response;
try {


    ServiceFactory serviceFactory = ServiceFactory.getInstance();
    ClientServise clientServise = serviceFactory.getClientServise();

    String[] checkRequest = request.split(paramDelimetr);
    String login = checkRequest[0];
    String password = checkRequest[1];
    String eMail = checkRequest[2];

    User user = new User(login,password,eMail);
    clientServise.registration(user);
    response = "Done";
}catch (ServiceException e){
    response = "Что-то пошло не так";
}
        return response;
    }
}
