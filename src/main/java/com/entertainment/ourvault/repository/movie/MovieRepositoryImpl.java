package com.entertainment.ourvault.repository.movie;

import com.entertainment.ourvault.mapper.MovieMapper;
import com.entertainment.ourvault.model.dto.MovieDto;
import com.entertainment.ourvault.model.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepositoryImpl implements MovieRepository{

    @Autowired
    private MovieCrudRepository repository;
    @Autowired
    private MovieMapper mapper;

    @Override
    public List<MovieDto> getAllMovies() {
        List<Movie> movies = (List<Movie>) repository.findAll();
        return mapper.entitiesToDtos(movies);
    }

    @Override
    public Optional<MovieDto> GetMovieById(int idMovie) {
        return repository.findById(idMovie).map(movie -> mapper.entityToDto(movie));
    }

    @Override
    public Optional<MovieDto> getMovieByName(String name) {
        return repository.findMovieByName(name).map(movie -> mapper.entityToDto(movie));
    }

    @Override
    public MovieDto saveMovie(MovieDto movieDto) {
        Movie movie = mapper.dtoToEntity(movieDto);
        return mapper.entityToDto(repository.save(movie));
    }

    @Override
    public void deleteMovie(int idMovie) {
        repository.deleteById(idMovie);
    }
}
