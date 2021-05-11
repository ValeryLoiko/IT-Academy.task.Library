package by.pvt.lessons.les_16.library.controller.command.impl;

import by.pvt.lessons.les_16.library.bean.Book;
import by.pvt.lessons.les_16.library.controller.command.interf.Command;
import by.pvt.lessons.les_16.library.service.LibraryServis;
import by.pvt.lessons.les_16.library.service.exception.ServiceException;
import by.pvt.lessons.les_16.library.service.factory.ServiceFactory;

public class AddBook implements Command {
    private final String paramDelimeter = "#";
    @Override
    public String execute(String request) {
        String response;

        try {
            String[] checkRequest = request.split(paramDelimeter);
            String title = checkRequest[0];
            String author = checkRequest[1];
            int year =Integer.parseInt(checkRequest[2]);
            int id = Integer.parseInt(checkRequest[3]);

            Book book = new Book(title, author, year, id);

            ServiceFactory serviceFactory = ServiceFactory.getInstance();
            LibraryServis libraryServis = serviceFactory.getLibraryServis();

            libraryServis.addNewBook(book);
            response = "Книга была добавлена в библиотеку";
        }catch (ServiceException e){
            response = "Что-то пошло не так";
        }

        return response;
    }
}
