package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.mapper.utils.BaseMapper;
import com.entertainment.ourvault.mapper.utils.MapperUtils;
import com.entertainment.ourvault.model.dto.GameStoreDto;
import com.entertainment.ourvault.model.entity.GameStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameStoreMapper implements BaseMapper<GameStoreDto, GameStore> {

    @Lazy
    @Autowired
    private MapperUtils mapperUtils;

    @Lazy
    @Autowired
    private VideogameMapper videogameMapper;

    @Override
    public GameStoreDto entityToDto(GameStore entity) {
        GameStoreDto dto = new GameStoreDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        dto.setVideogames(videogameMapper.entitiesToDtosBasic(entity.getVideogames()));

        return dto;
    }

    @Override
    public GameStore dtoToEntity(GameStoreDto dto) {
        GameStore entity = new GameStore();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        entity.setVideogames(videogameMapper.dtosToEntitiesBasic(dto.getVideogames()));

        return entity;
    }

    @Override
    public List<GameStoreDto> entitiesToDtos(List<GameStore> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDto);
    }

    @Override
    public List<GameStore> dtosToEntities(List<GameStoreDto> dtos) {
        return mapperUtils.dtosToEntities(dtos, this::dtoToEntity);
    }

    @Override
    public GameStoreDto entityToDtoBasic(GameStore entity) {
        GameStoreDto dto = new GameStoreDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    @Override
    public GameStore dtoToEntityBasic(GameStoreDto dto) {
        GameStore entity = new GameStore();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    @Override
    public List<GameStoreDto> entitiesToDtosBasic(List<GameStore> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDtoBasic);
    }

    @Override
    public List<GameStore> dtosToEntitiesBasic(List<GameStoreDto> dtos) {
        return mapperUtils.dtosToEntities(dtos, this::dtoToEntityBasic);
    }
}
