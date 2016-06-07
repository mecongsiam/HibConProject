package com.javahash.hibernate.pojo.one_to_many;

/**
 * Created by meco on 06.06.2016.
 */
public class Cat {
    private int id;
    private String name;
    private House house;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

