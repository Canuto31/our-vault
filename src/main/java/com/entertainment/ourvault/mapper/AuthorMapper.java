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

    @Lazy
    @Autowired
    private BookMapper bookMapper;

    @Override
    public AuthorDto entityToDto(Author entity) {
        AuthorDto dto = new AuthorDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        dto.setBooks(bookMapper.entitiesToDtosBasic(entity.getBooks()));

        return dto;
    }

    @Override
    public Author dtoToEntity(AuthorDto dto) {
        Author entity = new Author();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        entity.setBooks(bookMapper.DtosToEntitiesBasic(dto.getBooks()));

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

    public AuthorDto entityToDtoBasic(Author entity) {
        AuthorDto dto = new AuthorDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());

        return dto;
    }

    public Author dtoToEntityBasic(AuthorDto dto) {
        Author entity = new Author();

        entity.setId(dto.getId());
        entity.setName(dto.getName());

        return entity;
    }

    public List<AuthorDto> entitiesToDtosBasic(List<Author> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDtoBasic);
    }

    public List<Author> DtosToEntitiesBasic(List<AuthorDto> dtos) {
        return mapperUtils.entitiesToDtos(dtos, this::dtoToEntityBasic);
    }
}
