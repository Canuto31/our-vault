package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.mapper.utils.BaseMapper;
import com.entertainment.ourvault.mapper.utils.MapperUtils;
import com.entertainment.ourvault.model.dto.StateDto;
import com.entertainment.ourvault.model.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StateMapper implements BaseMapper<StateDto, State> {

    @Lazy
    @Autowired
    private TypeMapper mapper;

    @Lazy
    @Autowired
    private MapperUtils mapperUtils;

    @Override
    public StateDto entityToDto(State entity) {
        StateDto dto = new StateDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setTypes(mapper.entitiesToDtosBasic(entity.getTypes()));

        return dto;
    }

    @Override
    public State dtoToEntity(StateDto dto) {
        State entity = new State();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setTypes(mapper.DtosToEntitiesBasic(dto.getTypes()));

        return entity;
    }

    @Override
    public List<StateDto> entitiesToDtos(List<State> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDto);
    }

    @Override
    public List<State> DtosToEntities(List<StateDto> dtos) {
        return mapperUtils.entitiesToDtos(dtos, this::dtoToEntity);
    }

    public StateDto entityToDtoBasic(State entity) {
        StateDto dto = new StateDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    public State dtoToEntityBasic(StateDto dto) {
        State entity = new State();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    public List<StateDto> entitiesToDtosBasic(List<State> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDtoBasic);
    }

    public List<State> DtosToEntitiesBasic(List<StateDto> dtos) {
        return mapperUtils.entitiesToDtos(dtos, this::dtoToEntityBasic);
    }
}
