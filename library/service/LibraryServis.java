package by.pvt.lessons.les_16.library.service;

import by.pvt.lessons.les_16.library.bean.Book;
import by.pvt.lessons.les_16.library.service.exception.ServiceException;

public interface LibraryServis {
    void addNewBook(Book book) throws ServiceException;

    void AddEditedBook(Book book) throws ServiceException;
}
