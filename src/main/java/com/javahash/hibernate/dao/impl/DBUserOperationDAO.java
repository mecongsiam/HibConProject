package com.javahash.hibernate.dao.impl;

import com.javahash.hibernate.dao.DAOException;
import com.javahash.hibernate.dao.DBUserOperation;
import com.javahash.hibernate.dao.HibernateSessionManager;
import com.javahash.hibernate.pojo.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

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

    public T read(T t, int id) throws DAOException {

        Session session = HibernateSessionManager.getSessionFactory().openSession();

         Transaction transaction=session.beginTransaction();
        System.out.print(getClass().getTypeParameters()[0]);

        try{

        t = (T) session.get(t.getClass(), id);}catch(Exception e){
            throw new DAOException(e.getMessage().toString());
        }
        transaction.commit();
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
    public T readLoad(T t, int id) throws DAOException {

        Session session = HibernateSessionManager.getSessionFactory().openSession();

        Transaction transaction=session.beginTransaction();
        try{
            t = (T) session.load(t.getClass(), id);}catch(Exception e){
            throw new DAOException(e.getMessage().toString());
        }
        transaction.commit();
        session.close();
        return t;


    }
    public void refresh(){
        Session session=HibernateSessionManager.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        System.out.println(session.isDirty());
        User user=(User)session.get(User.class,4);
        System.out.println(user.getUsername()+" "+user.getCreatedBy());
        user.setUsername("Vanno");
        System.out.println(user.getUsername()+" "+user.getCreatedBy());
        System.out.println(session.isDirty());
        if(session.isDirty()){
            session.clear();


        }
        System.out.println(session.isDirty());
        session.refresh(user);
        System.out.println(user.getUsername()+" "+user.getCreatedBy());
        session.close();

    }



}
