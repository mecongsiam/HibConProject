package com.javahash.hibernate.dao;

/**
 * Created by meco on 02.06.2016.
 */
public class DAOException extends Exception {

    public DAOException(String message){
        super(message);
    }

    public DAOException(Exception e){
        super(e);
    }

    public DAOException(String message,Exception e){
        super(message,e);
    }
}
