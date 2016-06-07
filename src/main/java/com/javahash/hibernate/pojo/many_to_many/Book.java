package com.javahash.hibernate.pojo.many_to_many;

import java.util.Set;

/**
 * Created by meco on 07.06.2016.
 */
public class Book {
    private int id;
    private String name;
    private Set<Auther> authers;

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

    public Set<Auther> getAuthers() {
        return authers;
    }

    public void setAuthers(Set<Auther> authers) {
        this.authers = authers;
    }
}
