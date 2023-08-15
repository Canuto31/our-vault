package com.entertainment.ourvault.service.movie;

import com.entertainment.ourvault.model.dto.MovieDto;
import com.entertainment.ourvault.repository.movie.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<MovieDto> getAll() {
        return movieRepository.getAllMovies();
    }

    @Override
    public Optional<MovieDto> findById(int idMovie) {
        return movieRepository.GetMovieById(idMovie);
    }

    @Override
    public Optional<MovieDto> findByName(String name) {
        return movieRepository.getMovieByName(name);
    }

    @Override
    public MovieDto save(MovieDto movieDto) {
        return movieRepository.saveMovie(movieDto);
    }

    @Override
    public boolean deleteById(int idMovie) {
        return this.findById(idMovie).map(movie -> {
            movieRepository.deleteMovie(idMovie);
            return true;
        }).orElse(false);
    }
}
