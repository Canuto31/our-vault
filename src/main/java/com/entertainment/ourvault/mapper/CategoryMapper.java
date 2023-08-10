package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.model.dto.CategoryDto;
import com.entertainment.ourvault.model.entity.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryMapper implements BaseMapper<CategoryDto, Category> {
    @Override
    public CategoryDto entityToDto(Category entity) {
        CategoryDto dto = new CategoryDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    @Override
    public Category dtoToEntity(CategoryDto dto) {
        Category entity = new Category();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    @Override
    public List<CategoryDto> entitiesToDtos(List<Category> entities) {
        List<CategoryDto> dtos = new ArrayList<>();

        for(Category entity : entities) {
            dtos.add(entityToDto(entity));
        }

        return dtos;
    }

    @Override
    public List<Category> DtosToEntities(List<CategoryDto> dtos) {
        List<Category> entities = new ArrayList<>();

        for(CategoryDto dto : dtos) {
            entities.add(dtoToEntity(dto));
        }

        return entities;
    }
}
