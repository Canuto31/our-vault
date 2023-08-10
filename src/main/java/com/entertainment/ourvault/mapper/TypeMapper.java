package com.entertainment.ourvault.mapper;

import org.springframework.stereotype.Component;

import java.util.List;

//import com.entertainment.ourvault.model.dto.TypeDto;
//import com.entertainment.ourvault.model.entity.Type;

@Component
public class TypeMapper implements BaseMapper<TypeDto, Type>{
    @Override
    public TypeDto entityToDto(Type entity) {
        return null;
    }

    @Override
    public Type dtoToEntity(TypeDto dto) {
        return null;
    }

    @Override
    public List<TypeDto> entitiesToDtos(List<Type> entities) {
        return null;
    }

    @Override
    public List<Type> DtosToEntities(List<TypeDto> dtos) {
        return null;
    }
}
