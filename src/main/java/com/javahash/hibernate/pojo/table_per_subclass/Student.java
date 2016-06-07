package com.javahash.hibernate.pojo.table_per_subclass;

/**
 * Created by meco on 06.06.2016.
 */
public class Student extends Person {
    private int id;
    private String faculty;
    private String mark;
    private int fkId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getFkId() {
        return fkId;
    }

    public void setFkId(int fkId) {
        this.fkId = fkId;
    }
}
