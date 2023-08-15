package com.entertainment.ourvault.repository.videogame;

import com.entertainment.ourvault.model.dto.VideogameDto;

import java.util.List;
import java.util.Optional;

public interface VideoGameRepository {

    List<VideogameDto> getAllVideogames();

    Optional<VideogameDto> GetVideogameById(int idVideogame);

    Optional<VideogameDto> getVideogameByName(String name);

    VideogameDto saveVideogame(VideogameDto videogameDto);

    void deleteVideogame(int idVideogame);
}
