package com.entertainment.ourvault.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "state")
@Data
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToMany(mappedBy = "states")
    private List<Type> types;

    @OneToMany(mappedBy = "state")
    private List<Book> books;
}
