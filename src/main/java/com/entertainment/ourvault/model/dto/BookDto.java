package com.entertainment.ourvault.model.dto;

import lombok.Data;

@Data
public class BookDto {

    private Integer id;

    private String name;

    private CategoryDto category;

    private Double price;

    private String image;

    private Integer pagesAmount;

    private AuthorDto author;

    private StateDto state;

    private Integer rate;
}
