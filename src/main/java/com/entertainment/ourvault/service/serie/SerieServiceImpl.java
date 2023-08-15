package com.entertainment.ourvault.service.serie;

import com.entertainment.ourvault.model.dto.SerieDto;
import com.entertainment.ourvault.repository.serie.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SerieServiceImpl implements SerieService{

    @Autowired
    private SerieRepository serieRepository;

    @Override
    public List<SerieDto> getAll() {
        return serieRepository.getAllSeries();
    }

    @Override
    public Optional<SerieDto> findById(int idSerie) {
        return serieRepository.GetSerieById(idSerie);
    }

    @Override
    public Optional<SerieDto> findByName(String name) {
        return serieRepository.getSerieByName(name);
    }

    @Override
    public SerieDto save(SerieDto serieDto) {
        return serieRepository.saveSerie(serieDto);
    }

    @Override
    public boolean deleteById(int idSerie) {
        return this.findById(idSerie).map(serie -> {
            serieRepository.deleteSerie(idSerie);
            return true;
        }).orElse(false);
    }
}
