package com.javahash.hibernate.pojo;

/**
 * Created by meco on 02.06.2016.
 */
public class Car {
    private int id;
    private String model;
    private String color;
    private int year;
    private Address address;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void print(){
        System.out.println(+id+" "+model+" "+color+" "+year);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
