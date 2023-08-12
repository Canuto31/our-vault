package com.entertainment.ourvault.model.dto;

import lombok.Data;

@Data
public class MovieDto {

    private Integer id;

    private String name;

    private Integer duration;

    private CategoryDto category;

    private StreamPageDto streamPage;

    private String image;

    private String trailer;

    private StateDto state;

    private Integer rate;
}
