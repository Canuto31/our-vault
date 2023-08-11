package com.entertainment.ourvault.repository.others.videogame;

import com.entertainment.ourvault.mapper.VideogameMapper;
import com.entertainment.ourvault.model.dto.VideogameDto;
import com.entertainment.ourvault.model.entity.Videogame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VideoGameRepositoryImpl implements VideoGameRepository{

    @Autowired
    private VideoGameCrudRepository repository;
    @Autowired
    private VideogameMapper mapper;

    @Override
    public List<VideogameDto> getAllVideogames() {
        List<Videogame> videogames = (List<Videogame>) repository.findAll();
        return mapper.entitiesToDtos(videogames);
    }

    @Override
    public Optional<VideogameDto> GetVideogameById(int idVideogame) {
        return repository.findById(idVideogame).map(videogame -> mapper.entityToDto(videogame));
    }

    @Override
    public Optional<VideogameDto> getVideogameByName(String name) {
        return repository.findVideogameByName(name).map(videogame -> mapper.entityToDto(videogame));
    }

    @Override
    public VideogameDto saveVideogame(VideogameDto videogameDto) {
        Videogame videogame = mapper.dtoToEntity(videogameDto);
        return mapper.entityToDto(repository.save(videogame));
    }

    @Override
    public void deleteVideogame(int idVideogame) {
        repository.deleteById(idVideogame);
    }
}
