package com.javahash.hibernate.service;

/**
 * Created by meco on 02.06.2016.
 */
public class ServiceException extends Exception {
    public ServiceException(String message){
        super(message);
    }

    public ServiceException(Exception e){
        super(e);
    }

    public ServiceException(String message,Exception e){
        super(message,e);
    }
}
