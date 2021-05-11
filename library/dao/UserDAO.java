package by.pvt.lessons.les_16.library.dao;

import by.pvt.lessons.les_16.library.dao.exception.DAOException;

public interface UserDAO {
    void signIn(String login, String password) throws DAOException;

}
