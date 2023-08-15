package com.entertainment.ourvault.controller;

import com.entertainment.ourvault.model.dto.SerieDto;
import com.entertainment.ourvault.service.serie.SerieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieController {

    @Autowired
    private SerieService service;

    @GetMapping()
    private ResponseEntity<List<SerieDto>> getAllSeries() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    private ResponseEntity<SerieDto> getSerieByid(@PathVariable int id) {
        return service.findById(id).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/name/{name}")
    private ResponseEntity<SerieDto> getSerieByName(@PathVariable String name) {
        return service.findByName(name).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("")
    private ResponseEntity<SerieDto> saveSerie(@RequestBody SerieDto serieDto) {
        return new ResponseEntity<>(service.save(serieDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<String> deleteSerie (@PathVariable int id) {
        return new ResponseEntity<>(service.deleteById(id) ? "Deleted successfully" : "Not found", service.deleteById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
