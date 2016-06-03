package com.javahash.hibernate.dao;

import com.javahash.hibernate.pojo.User;

import java.util.List;

/**
 * Created by meco on 29.05.2016.
 */
public interface DBUserOperation<T> {
    T  update(T t);
    T  create(T t);
    T read(T t,int id) throws DAOException;
    T delete(T t);
    List<User> readAllUsers();
    T readLoad(T t,int id) throws DAOException;
    void refresh();



}
