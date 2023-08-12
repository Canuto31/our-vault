package com.entertainment.ourvault.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {

    private Integer id;

    private String name;

    private List<TypeDto> types;

    private List<BookDto> books;

    private List<VideogameDto> videogames;

    private List<MovieDto> movies;

    private List<SerieDto> series;
}
