package com.entertainment.ourvault.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class GameStoreDto {

    private Integer id;

    private String name;

    private List<VideogameDto> videogames;
}
