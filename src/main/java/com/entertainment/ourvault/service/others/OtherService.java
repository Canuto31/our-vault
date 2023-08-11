package com.entertainment.ourvault.service.others;

import com.entertainment.ourvault.model.dto.AuthorDto;
import com.entertainment.ourvault.model.dto.StateDto;
import com.entertainment.ourvault.model.dto.CategoryDto;
import com.entertainment.ourvault.model.dto.TypeDto;

import java.util.List;
import java.util.Optional;

public interface OtherService {

//    TYPE

    List<TypeDto> getAllTypes();

    Optional<TypeDto> findTypeById(int idType);

    Optional<TypeDto> findTypeByName(String typename);

    TypeDto saveType(TypeDto typeDto);

    boolean deleteTypeById(int idType);

    //    STATE
    List<StateDto> getAllStates();

    Optional<StateDto> findStateById(int idState);

    Optional<StateDto> findStateByName(String name);

    StateDto saveState(StateDto stateDto);

    boolean deleteStateById(int idState);

    //    CATEGORY
    List<CategoryDto> getAllCategories();

    Optional<CategoryDto> findCategoryById(int idCategory);

    Optional<CategoryDto> findCategoryByName(String name);

    CategoryDto saveCategory(CategoryDto categoryDto);

    boolean deleteCategoryById(int idCategory);

    //    AUTHOR
    List<AuthorDto> getAllAuthors();

    Optional<AuthorDto> findAuthorById(int idAuthor);

    Optional<AuthorDto> findAuthorByName(String name);

    CategoryDto saveAuthor(AuthorDto authorDto);

    boolean deleteAuthorById(int idAuthor);
}
