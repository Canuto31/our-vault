package com.entertainment.ourvault.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "stream_page")
@Data
public class StreamPage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "streamPage")
    private List<Movie> movies;

    @OneToMany(mappedBy = "streamPage")
    private List<Serie> series;
}
