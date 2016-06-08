package com.javahash.hibernate.pojo.anno_one_to_many;

import com.javahash.hibernate.pojo.anno_one_to_one.Dog;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyToOne;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by meco on 08.06.2016.
 */
@Entity
@Table(name = "dog_department")
public class DogDepartment implements Serializable {
    private static final long serialVersionUID=66L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="name")
    private String name;
    @OneToMany(mappedBy = "dogDepartment",fetch = FetchType.EAGER)

    private Set<Dog> dogs;

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

    public Set<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Set<Dog> dogs) {
        this.dogs = dogs;
    }
}
