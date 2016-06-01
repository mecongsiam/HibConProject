package com.javahash.hibernate.dao.impl;

import com.javahash.hibernate.dao.DBUserOperation;
import com.javahash.hibernate.dao.HibernateSessionManager;
import com.javahash.hibernate.pojo.User;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


/**
 * Created by meco on 29.05.2016.
 */
public class DBUserOperationDAO<T> implements DBUserOperation<T> {
    public T create(T t) {
        Session session = HibernateSessionManager.getSessionFactory().openSession();
        session.beginTransaction();

        session.save(t);
        session.getTransaction().commit();

        session.close();


        return t;

    }

    public T read(T t, int id) {

        Session session = HibernateSessionManager.getSessionFactory().openSession();
        session.beginTransaction();
        t = (T) session.get(t.getClass(), id);
        session.close();
        return t;


    }

    public T update(T t) {
        Session session = HibernateSessionManager.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(t);
        session.getTransaction().commit();
        session.close();
        return t;
    }


    public T delete(T t) {
        Session session = HibernateSessionManager.getSessionFactory().openSession();
        session.beginTransaction();

        session.delete(t);
        session.getTransaction().commit();
        session.close();
        return t;

    }

    public List<User> readAllUsers() {
        Session session = HibernateSessionManager.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("from User");
        List<User> userList = query.list();
        session.close();
        return userList;

    }

}
