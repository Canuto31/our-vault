package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.mapper.utils.BaseMapper;
import com.entertainment.ourvault.mapper.utils.MapperUtils;
import com.entertainment.ourvault.model.dto.MovieDto;
import com.entertainment.ourvault.model.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieMapper implements BaseMapper<MovieDto, Movie> {

    @Lazy
    @Autowired
    private MapperUtils mapperUtils;

    @Override
    public MovieDto entityToDto(Movie entity) {
        MovieDto dto = new MovieDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDuration(entity.getDuration());
        dto.setImage(entity.getImage());
        dto.setTrailer(entity.getTrailer());
        dto.setRate(entity.getRate());

        return dto;
    }

    @Override
    public Movie dtoToEntity(MovieDto dto) {
        Movie entity = new Movie();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDuration(dto.getDuration());
        entity.setImage(dto.getImage());
        entity.setTrailer(dto.getTrailer());
        entity.setRate(dto.getRate());

        return entity;
    }

    @Override
    public List<MovieDto> entitiesToDtos(List<Movie> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDto);
    }

    @Override
    public List<Movie> dtosToEntities(List<MovieDto> dtos) {
        return mapperUtils.dtosToEntities(dtos, this::dtoToEntity);
    }

    @Override
    public MovieDto entityToDtoBasic(Movie entity) {
        MovieDto dto = new MovieDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDuration(entity.getDuration());
        dto.setImage(entity.getImage());
        dto.setTrailer(entity.getTrailer());
        dto.setRate(entity.getRate());

        return dto;
    }

    @Override
    public Movie dtoToEntityBasic(MovieDto dto) {
        Movie entity = new Movie();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDuration(dto.getDuration());
        entity.setImage(dto.getImage());
        entity.setTrailer(dto.getTrailer());
        entity.setRate(dto.getRate());

        return entity;
    }

    @Override
    public List<MovieDto> entitiesToDtosBasic(List<Movie> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDtoBasic);
    }

    @Override
    public List<Movie> dtosToEntitiesBasic(List<MovieDto> dtos) {
        return mapperUtils.dtosToEntities(dtos, this::dtoToEntityBasic);
    }
}
