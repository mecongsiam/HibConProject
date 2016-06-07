package com.javahash.hibernate.pojo.one_to_one;

import java.io.Serializable;

/**
 * Created by meco on 06.06.2016.
 */
public class Customer implements Serializable {
    private static final long seriaVersionUID=4L;

    private int id;
    private String  name;
    private int age;
    private Place place;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
