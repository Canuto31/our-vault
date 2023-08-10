package com.entertainment.ourvault.mapper;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import com.entertainment.ourvault.model.dto.TypeDto;
import com.entertainment.ourvault.model.entity.Type;

@Component
public class TypeMapper implements BaseMapper<TypeDto, Type>{
    @Override
    public TypeDto entityToDto(Type entity) {
        TypeDto dto = new TypeDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    @Override
    public Type dtoToEntity(TypeDto dto) {
        Type entity = new Type();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    @Override
    public List<TypeDto> entitiesToDtos(List<Type> entities) {
        List<TypeDto> dtos = new ArrayList<>();

        for(Type entity : entities) {
            dtos.add(entityToDto(entity));
        }

        return dtos;
    }

    @Override
    public List<Type> DtosToEntities(List<TypeDto> dtos) {
        List<Type> entities = new ArrayList<>();

        for(TypeDto dto : dtos) {
            entities.add(dtoToEntity(dto));
        }

        return entities;
    }
}
