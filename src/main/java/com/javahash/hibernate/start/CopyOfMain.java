package com.javahash.hibernate.start;

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
public class CopyOfMain {
    public static void main(String[] args) {
        Session session=HibernateSessionManager.getSessionFactory().openSession();
        session.beginTransaction();
        Query query=session.createQuery("from User ");
        List<User> userList=query.list();
        for(User user:userList){
            System.out.println("user id: "+user.getUserId()+" user name: " +
                    " "+user.getUsername()+"  date of create: "+user.getCreatedDate()+" created by: "+user.getCreatedBy());

        }
//
    }
}
