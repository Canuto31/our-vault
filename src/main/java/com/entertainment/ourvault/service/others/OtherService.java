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

    //    BOOK
    List<BookDto> getAllBooks();

    Optional<BookDto> findBookById(int idBook);

    Optional<BookDto> findBookByName(String name);

    BookDto saveBook(BookDto bookDto);

    boolean deleteBookById(int idBook);

    //    GAME STORE
    List<GameStoreDto> getAllGameStores();

    Optional<GameStoreDto> findGameStoreById(int idGameStore);

    Optional<GameStoreDto> findGameStoreByName(String name);

    GameStoreDto saveGameStore(GameStoreDto gameStoreDto);

    boolean deleteGameStoreById(int idGameStore);

    //    VIDEOGAME
    List<VideogameDto> getAllVideogames();

    Optional<VideogameDto> findVideogameById(int idVideogame);

    Optional<VideogameDto> findVideogameByName(String name);

    VideogameDto saveVideogame(VideogameDto videogameDto);

    boolean deleteVideogameById(int idVideogame);

    //    STREAM PAGE
    List<StreamPageDto> getAllStreamPages();

    Optional<StreamPageDto> findStreamPageById(int idStreamPage);

    Optional<StreamPageDto> findStreamPageByName(String name);

    StreamPageDto saveStreamPage(StreamPageDto streamPageDto);

    boolean deleteStreamPageById(int idStreamPage);

    //    MOVIE
    List<MovieDto> getAllMovies();

    Optional<MovieDto> findMovieById(int idMovie);

    Optional<MovieDto> findMovieByName(String name);

    MovieDto saveMovie(MovieDto movieDto);

    boolean deleteMovieById(int idMovie);

    //    SERIE
    List<SerieDto> getAllSeries();

    Optional<SerieDto> findSerieById(int idSerie);

    Optional<SerieDto> findSerieByName(String name);

    SerieDto saveSerie(SerieDto serieDto);

    boolean deleteSerieById(int idSerie);

}
