package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.mapper.utils.BaseMapper;
import com.entertainment.ourvault.mapper.utils.MapperUtils;
import com.entertainment.ourvault.model.dto.VideogameDto;
import com.entertainment.ourvault.model.entity.Videogame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class VideogameMapper implements BaseMapper<VideogameDto, Videogame> {
    
    @Lazy
    @Autowired
    private MapperUtils mapperUtils;

    @Lazy
    @Autowired
    private CategoryMapper categoryMapper;

    @Lazy
    @Autowired
    private GameStoreMapper gameStoreMapper;

    @Lazy
    @Autowired
    private StateMapper stateMapper;
    
    @Override
    public VideogameDto entityToDto(Videogame entity) {
        VideogameDto dto = new VideogameDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        dto.setImage(entity.getImage());
        dto.setTrailer(entity.getTrailer());
        dto.setRate(entity.getRate());

        dto.setCategory(categoryMapper.entityToDtoBasic(entity.getCategory()));
        dto.setGameStore(gameStoreMapper.entityToDtoBasic(entity.getGameStore()));
        dto.setState(stateMapper.entityToDtoBasic(entity.getState()));

        return dto;
    }

    @Override
    public Videogame dtoToEntity(VideogameDto dto) {
        Videogame entity = new Videogame();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setImage(dto.getImage());
        entity.setTrailer(dto.getTrailer());
        entity.setRate(dto.getRate());

        entity.setCategory(categoryMapper.dtoToEntityBasic(dto.getCategory()));
        entity.setGameStore(gameStoreMapper.dtoToEntityBasic(dto.getGameStore()));
        entity.setState(stateMapper.dtoToEntityBasic(dto.getState()));

        return entity;
    }

    @Override
    public List<VideogameDto> entitiesToDtos(List<Videogame> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDto);
    }

    @Override
    public List<Videogame> dtosToEntities(List<VideogameDto> dtos) {
        return mapperUtils.dtosToEntities(dtos, this::dtoToEntity);
    }

    @Override
    public VideogameDto entityToDtoBasic(Videogame entity) {
        VideogameDto dto = new VideogameDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        dto.setImage(entity.getImage());
        dto.setTrailer(entity.getTrailer());
        dto.setRate(entity.getRate());

        return dto;
    }

    @Override
    public Videogame dtoToEntityBasic(VideogameDto dto) {
        Videogame entity = new Videogame();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setImage(dto.getImage());
        entity.setTrailer(dto.getTrailer());
        entity.setRate(dto.getRate());

        return entity;
    }

    @Override
    public List<VideogameDto> entitiesToDtosBasic(List<Videogame> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDtoBasic);
    }

    @Override
    public List<Videogame> dtosToEntitiesBasic(List<VideogameDto> dtos) {
        return mapperUtils.dtosToEntities(dtos, this::dtoToEntityBasic);
    }
}
