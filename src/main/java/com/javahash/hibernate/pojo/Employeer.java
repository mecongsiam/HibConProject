package com.javahash.hibernate.pojo;

/**
 * Created by meco on 06.06.2016.
 */
public class Employeer extends Person {
    private String company;
    private double salary;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
