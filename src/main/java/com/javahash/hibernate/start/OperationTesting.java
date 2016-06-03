package com.javahash.hibernate.start;

import com.javahash.hibernate.dao.DAOException;
import com.javahash.hibernate.dao.DAOFactory;
import com.javahash.hibernate.pojo.Address;
import com.javahash.hibernate.pojo.Car;
import com.javahash.hibernate.pojo.User;

/**
 * Created by meco on 02.06.2016.
 */
public class OperationTesting {
    public void carAdd(){
        Car car = new Car();
        car.setColor("red");
        car.setModel("bmw");
        car.setYear(2015);
        DAOFactory daoFactory = DAOFactory.getInstance();
        daoFactory.getDbUserOperation().create(car);
    }

    public void carRead(){
        Car car=new Car();
        DAOFactory daoFactory=DAOFactory.getInstance();
        try {
            car=(Car)daoFactory.getDbUserOperation().read(car,1);
        } catch (DAOException e) {
            e.printStackTrace();
        }
        car.print();

    }
    public void refreshTest(){
        User user;
        DAOFactory daoFactory=DAOFactory.getInstance();
        daoFactory.getDbUserOperation().refresh();

    }
    public void componentTesting(){
        Car car=new Car();
        DAOFactory daoFactory=DAOFactory.getInstance();
        try {
            car=(Car)daoFactory.getDbUserOperation().read(car,1);
            Address address=car.getAddress();
            System.out.println(address.getCity());
        } catch (DAOException e) {
            e.printStackTrace();
        }
    }
}
