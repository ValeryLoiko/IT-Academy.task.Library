package by.pvt.lessons.les_16.library.service;

import by.pvt.lessons.les_16.library.bean.User;
import by.pvt.lessons.les_16.library.service.exception.ServiceException;

public interface ClientServise {
    void singIn(String login, String  password) throws ServiceException;

    void registration(User user) throws ServiceException;


}
