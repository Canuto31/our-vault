package com.entertainment.ourvault.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "videogame")
@Data
public class Videogame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    //FALTA ESTE
    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    //LISTO
    @ManyToOne@JoinColumn(name = "id_game_store")
    private GameStore gameStore;

    private Double price;

    private String image;

    private String trailer;

    //FALTA ESTE
    @ManyToOne
    @JoinColumn(name = "id_state")
    private State state;

    private Integer rate;
}
