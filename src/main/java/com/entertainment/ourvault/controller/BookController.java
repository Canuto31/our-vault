package com.entertainment.ourvault.controller;

import com.entertainment.ourvault.model.dto.BookDto;
import com.entertainment.ourvault.service.book.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping()
    private ResponseEntity<List<BookDto>> getAllBooks() {
        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    private ResponseEntity<BookDto> getBookByid(@PathVariable int id) {
        return service.findById(id).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/name/{name}")
    private ResponseEntity<BookDto> getBookByName(@PathVariable String name) {
        return service.findByName(name).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping()
    private ResponseEntity<BookDto> saveBook(@RequestBody BookDto bookDto) {
        return new ResponseEntity<>(service.save(bookDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<String> deleteBook (@PathVariable int id) {
        return new ResponseEntity<>(service.deleteById(id) ? "Deleted successfully" : "Not found", service.deleteById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
