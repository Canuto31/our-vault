package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.model.dto.CategoryDto;
import com.entertainment.ourvault.model.entity.Category;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryMapper implements BaseMapper<CategoryDto, Category> {
    @Override
    public CategoryDto entityToDto(Category entity) {
        return null;
    }

    @Override
    public Category dtoToEntity(CategoryDto dto) {
        return null;
    }

    @Override
    public List<CategoryDto> entitiesToDtos(List<Category> entities) {
        return null;
    }

    @Override
    public List<Category> DtosToEntities(List<CategoryDto> dtos) {
        return null;
    }
}
