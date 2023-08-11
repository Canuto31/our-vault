package com.entertainment.ourvault.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class TypeDto {

    private Integer id;
    private String name;
    private List<StateDto> states;
    private List<CategoryDto> categories;
}
