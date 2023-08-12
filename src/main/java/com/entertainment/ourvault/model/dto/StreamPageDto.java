package com.entertainment.ourvault.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class StreamPageDto {

    private Integer id;

    private String name;

    private List<MovieDto> movies;

    private List<SerieDto> series;
}
