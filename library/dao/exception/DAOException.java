package by.pvt.lessons.les_16.library.dao.exception;

public class DAOException  extends Exception{
 public static final long serialVersionUID = 1L;

 public DAOException(){
     super();
 }

 public DAOException(String message){
     super(message);
 }

public DAOException(Exception e){
     super(e);
}

public DAOException(String message, Exception e){
     super(message, e);
}
}
