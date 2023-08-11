package com.entertainment.ourvault.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "author")
@Data
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
