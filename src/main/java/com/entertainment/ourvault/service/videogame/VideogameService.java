package com.entertainment.ourvault.service.videogame;

import com.entertainment.ourvault.model.dto.VideogameDto;

import java.util.List;
import java.util.Optional;

public interface VideogameService {

    List<VideogameDto> getAll();

    Optional<VideogameDto> findById(int idVideogame);

    Optional<VideogameDto> findByName(String name);

    VideogameDto save(VideogameDto videogameDto);

    boolean deleteById(int idVideogame);
}
