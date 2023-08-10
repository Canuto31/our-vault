package com.entertainment.ourvault.model.dto;

import lombok.Data;

import java.util.Set;

@Data
public class StateDto {

    private Integer id;
    private String name;
    private Set<String> types;
}
