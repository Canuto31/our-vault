package com.entertainment.ourvault.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class StateDto {

    private Integer id;
    private String name;
    private List<TypeDto> types;
    private List<BookDto> books;
}
