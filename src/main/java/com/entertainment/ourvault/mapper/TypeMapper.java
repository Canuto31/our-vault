package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.mapper.utils.BaseMapper;
import com.entertainment.ourvault.mapper.utils.MapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

import com.entertainment.ourvault.model.dto.TypeDto;
import com.entertainment.ourvault.model.entity.Type;

@Component
public class TypeMapper implements BaseMapper<TypeDto, Type> {

    @Lazy
    @Autowired
    private StateMapper stateMapper;

    @Lazy
    @Autowired
    private CategoryMapper categoryMapper;

    @Lazy
    @Autowired
    private MapperUtils mapperUtils;

    @Override
    public TypeDto entityToDto(Type entity) {
        TypeDto dto = new TypeDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setStates(stateMapper.entitiesToDtosBasic(entity.getStates()));
        dto.setCategories(categoryMapper.entitiesToDtos(entity.getCategories()));

        return dto;
    }

    @Override
    public Type dtoToEntity(TypeDto dto) {
        Type entity = new Type();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setStates(stateMapper.dtosToEntitiesBasic(dto.getStates()));
        entity.setCategories(categoryMapper.dtosToEntities(dto.getCategories()));

        return entity;
    }

    @Override
    public List<TypeDto> entitiesToDtos(List<Type> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDto);
    }

    @Override
    public List<Type> dtosToEntities(List<TypeDto> dtos) {
        return mapperUtils.entitiesToDtos(dtos, this::dtoToEntity);
    }

    @Override
    public TypeDto entityToDtoBasic(Type entity) {
        TypeDto dto = new TypeDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    @Override
    public Type dtoToEntityBasic(TypeDto dto) {
        Type entity = new Type();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    @Override
    public List<TypeDto> entitiesToDtosBasic(List<Type> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDtoBasic);
    }

    @Override
    public List<Type> dtosToEntitiesBasic(List<TypeDto> dtos) {
        return mapperUtils.entitiesToDtos(dtos, this::dtoToEntityBasic);
    }
}
