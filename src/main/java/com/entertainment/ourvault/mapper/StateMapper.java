package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.model.dto.StateDto;
import com.entertainment.ourvault.model.entity.State;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StateMapper implements BaseMapper<StateDto, State> {
    @Override
    public StateDto entityToDto(State entity) {
        StateDto dto = new StateDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    @Override
    public State dtoToEntity(StateDto dto) {
        State entity = new State();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    @Override
    public List<StateDto> entitiesToDtos(List<State> entities) {
        List<StateDto> dtos = new ArrayList<>();

        for(State entity : entities) {
            dtos.add(entityToDto(entity));
        }

        return dtos;
    }

    @Override
    public List<State> DtosToEntities(List<StateDto> dtos) {
        List<State> entities = new ArrayList<>();

        for(StateDto dto : dtos) {
            entities.add(dtoToEntity(dto));
        }

        return entities;
    }
}
