package by.pvt.lessons.les_16.library.dao;

import by.pvt.lessons.les_16.library.bean.Book;
import by.pvt.lessons.les_16.library.dao.exception.DAOException;

public interface BookDAO {
    void addBook(Book book) throws DAOException;
    void deleteBook(long idBook) throws DAOException;

}
