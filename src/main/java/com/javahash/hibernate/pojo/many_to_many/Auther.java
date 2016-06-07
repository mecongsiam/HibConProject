package com.javahash.hibernate.pojo.many_to_many;

import java.util.Set;

/**
 * Created by meco on 07.06.2016.
 */
public class Auther {
    private int id;
    private String surname;
    private Set<Book> books;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
