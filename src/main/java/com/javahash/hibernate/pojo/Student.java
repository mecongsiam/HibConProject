package com.javahash.hibernate.pojo;

/**
 * Created by meco on 06.06.2016.
 */
public class Student extends Person {
    private String faculty;
    private double mark;

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
