package com.entertainment.ourvault.service.movie;

import com.entertainment.ourvault.model.dto.MovieDto;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    List<MovieDto> getAll();

    Optional<MovieDto> findById(int idMovie);

    Optional<MovieDto> findByName(String name);

    MovieDto save(MovieDto movieDto);

    boolean deleteById(int idMovie);
}
