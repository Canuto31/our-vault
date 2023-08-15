package com.entertainment.ourvault.repository.book;

import com.entertainment.ourvault.model.entity.Book;
import com.entertainment.ourvault.model.entity.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface BookCrudRepository extends CrudRepository<Book, Integer> {

    Optional<Book> findBookByName(String name);
}
