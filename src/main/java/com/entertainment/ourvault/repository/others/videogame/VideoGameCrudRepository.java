package com.entertainment.ourvault.repository.others.videogame;

import com.entertainment.ourvault.model.entity.GameStore;
import com.entertainment.ourvault.model.entity.Videogame;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface VideoGameCrudRepository extends CrudRepository<Videogame, Integer> {

    Optional<Videogame> findVideogameByName(String name);
}
