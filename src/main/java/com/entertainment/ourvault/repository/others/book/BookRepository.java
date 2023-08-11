package com.entertainment.ourvault.repository.others.book;

import com.entertainment.ourvault.model.dto.BookDto;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

    List<BookDto> getAllBooks();

    Optional<BookDto> GetBookById(int idBook);

    Optional<BookDto> getBookByName(String name);

    BookDto saveBook(BookDto bookDto);

    void deleteBook(int idBook);
}
