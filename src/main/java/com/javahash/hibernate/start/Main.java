package com.javahash.hibernate.start;

import com.javahash.hibernate.bean.Request;
import com.javahash.hibernate.bean.Response;
import com.javahash.hibernate.controller.Controller;
import com.javahash.hibernate.dao.HibernateSessionManager;
import com.javahash.hibernate.pojo.User;
import org.hibernate.Session;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by meco on 29.05.2016.
 */
public class Main {
    public static void main(String args[]) {
        boolean result=true;
        MainMenu mainMenu=new MainMenu();
        while(result){
           result=mainMenu.run();

        }
    }

}

