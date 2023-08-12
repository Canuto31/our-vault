package com.entertainment.ourvault.repository.others.movie;

import com.entertainment.ourvault.model.entity.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MovieCrudRepository extends CrudRepository<Movie, Integer> {

    Optional<Movie> findMovieByName(String name);
}
