package com.entertainment.ourvault.service.book;

import com.entertainment.ourvault.model.dto.BookDto;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<BookDto> getAll();

    Optional<BookDto> findById(int idBook);

    Optional<BookDto> findByName(String name);

    BookDto save(BookDto bookDto);

    boolean deleteById(int idBook);
}
