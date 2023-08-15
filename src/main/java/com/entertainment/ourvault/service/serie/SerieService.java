package com.entertainment.ourvault.service.serie;

import com.entertainment.ourvault.model.dto.SerieDto;

import java.util.List;
import java.util.Optional;

public interface SerieService {

    List<SerieDto> getAll();

    Optional<SerieDto> findById(int idSerie);

    Optional<SerieDto> findByName(String name);

    SerieDto save(SerieDto serieDto);

    boolean deleteById(int idSerie);
}
