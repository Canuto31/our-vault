package com.entertainment.ourvault.repository.others.author;

import com.entertainment.ourvault.mapper.AuthorMapper;
import com.entertainment.ourvault.model.dto.AuthorDto;
import com.entertainment.ourvault.model.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository{

    @Autowired
    private AuthorCrudRepository repository;
    @Autowired
    private AuthorMapper mapper;

    @Override
    public List<AuthorDto> getAllAuthors() {
        List<Author> authors = (List<Author>) repository.findAll();
        return mapper.entitiesToDtos(authors);
    }

    @Override
    public Optional<AuthorDto> GetAuthorById(int idAuthor) {
        return repository.findById(idAuthor).map(author -> mapper.entityToDto(author));
    }

    @Override
    public Optional<AuthorDto> getAuthorByName(String name) {
        return repository.findAuthorByName(name).map(author -> mapper.entityToDto(author));
    }

    @Override
    public AuthorDto saveAuthor(AuthorDto authorDto) {
        Author author = mapper.dtoToEntity(authorDto);
        return mapper.entityToDto(repository.save(author));
    }

    @Override
    public void deleteAuthor(int idAuthor) {
        repository.deleteById(idAuthor);
    }
}
