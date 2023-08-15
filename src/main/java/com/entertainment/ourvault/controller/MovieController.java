package com.entertainment.ourvault.controller;

import com.entertainment.ourvault.model.dto.MovieDto;
import com.entertainment.ourvault.service.movie.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping()
    private ResponseEntity<List<MovieDto>> getAllMovies() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    private ResponseEntity<MovieDto> getMovieByid(@PathVariable int id) {
        return service.findById(id).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/name/{name}")
    private ResponseEntity<MovieDto> getMovieByName(@PathVariable String name) {
        return service.findByName(name).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    private ResponseEntity<MovieDto> saveMovie(@RequestBody MovieDto movieDto) {
        return new ResponseEntity<>(service.save(movieDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<String> deleteMovie (@PathVariable int id) {
        return new ResponseEntity<>(service.deleteById(id) ? "Deleted successfully" : "Not found", service.deleteById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
