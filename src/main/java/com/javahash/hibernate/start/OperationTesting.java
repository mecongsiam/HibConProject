package com.javahash.hibernate.start;

import com.javahash.hibernate.dao.DAOException;
import com.javahash.hibernate.dao.DAOFactory;
import com.javahash.hibernate.pojo.*;
import com.javahash.hibernate.pojo.Person;
import com.javahash.hibernate.pojo.many_to_many.Auther;
import com.javahash.hibernate.pojo.many_to_many.Book;
import com.javahash.hibernate.pojo.one_to_many.Cat;
import com.javahash.hibernate.pojo.one_to_many.House;
import com.javahash.hibernate.pojo.one_to_one.Customer;
import com.javahash.hibernate.pojo.one_to_one.Place;
import com.javahash.hibernate.pojo.table_per_subclass.*;
import com.javahash.hibernate.pojo.table_per_subclass.Student;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
            car=(Car)daoFactory.getDbUserOperation().read(car.getClass(),1);
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
            car=(Car)daoFactory.getDbUserOperation().read(car.getClass(),1);
            Address address=car.getAddress();
            System.out.println(address.getCity());
        } catch (DAOException e) {
            e.printStackTrace();
        }





    }
    public void TablePerClassHiAdd(){
        Person student =new Person();

        student.setName("Ju");

        student.setSurname("Smee");


        DAOFactory daoFactory=DAOFactory.getInstance();
        daoFactory.getDbUserOperation().create(student);

    }
    public void tablePerClassRead(){
        Person person=new Person();

        DAOFactory daoFactory=DAOFactory.getInstance();
        try {
            person=(Person)daoFactory.getDbUserOperation().read(person,1);
            System.out.println(person.getName()+" "+person.getSurname());

        } catch (DAOException e) {
            e.printStackTrace();
        }
    }
    public void tablePerSubclassAdd(){
        com.javahash.hibernate.pojo.table_per_subclass.Student student=
                new Student();
        student.setName("Lany");
        student.setSurname("Hilary");
        student.setFaculty("Mech");
        student.setMark("10");
        DAOFactory daoFactory=DAOFactory.getInstance();
        daoFactory.getDbUserOperation().create(student);


    }
    public void tablePerSubclassRead(){
        Student student =new Student();
        DAOFactory daoFactory=DAOFactory.getInstance();
        try {
            student=(Student)daoFactory.getDbUserOperation().read(student,2);
            System.out.println(student.getMark()+" "+student.getName()+" "+student.getFaculty());
        } catch (DAOException e) {
            e.printStackTrace();
        }


    }
    public void oneToOneAdd(){
        DAOFactory daoFactory=DAOFactory.getInstance();
        Customer customer =new Customer();
        customer.setName("Puck");
        customer.setAge(25);
        Place place=new Place();
        place.setCity("brooklin");
        daoFactory.getDbUserOperation().create(customer);
        place.setCustomer(customer);
        daoFactory.getDbUserOperation().create(place);
    }
    public void oneToOneRead(){
        DAOFactory daoFactory=DAOFactory.getInstance();
        Customer customer=new Customer();
        try {
           customer=(Customer) daoFactory.getDbUserOperation().read(customer,2);
            System.out.println(customer.getName()+" "+customer.getPlace().getCity());

        } catch (DAOException e) {
            e.printStackTrace();
        }

    }
    public void oneToOneDelete(){
        DAOFactory daoFactory=DAOFactory.getInstance();
        Customer customer=new Customer();
        customer.setId(2);

        daoFactory.getDbUserOperation().delete(customer);
    }
    public void OneToManyAdd(){
        DAOFactory daoFactory=DAOFactory.getInstance();
        House house=new House();
        house.setName("green house");
        Cat cat;

        daoFactory.getDbUserOperation().create(house);
        cat=new Cat();
        cat.setName("myrka");
        cat.setHouse(house);
        Set<Cat> cats=new HashSet<Cat>();
        cats.add(cat);
        house.setCats(cats);

        daoFactory.getDbUserOperation().update(cat);
        cat=new Cat();
        cat.setName("Vasko");
        cat.setHouse(house);
        cats.add(cat);
        house.setCats(cats);
        daoFactory.getDbUserOperation().update(house);
        daoFactory.getDbUserOperation().update(cat);

    }
    public void oneToManyRead(){
        DAOFactory daoFactory=DAOFactory.getInstance();
        House house=new House();
        try {
            house=(House)daoFactory.getDbUserOperation().read(house,1);
            Set<Cat> cats=house.getCats();
            System.out.println(house.getName());
            for(Cat cat:cats){
            System.out.println(cat.getName());}
        } catch (DAOException e) {
            e.printStackTrace();
        }

    }
    public void manyToManyAdd(){
        DAOFactory daoFactory=DAOFactory.getInstance();
        Book book=new Book();
        book.setName("rambo");
        Auther auther=new Auther();
        auther.setSurname("gamunkul");
        Set<Auther> authers=new HashSet<Auther>();
        Set<Book> books=new HashSet<Book>();
        books.add(book);
        auther.setBooks(books);
        daoFactory.getDbUserOperation().create(auther);






    }
}
