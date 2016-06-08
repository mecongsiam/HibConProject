package com.javahash.hibernate.pojo.hib_annotation;

import javax.persistence.*;

/**
 * Created by meco on 08.06.2016.
 */
@Entity

public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int id;
    @Column(name = "name")
    private String name;

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
    public Player(){}
    public Player(String name){
        this.name=name;
    }
}
