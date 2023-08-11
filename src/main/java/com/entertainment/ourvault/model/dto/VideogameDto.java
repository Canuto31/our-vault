package com.entertainment.ourvault.model.dto;

import lombok.Data;

@Data
public class VideogameDto {

    private Integer id;

    private String name;

    private CategoryDto category;

    private GameStoreDto gameStore;

    private Double price;

    private String image;

    private String trailer;

    private StateDto state;

    private Integer rate;
}
