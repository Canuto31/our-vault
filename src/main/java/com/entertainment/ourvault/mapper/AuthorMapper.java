package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.mapper.utils.BaseMapper;
import com.entertainment.ourvault.mapper.utils.MapperUtils;
import com.entertainment.ourvault.model.dto.AuthorDto;
import com.entertainment.ourvault.model.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorMapper implements BaseMapper<AuthorDto, Author> {

    @Lazy
    @Autowired
    private MapperUtils mapperUtils;

    @Override
    public AuthorDto entityToDto(Author entity) {
        AuthorDto dto = new AuthorDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    @Override
    public Author dtoToEntity(AuthorDto dto) {
        Author entity = new Author();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    @Override
    public List<AuthorDto> entitiesToDtos(List<Author> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDto);
    }

    @Override
    public List<Author> DtosToEntities(List<AuthorDto> dtos) {
        return mapperUtils.entitiesToDtos(dtos, this::dtoToEntity);
    }
}
