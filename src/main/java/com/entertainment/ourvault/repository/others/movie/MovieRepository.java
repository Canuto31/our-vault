package com.entertainment.ourvault.repository.others.movie;

import com.entertainment.ourvault.model.dto.MovieDto;

import java.util.List;
import java.util.Optional;

public interface MovieRepository {

    List<MovieDto> getAllMovies();

    Optional<MovieDto> GetMovieById(int idMovie);

    Optional<MovieDto> getMovieByName(String name);

    MovieDto saveMovie(MovieDto movieDto);

    void deleteMovie(int idMovie);
}
