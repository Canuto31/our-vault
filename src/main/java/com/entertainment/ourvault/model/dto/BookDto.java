package com.entertainment.ourvault.model.dto;

import lombok.Data;

@Data
public class BookDto {

    private Integer id;

    private String name;

    private Double price;

    private String image;

    private Integer rate;
}
