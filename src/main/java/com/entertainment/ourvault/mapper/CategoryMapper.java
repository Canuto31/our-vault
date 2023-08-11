package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.mapper.utils.BaseMapper;
import com.entertainment.ourvault.mapper.utils.MapperUtils;
import com.entertainment.ourvault.model.dto.CategoryDto;
import com.entertainment.ourvault.model.dto.StateDto;
import com.entertainment.ourvault.model.entity.Category;
import com.entertainment.ourvault.model.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryMapper implements BaseMapper<CategoryDto, Category> {

    @Lazy
    @Autowired
    private MapperUtils mapperUtils;

    @Lazy
    @Autowired
    private TypeMapper typeMapper;

    @Override
    public CategoryDto entityToDto(Category entity) {
        CategoryDto dto = new CategoryDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setTypes(typeMapper.entitiesToDtosBasic(entity.getTypes()));

        return dto;
    }

    @Override
    public Category dtoToEntity(CategoryDto dto) {
        Category entity = new Category();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setTypes(typeMapper.DtosToEntitiesBasic(dto.getTypes()));

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

    public CategoryDto entityToDtoBasic(Category entity) {
        CategoryDto dto = new CategoryDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    public Category dtoToEntityBasic(CategoryDto dto) {
        Category entity = new Category();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    public List<CategoryDto> entitiesToDtosBasic(List<Category> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDtoBasic);
    }

    public List<Category> DtosToEntitiesBasic(List<CategoryDto> dtos) {
        return mapperUtils.entitiesToDtos(dtos, this::dtoToEntityBasic);
    }
}
