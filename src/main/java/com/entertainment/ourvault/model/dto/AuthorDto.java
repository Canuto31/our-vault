package com.entertainment.ourvault.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class AuthorDto {

    private Integer id;

    private String name;

    private List<BookDto> books;
}
