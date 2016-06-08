package com.javahash.hibernate.pojo.anno_many_to_many;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by meco on 08.06.2016.
 */
@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name ="song_writer",joinColumns = {
            @JoinColumn(name = "id_song")
    },inverseJoinColumns = {@JoinColumn(name = "id_writer")})
    private Set<Writer> writers;

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

    public Set<Writer> getWriters() {
        return writers;
    }

    public void setWriters(Set<Writer> writers) {
        this.writers = writers;
    }
}
