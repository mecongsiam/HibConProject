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

        Controller controller = new Controller();
        Request request = new Request();
        Response response = new Response();
        Scanner answer = new Scanner(System.in);
        String ans = null;
        System.out.println("select option: 1 - 4");
        System.out.println("1.Create user");
        System.out.println("2.Read user");
        System.out.println("3.Update user");
        System.out.println("4.Delete user");
        System.out.println("5.Show all users");

        while (!answer.hasNext("1") && !answer.hasNext("4") && !answer.hasNext("3") && !answer.hasNext("2")
                && !answer.hasNext("5")) {
            System.out.println("select option: 1 - 5");
            answer.nextLine();

        }
        ans = answer.nextLine();
        int num = Integer.parseInt(ans);

        switch (num) {
            case 1:
                request.setCommandName("CREATE_USER");
                User user = new User();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter name:");
                user.setUsername(scanner.nextLine());
                System.out.println("Created by:");
                user.setCreatedBy(scanner.nextLine());
                user.setCreatedDate(new Date());
                request.setUser(user);
                response = controller.doAction(request);
                break;
            case 2:
                request.setCommandName("READ_USER");
                user=new User();
                user.setUserId(4);
                request.setUser(user);
                response = controller.doAction(request);
                break;
            case 3:
                request.setCommandName("UPDATE_USER");
                user=new User();
                user.setUserId(2);
                user.setCreatedBy("me");
                user.setUsername("Jimmy_updated");
                user.setCreatedDate(new Date());
                request.setUser(user);
                response = controller.doAction(request);
                break;
            case 4:
                request.setCommandName("DELETE_USER");
                user=new User();
                user.setUserId(2);
                request.setUser(user);
                response=controller.doAction(request);
                break;
            case 5:
                request.setCommandName("READ_ALL_USERS");
                break;
        }



        System.out.println(response.isResult());


    }

}

