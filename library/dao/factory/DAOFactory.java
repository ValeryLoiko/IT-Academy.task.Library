package by.pvt.lessons.les_16.library.dao.factory;

import by.pvt.lessons.les_16.library.dao.BookDAO;
import by.pvt.lessons.les_16.library.dao.UserDAO;
import by.pvt.lessons.les_16.library.dao.impl.SQLBookDAO;
import by.pvt.lessons.les_16.library.dao.impl.SQLUserDAO;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final BookDAO sqlBookImpl = new SQLBookDAO();
    private final UserDAO sqlUserImpl = new SQLUserDAO();

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return instance;
    }

    public BookDAO getBookDao(){
        return sqlBookImpl;
    }

    public UserDAO getUserDAO(){
        return sqlUserImpl;
    }
}
