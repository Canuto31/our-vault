package com.entertainment.ourvault.mapper;

import com.entertainment.ourvault.mapper.utils.BaseMapper;
import com.entertainment.ourvault.mapper.utils.MapperUtils;
import com.entertainment.ourvault.model.dto.BookDto;
import com.entertainment.ourvault.model.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookMapper implements BaseMapper<BookDto, Book> {

    @Lazy
    @Autowired
    private MapperUtils mapperUtils;

    @Lazy
    @Autowired
    private CategoryMapper categoryMapper;

    @Lazy
    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public BookDto entityToDto(Book entity) {
        BookDto dto = new BookDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        dto.setImage(entity.getImage());
        dto.setPagesAmount(entity.getPagesAmount());
        dto.setRate(entity.getRate());

        dto.setCategory(categoryMapper.entityToDtoBasic(entity.getCategory()));
        dto.setAuthor(authorMapper.entityToDtoBasic(entity.getAuthor()));

        return dto;
    }

    @Override
    public Book dtoToEntity(BookDto dto) {
        Book entity = new Book();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setImage(dto.getImage());
        entity.setPagesAmount(dto.getPagesAmount());
        entity.setRate(dto.getRate());

        entity.setCategory(categoryMapper.dtoToEntityBasic(dto.getCategory()));
        entity.setAuthor(authorMapper.dtoToEntityBasic(dto.getAuthor()));

        return entity;
    }

    @Override
    public List<BookDto> entitiesToDtos(List<Book> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDto);
    }

    @Override
    public List<Book> DtosToEntities(List<BookDto> dtos) {
        return mapperUtils.dtosToEntities(dtos, this::dtoToEntity);
    }

    public BookDto entityToDtoBasic(Book entity) {
        BookDto dto = new BookDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        dto.setImage(entity.getImage());
        dto.setPagesAmount(entity.getPagesAmount());
        dto.setRate(entity.getRate());

        return dto;
    }

    public Book dtoToEntityBasic(BookDto dto) {
        Book entity = new Book();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setImage(dto.getImage());
        entity.setPagesAmount(dto.getPagesAmount());
        entity.setRate(dto.getRate());

        return entity;
    }

    public List<BookDto> entitiesToDtosBasic(List<Book> entities) {
        return mapperUtils.entitiesToDtos(entities, this::entityToDtoBasic);
    }

    public List<Book> DtosToEntitiesBasic(List<BookDto> dtos) {
        return mapperUtils.dtosToEntities(dtos, this::dtoToEntityBasic);
    }
}
