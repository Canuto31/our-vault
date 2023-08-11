package com.entertainment.ourvault.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "type")
@Data
public class Type {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "type_state",joinColumns = @JoinColumn(name = "id_type"), inverseJoinColumns = @JoinColumn(name = "id_state"))
    private List<State> states;
}
