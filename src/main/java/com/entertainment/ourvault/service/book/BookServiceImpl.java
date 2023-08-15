package com.entertainment.ourvault.service.book;

import com.entertainment.ourvault.model.dto.BookDto;
import com.entertainment.ourvault.repository.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookDto> getAll() {
        return bookRepository.getAllBooks();
    }

    @Override
    public Optional<BookDto> findById(int idBook) {
        return bookRepository.GetBookById(idBook);
    }

    @Override
    public Optional<BookDto> findByName(String name) {
        return bookRepository.getBookByName(name);
    }

    @Override
    public BookDto save(BookDto bookDto) {
        return bookRepository.saveBook(bookDto);
    }

    @Override
    public boolean deleteById(int idBook) {
        return this.findById(idBook).map(book -> {
            bookRepository.deleteBook(idBook);
            return true;
        }).orElse(false);
    }
}
