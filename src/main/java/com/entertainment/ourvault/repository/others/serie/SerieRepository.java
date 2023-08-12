package com.entertainment.ourvault.repository.others.serie;

import com.entertainment.ourvault.model.dto.SerieDto;

import java.util.List;
import java.util.Optional;

public interface SerieRepository {

    List<SerieDto> getAllSeries();

    Optional<SerieDto> GetSerieById(int idSerie);

    Optional<SerieDto> getSerieByName(String name);

    SerieDto saveSerie(SerieDto serieDto);

    void deleteSerie(int idSerie);
}
