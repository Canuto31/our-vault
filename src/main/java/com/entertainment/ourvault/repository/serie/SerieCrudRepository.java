package com.entertainment.ourvault.repository.serie;

import com.entertainment.ourvault.model.entity.Movie;
import com.entertainment.ourvault.model.entity.Serie;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SerieCrudRepository extends CrudRepository<Serie, Integer> {

    Optional<Serie> findSerieByName(String name);
}
