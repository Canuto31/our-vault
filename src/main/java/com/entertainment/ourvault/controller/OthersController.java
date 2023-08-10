package com.entertainment.ourvault.controller;

import com.entertainment.ourvault.model.dto.TypeDto;
import com.entertainment.ourvault.service.others.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/others")
public class OthersController {

    @Autowired
    private OtherService service;

    @GetMapping("/say-hi")
    private String sayHello() {
        return "Hello world";
    }

    @GetMapping("/type")
    private ResponseEntity<List<TypeDto>> getAll() {
        return new ResponseEntity<>(service.getAllTypes(), HttpStatus.OK);
    }

    @GetMapping("/type/id/{id}")
    private ResponseEntity<TypeDto> getByTypeName(@PathVariable int id) {
        return service.findTypeById(id).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/type/name/{typeName}")
    private ResponseEntity<TypeDto> getByTypeName(@PathVariable String typeName) {
        return service.findTypeByName(typeName).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/type")
    private ResponseEntity<TypeDto> saveType(@RequestBody TypeDto typeDto) {
        return new ResponseEntity<>(service.saveType(typeDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/type/{id}")
    private ResponseEntity<String> deleteType (@PathVariable int id) {
        return new ResponseEntity<>(service.deleteTypeById(id) ? "Deleted successfully" : "Not found", service.deleteTypeById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
