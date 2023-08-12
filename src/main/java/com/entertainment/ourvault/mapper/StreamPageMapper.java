package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.mapper.utils.BaseMapper;
import com.entertainment.ourvault.mapper.utils.MapperUtils;
import com.entertainment.ourvault.model.dto.StreamPageDto;
import com.entertainment.ourvault.model.entity.StreamPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StreamPageMapper implements BaseMapper<StreamPageDto, StreamPage> {

    @Lazy
    @Autowired
    private MapperUtils mapperUtils;

    @Override
    public StreamPageDto entityToDto(StreamPage entity) {
        StreamPageDto dto = new StreamPageDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    @Override
    public StreamPage dtoToEntity(StreamPageDto dto) {
        StreamPage entity = new StreamPage();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    @Override
    public List<StreamPageDto> entitiesToDtos(List<StreamPage> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDto);
    }

    @Override
    public List<StreamPage> dtosToEntities(List<StreamPageDto> dtos) {
        return mapperUtils.dtosToEntities(dtos, this::dtoToEntity);
    }

    @Override
    public StreamPageDto entityToDtoBasic(StreamPage entity) {
        StreamPageDto dto = new StreamPageDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    @Override
    public StreamPage dtoToEntityBasic(StreamPageDto dto) {
        StreamPage entity = new StreamPage();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    @Override
    public List<StreamPageDto> entitiesToDtosBasic(List<StreamPage> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDtoBasic);
    }

    @Override
    public List<StreamPage> dtosToEntitiesBasic(List<StreamPageDto> dtos) {
        return mapperUtils.dtosToEntities(dtos, this::dtoToEntityBasic);
    }
}
