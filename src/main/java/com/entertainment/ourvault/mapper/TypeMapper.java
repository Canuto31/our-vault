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
    private StateMapper mapper;

    @Lazy
    @Autowired
    private MapperUtils mapperUtils;

    @Override
    public TypeDto entityToDto(Type entity) {
        TypeDto dto = new TypeDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setStates(mapper.entitiesToDtosBasic(entity.getStates()));

        return dto;
    }

    @Override
    public Type dtoToEntity(TypeDto dto) {
        Type entity = new Type();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setStates(mapper.DtosToEntitiesBasic(dto.getStates()));

        return entity;
    }

    @Override
    public List<TypeDto> entitiesToDtos(List<Type> entities) {
//        List<TypeDto> dtos = new ArrayList<>();
//
//        for(Type entity : entities) {
//            dtos.add(entityToDto(entity));
//        }
//
//        return dtos;
        return mapperUtils.entitiesToDtos(entities, this::entityToDto);
    }

    @Override
    public List<Type> DtosToEntities(List<TypeDto> dtos) {
//        List<Type> entities = new ArrayList<>();
//
//        for(TypeDto dto : dtos) {
//            entities.add(dtoToEntity(dto));
//        }
//
//        return entities;
        return mapperUtils.entitiesToDtos(dtos, this::dtoToEntity);
    }

    public TypeDto entityToDtoBasic(Type entity) {
        TypeDto dto = new TypeDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    public Type dtoToEntityBasic(TypeDto dto) {
        Type entity = new Type();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    public List<TypeDto> entitiesToDtosBasic(List<Type> entities) {
//        List<TypeDto> dtos = new ArrayList<>();
//
//        for(Type entity : entities) {
//            dtos.add(entityToDtoBasic(entity));
//        }
//
//        return dtos;
        return mapperUtils.entitiesToDtos(entities, this::entityToDtoBasic);
    }

    public List<Type> DtosToEntitiesBasic(List<TypeDto> dtos) {
//        List<Type> entities = new ArrayList<>();
//
//        for(TypeDto dto : dtos) {
//            entities.add(dtoToEntityBasic(dto));
//        }
//
//        return entities;
        return mapperUtils.entitiesToDtos(dtos, this::dtoToEntityBasic);
    }
}
