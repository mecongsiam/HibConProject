package com.javahash.hibernate.pojo.one_to_many;

import java.util.Set;

/**
 * Created by meco on 06.06.2016.
 */
public class House {
    private int id;
    private String name;
    private Set<Cat> cats;

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

    public Set<Cat> getCats() {
        return cats;
    }

    public void setCats(Set<Cat> cats) {
        this.cats = cats;
    }
}
