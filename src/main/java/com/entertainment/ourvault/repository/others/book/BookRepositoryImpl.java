package com.entertainment.ourvault.repository.others.book;

import com.entertainment.ourvault.mapper.BookMapper;
import com.entertainment.ourvault.model.dto.BookDto;
import com.entertainment.ourvault.model.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookRepositoryImpl implements BookRepository{

    @Autowired
    private BookCrudRepository repository;
    @Autowired
    private BookMapper mapper;

    @Override
    public List<BookDto> getAllBooks() {
        List<Book> books = (List<Book>) repository.findAll();
        return mapper.entitiesToDtos(books);
    }

    @Override
    public Optional<BookDto> GetBookById(int idBook) {
        return repository.findById(idBook).map(book -> mapper.entityToDto(book));
    }

    @Override
    public Optional<BookDto> getBookByName(String name) {
        return repository.findBookByName(name).map(book -> mapper.entityToDto(book));
    }

    @Override
    public BookDto saveBook(BookDto bookDto) {
        Book book = mapper.dtoToEntity(bookDto);
        return mapper.entityToDto(repository.save(book));
    }

    @Override
    public void deleteBook(int idBook) {
        repository.deleteById(idBook);
    }
}
