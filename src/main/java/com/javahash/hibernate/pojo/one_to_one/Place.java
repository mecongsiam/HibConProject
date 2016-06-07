package com.javahash.hibernate.pojo.one_to_one;

import java.io.Serializable;

/**
 * Created by meco on 06.06.2016.
 */
public class Place implements Serializable {
    private  static  final long serialVersionUID=3L;

    private int id;
    private String city;
    private Customer customer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
