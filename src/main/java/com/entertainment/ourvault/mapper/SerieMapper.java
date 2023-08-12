package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.mapper.utils.BaseMapper;
import com.entertainment.ourvault.mapper.utils.MapperUtils;
import com.entertainment.ourvault.model.dto.SerieDto;
import com.entertainment.ourvault.model.entity.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SerieMapper implements BaseMapper<SerieDto, Serie> {

    @Lazy
    @Autowired
    private MapperUtils mapperUtils;

    @Lazy
    @Autowired
    private CategoryMapper categoryMapper;

    @Lazy
    @Autowired
    private StateMapper stateMapper;

    @Lazy
    @Autowired
    private StreamPageMapper streamPageMapper;

    @Override
    public SerieDto entityToDto(Serie entity) {
        SerieDto dto = new SerieDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSeasons(entity.getSeasons());
        dto.setChapterForSeason(entity.getChapterForSeason());
        dto.setDurationForChapter(entity.getDurationForChapter());
        dto.setImage(entity.getImage());
        dto.setTrailer(entity.getTrailer());
        dto.setCurrentlySeason(entity.getCurrentlySeason());
        dto.setCurrentlyChapter(entity.getCurrentlyChapter());
        dto.setRate(entity.getRate());

        dto.setCategory(categoryMapper.entityToDtoBasic(entity.getCategory()));
        dto.setState(stateMapper.entityToDtoBasic(entity.getState()));
        dto.setStreamPage(streamPageMapper.entityToDtoBasic(entity.getStreamPage()));

        return dto;
    }

    @Override
    public Serie dtoToEntity(SerieDto dto) {
        Serie entity = new Serie();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setSeasons(dto.getSeasons());
        entity.setChapterForSeason(dto.getChapterForSeason());
        entity.setDurationForChapter(dto.getDurationForChapter());
        entity.setImage(dto.getImage());
        entity.setTrailer(dto.getTrailer());
        entity.setCurrentlySeason(dto.getCurrentlySeason());
        entity.setCurrentlyChapter(dto.getCurrentlyChapter());
        entity.setRate(dto.getRate());

        entity.setCategory(categoryMapper.dtoToEntityBasic(dto.getCategory()));
        entity.setState(stateMapper.dtoToEntityBasic(dto.getState()));
        entity.setStreamPage(streamPageMapper.dtoToEntityBasic(dto.getStreamPage()));

        return entity;
    }

    @Override
    public List<SerieDto> entitiesToDtos(List<Serie> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDto);
    }

    @Override
    public List<Serie> dtosToEntities(List<SerieDto> dtos) {
        return mapperUtils.dtosToEntities(dtos, this::dtoToEntity);
    }

    @Override
    public SerieDto entityToDtoBasic(Serie entity) {
        SerieDto dto = new SerieDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSeasons(entity.getSeasons());
        dto.setChapterForSeason(entity.getChapterForSeason());
        dto.setDurationForChapter(entity.getDurationForChapter());
        dto.setImage(entity.getImage());
        dto.setTrailer(entity.getTrailer());
        dto.setCurrentlySeason(entity.getCurrentlySeason());
        dto.setCurrentlyChapter(entity.getCurrentlyChapter());
        dto.setRate(entity.getRate());

        return dto;
    }

    @Override
    public Serie dtoToEntityBasic(SerieDto dto) {
        Serie entity = new Serie();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setSeasons(dto.getSeasons());
        entity.setChapterForSeason(dto.getChapterForSeason());
        entity.setDurationForChapter(dto.getDurationForChapter());
        entity.setImage(dto.getImage());
        entity.setTrailer(dto.getTrailer());
        entity.setCurrentlySeason(dto.getCurrentlySeason());
        entity.setCurrentlyChapter(dto.getCurrentlyChapter());
        entity.setRate(dto.getRate());

        return entity;
    }

    @Override
    public List<SerieDto> entitiesToDtosBasic(List<Serie> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDtoBasic);
    }

    @Override
    public List<Serie> dtosToEntitiesBasic(List<SerieDto> dtos) {
        return mapperUtils.dtosToEntities(dtos, this::dtoToEntityBasic);
    }
}
