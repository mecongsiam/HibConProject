package com.javahash.hibernate.service;

import com.javahash.hibernate.dao.DAOFactory;
import com.javahash.hibernate.dao.DBUserOperation;
import com.javahash.hibernate.pojo.User;

import java.util.List;

/**
 * Created by meco on 29.05.2016.
 */
public class UserService {

    public static void updateUser(User user){

        DAOFactory daoFactory=DAOFactory.getInstance();
        DBUserOperation dbUserOperation=daoFactory.getDbUserOperation();
        dbUserOperation.update(user);


    }
    public static boolean createUser(User user){
        DAOFactory daoFactory=DAOFactory.getInstance();
        DBUserOperation dbUserOperation=daoFactory.getDbUserOperation();
        dbUserOperation.create(user);
        return true;

    }
    public static User   readUser(User user){
        User result;
        DAOFactory daoFactory=DAOFactory.getInstance();
        DBUserOperation dbUserOperation=daoFactory.getDbUserOperation();
        Object obj=dbUserOperation.read(user,user.getUserId());
        user=(User)obj;
        return user;

    }
    public static void deleteUser(User user){
        DAOFactory daoFactory=DAOFactory.getInstance();
        DBUserOperation dbUserOperation=daoFactory.getDbUserOperation();
        dbUserOperation.delete(user);
    }
    public static List<User> getAllUsers(){
        DAOFactory daoFactory=DAOFactory.getInstance();
        DBUserOperation dbUserOperation=daoFactory.getDbUserOperation();
        return dbUserOperation.readAllUsers();

    }
}
