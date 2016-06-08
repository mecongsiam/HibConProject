package com.javahash.hibernate.pojo.anno_many_to_many;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by meco on 08.06.2016.
 */
@Entity
public class Writer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToMany(fetch = FetchType.LAZY,mappedBy = "writers")
    private Set<Song> songs;

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

    public Set<Song> getSongs() {
        return songs;
    }

    public void setSongs(Set<Song> songs) {
        this.songs = songs;
    }
}
