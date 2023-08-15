package com.entertainment.ourvault.controller;

import com.entertainment.ourvault.model.dto.VideogameDto;
import com.entertainment.ourvault.service.videogame.VideogameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videogame")
public class VideogameController {

    @Autowired
    private VideogameService service;

    @GetMapping()
    private ResponseEntity<List<VideogameDto>> getAllVideogames() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    private ResponseEntity<VideogameDto> getVideogameByid(@PathVariable int id) {
        return service.findById(id).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/name/{name}")
    private ResponseEntity<VideogameDto> getVideogameByName(@PathVariable String name) {
        return service.findByName(name).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("")
    private ResponseEntity<VideogameDto> saveVideogame(@RequestBody VideogameDto videogameDto) {
        return new ResponseEntity<>(service.save(videogameDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<String> deleteVideogame (@PathVariable int id) {
        return new ResponseEntity<>(service.deleteById(id) ? "Deleted successfully" : "Not found", service.deleteById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
