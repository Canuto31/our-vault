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

    @Override
    public BookDto entityToDto(Book entity) {
        BookDto dto = new BookDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setPrice(entity.getPrice());
        dto.setImage(entity.getImage());
        dto.setRate(entity.getRate());

        return dto;
    }

    @Override
    public Book dtoToEntity(BookDto dto) {
        Book entity = new Book();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setImage(dto.getImage());
        entity.setRate(dto.getRate());

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
}
