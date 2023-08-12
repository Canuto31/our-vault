package com.entertainment.ourvault.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "category")
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToMany(mappedBy = "categories")
    private List<Type> types;

    @OneToMany(mappedBy = "category")
    private List<Book> books;

    @OneToMany(mappedBy = "category")
    private List<Videogame> videogames;

    @OneToMany(mappedBy = "category")
    private List<Movie> movies;

    @OneToMany(mappedBy = "category")
    private List<Serie> series;
}
