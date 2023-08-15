package com.entertainment.ourvault.service.others;

import com.entertainment.ourvault.model.dto.*;

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

    AuthorDto saveAuthor(AuthorDto authorDto);

    boolean deleteAuthorById(int idAuthor);

    //    GAME STORE
    List<GameStoreDto> getAllGameStores();

    Optional<GameStoreDto> findGameStoreById(int idGameStore);

    Optional<GameStoreDto> findGameStoreByName(String name);

    GameStoreDto saveGameStore(GameStoreDto gameStoreDto);

    boolean deleteGameStoreById(int idGameStore);

    //    STREAM PAGE
    List<StreamPageDto> getAllStreamPages();

    Optional<StreamPageDto> findStreamPageById(int idStreamPage);

    Optional<StreamPageDto> findStreamPageByName(String name);

    StreamPageDto saveStreamPage(StreamPageDto streamPageDto);

    boolean deleteStreamPageById(int idStreamPage);

}
