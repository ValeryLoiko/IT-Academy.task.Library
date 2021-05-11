package by.pvt.lessons.les_16.library.service.factory;

import by.pvt.lessons.les_16.library.service.ClientServise;
import by.pvt.lessons.les_16.library.service.LibraryServis;
import by.pvt.lessons.les_16.library.service.exception.ServiceException;
import by.pvt.lessons.les_16.library.service.impl.ClientServiceImpl;
import by.pvt.lessons.les_16.library.service.impl.LibraryServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final ClientServise clientServise =  new ClientServiceImpl();
    private final LibraryServis libraryServis = new LibraryServiceImpl();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return instance;
    }
    public ClientServise getClientServise(){
        return clientServise;
    }

    public LibraryServis getLibraryServis(){
        return libraryServis;
    }

}
