package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.mapper.utils.BaseMapper;
import com.entertainment.ourvault.mapper.utils.MapperUtils;
import com.entertainment.ourvault.model.dto.CategoryDto;
import com.entertainment.ourvault.model.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CategoryMapper implements BaseMapper<CategoryDto, Category> {

    @Lazy
    @Autowired
    private MapperUtils mapperUtils;

    @Lazy
    @Autowired
    private TypeMapper typeMapper;

    @Lazy
    @Autowired
    private BookMapper bookMapper;

    @Lazy
    @Autowired
    private VideogameMapper videogameMapper;

    @Lazy
    @Autowired
    private MovieMapper movieMapper;

    @Lazy
    @Autowired
    private SerieMapper serieMapper;

    @Override
    public CategoryDto entityToDto(Category entity) {
        CategoryDto dto = new CategoryDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        dto.setTypes(typeMapper.entitiesToDtosBasic(entity.getTypes()));
        dto.setBooks(bookMapper.entitiesToDtosBasic(entity.getBooks()));
        dto.setVideogames(videogameMapper.entitiesToDtosBasic(entity.getVideogames()));
        dto.setMovies(movieMapper.entitiesToDtosBasic(entity.getMovies()));
        dto.setSeries(serieMapper.entitiesToDtosBasic(entity.getSeries()));

        return dto;
    }

    @Override
    public Category dtoToEntity(CategoryDto dto) {
        Category entity = new Category();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        entity.setTypes(typeMapper.dtosToEntitiesBasic(dto.getTypes()));
        entity.setBooks(bookMapper.dtosToEntitiesBasic(dto.getBooks()));
        entity.setVideogames(videogameMapper.dtosToEntitiesBasic(dto.getVideogames()));
        entity.setMovies(movieMapper.dtosToEntitiesBasic(dto.getMovies()));
        entity.setSeries(serieMapper.dtosToEntitiesBasic(dto.getSeries()));

        return entity;
    }

    @Override
    public List<CategoryDto> entitiesToDtos(List<Category> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDto);
    }

    @Override
    public List<Category> dtosToEntities(List<CategoryDto> dtos) {
        return mapperUtils.entitiesToDtos(dtos, this::dtoToEntity);
    }

    @Override
    public CategoryDto entityToDtoBasic(Category entity) {
        CategoryDto dto = new CategoryDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    @Override
    public Category dtoToEntityBasic(CategoryDto dto) {
        Category entity = new Category();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    @Override
    public List<CategoryDto> entitiesToDtosBasic(List<Category> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDtoBasic);
    }

    @Override
    public List<Category> dtosToEntitiesBasic(List<CategoryDto> dtos) {
        return mapperUtils.entitiesToDtos(dtos, this::dtoToEntityBasic);
    }
}
