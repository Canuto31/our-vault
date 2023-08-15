package com.entertainment.ourvault.service.videogame;

import com.entertainment.ourvault.model.dto.VideogameDto;
import com.entertainment.ourvault.repository.videogame.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideogameServiceImpl implements VideogameService{

    @Autowired
    private VideoGameRepository videoGameRepository;

    @Override
    public List<VideogameDto> getAll() {
        return videoGameRepository.getAllVideogames();
    }

    @Override
    public Optional<VideogameDto> findById(int idVideogame) {
        return videoGameRepository.GetVideogameById(idVideogame);
    }

    @Override
    public Optional<VideogameDto> findByName(String name) {
        return videoGameRepository.getVideogameByName(name);
    }

    @Override
    public VideogameDto save(VideogameDto videogameDto) {
        return videoGameRepository.saveVideogame(videogameDto);
    }

    @Override
    public boolean deleteById(int idVideogame) {
        return this.findById(idVideogame).map(videogame -> {
            videoGameRepository.deleteVideogame(idVideogame);
            return true;
        }).orElse(false);
    }
}
