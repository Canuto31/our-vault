package com.entertainment.ourvault.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    private Double price;

    private String image;

    @Column(name = "pages_amount")
    private Integer pagesAmount;

    @ManyToOne
    @JoinColumn(name = "id_author")
    private Author author;

    @ManyToOne
    @JoinColumn(name = "id_state")
    private State state;

    private Integer rate;
}
