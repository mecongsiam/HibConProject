package com.javahash.hibernate.pojo.anno_one_to_one;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


import javax.persistence.*;

/**
 * Created by meco on 08.06.2016.
 */
@Entity
@Table(name = "dog_house")
public class DogHouse {
    @Id
    @GenericGenerator(
            name = "gen",
            strategy = "foreign",
            parameters = @Parameter(name="property",value="dog")
    )
    @GeneratedValue(generator = "gen")
    private int id;
    @Column(name = "color")
    private String color;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Dog dog;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
