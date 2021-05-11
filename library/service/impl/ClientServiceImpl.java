package by.pvt.lessons.les_16.library.service.impl;

import by.pvt.lessons.les_16.library.bean.User;
import by.pvt.lessons.les_16.library.dao.UserDAO;
import by.pvt.lessons.les_16.library.dao.exception.DAOException;
import by.pvt.lessons.les_16.library.dao.factory.DAOFactory;
import by.pvt.lessons.les_16.library.service.ClientServise;
import by.pvt.lessons.les_16.library.service.exception.ServiceException;

public class ClientServiceImpl implements ClientServise {
    @Override
    public void singIn(String login, String  password) throws ServiceException {
        if (login == null || login.isEmpty()){
            throw new ServiceException("Неверный логин");
        }
        try {
            DAOFactory daoObjectFactory = DAOFactory.getInstance();
            UserDAO userDAO = daoObjectFactory.getUserDAO();
            userDAO.signIn(login, password);
        }catch (DAOException e){
            throw new ServiceException(e);
        }

    }

    @Override
    public void registration(User user) throws ServiceException {

    }

}
