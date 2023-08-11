package com.entertainment.ourvault.repository.others.author;

import com.entertainment.ourvault.model.dto.AuthorDto;

import java.util.List;
import java.util.Optional;

public interface AuthorRepository {

    List<AuthorDto> getAllAuthor();

    Optional<AuthorDto> GetAuthorById(int idAuthor);

    Optional<AuthorDto> getAuthorByName(String name);

    AuthorDto saveAuthor(AuthorDto authorDto);

    void deleteAuthor(int idAuthor);
}
