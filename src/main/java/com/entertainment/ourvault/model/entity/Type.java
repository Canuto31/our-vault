package com.entertainment.ourvault.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "type")
@Data
public class Type {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}
