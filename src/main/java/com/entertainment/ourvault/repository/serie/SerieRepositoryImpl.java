package com.entertainment.ourvault.repository.serie;

import com.entertainment.ourvault.mapper.SerieMapper;
import com.entertainment.ourvault.model.dto.SerieDto;
import com.entertainment.ourvault.model.entity.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class SerieRepositoryImpl implements SerieRepository{

    @Autowired
    private SerieCrudRepository repository;
    @Autowired
    private SerieMapper mapper;

    @Override
    public List<SerieDto> getAllSeries() {
        List<Serie> series = (List<Serie>) repository.findAll();
        return mapper.entitiesToDtos(series);
    }

    @Override
    public Optional<SerieDto> GetSerieById(int idSerie) {
        return repository.findById(idSerie).map(serie -> mapper
                .entityToDto(serie));
    }

    @Override
    public Optional<SerieDto> getSerieByName(String name) {
        return repository.findSerieByName(name).map(serie -> mapper
                .entityToDto(serie));
    }

    @Override
    public SerieDto saveSerie(SerieDto serieDto) {
        Serie serie = mapper.dtoToEntity(serieDto);
        return mapper.entityToDto(repository.save(serie));
    }

    @Override
    public void deleteSerie(int idSerie) {
        repository.deleteById(idSerie);
    }
}
