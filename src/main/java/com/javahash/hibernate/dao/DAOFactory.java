package com.javahash.hibernate.dao;

import com.javahash.hibernate.dao.impl.DBUserOperationDAO;

/**
 * Created by meco on 29.05.2016.
 */
public class DAOFactory {
    private static final DAOFactory instance=new DAOFactory();

    private DBUserOperation dbUserOperation=new DBUserOperationDAO();

    private DAOFactory(){};

    public  static DAOFactory getInstance(){
        return instance;
    }

    public DBUserOperation getDbUserOperation() {
        return dbUserOperation;
    }
}
