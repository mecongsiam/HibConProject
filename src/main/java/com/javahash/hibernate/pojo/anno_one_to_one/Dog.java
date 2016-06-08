package com.javahash.hibernate.pojo.anno_one_to_one;

import com.javahash.hibernate.pojo.anno_one_to_many.DogDepartment;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by meco on 08.06.2016.
 */
@Entity
public class Dog implements Serializable {
    private static final long serialVersionUID=33L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @OneToOne(mappedBy = "dog",cascade = CascadeType.ALL)
    private DogHouse dogHouse;
    @ManyToOne
    @JoinColumn(name ="id_department" )
    private DogDepartment dogDepartment;

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


    public DogHouse getDogHouse() {
        return dogHouse;
    }

    public void setDogHouse(DogHouse dogHouse) {
        this.dogHouse = dogHouse;
    }

    public DogDepartment getDogDepartment() {
        return dogDepartment;
    }

    public void setDogDepartment(DogDepartment dogDepartment) {
        this.dogDepartment = dogDepartment;
    }
}
