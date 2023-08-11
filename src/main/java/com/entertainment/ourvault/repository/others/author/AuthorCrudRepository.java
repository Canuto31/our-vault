package com.entertainment.ourvault.repository.others.author;

import com.entertainment.ourvault.model.entity.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AuthorCrudRepository extends CrudRepository<Author, Integer> {

    Optional<Author> findAuthorByName(String name);
}
