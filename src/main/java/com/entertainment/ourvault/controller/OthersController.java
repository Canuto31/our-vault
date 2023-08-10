package com.entertainment.ourvault.controller;

import com.entertainment.ourvault.model.dto.StateDto;
import com.entertainment.ourvault.model.dto.CategoryDto;
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
    private ResponseEntity<List<TypeDto>> getAllTypes() {
        return new ResponseEntity<>(service.getAllTypes(), HttpStatus.OK);
    }

    @GetMapping("/type/id/{id}")
    private ResponseEntity<TypeDto> getTypeById(@PathVariable int id) {
        return service.findTypeById(id).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/type/name/{name}")
    private ResponseEntity<TypeDto> getTypeByName(@PathVariable String name) {
        return service.findTypeByName(name).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/type")
    private ResponseEntity<TypeDto> saveType(@RequestBody TypeDto typeDto) {
        return new ResponseEntity<>(service.saveType(typeDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/type/{id}")
    private ResponseEntity<String> deleteType (@PathVariable int id) {
        return new ResponseEntity<>(service.deleteTypeById(id) ? "Deleted successfully" : "Not found", service.deleteTypeById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping("/state")
    private ResponseEntity<List<StateDto>> getAllStates() {
        return new ResponseEntity<>(service.getAllStates(), HttpStatus.OK);
    }

    @GetMapping("/state/id/{id}")
    private ResponseEntity<StateDto> getStateById(@PathVariable int id) {
        return service.findStateById(id).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/state/name/{name}")
    private ResponseEntity<StateDto> getStateByName(@PathVariable String name) {
        return service.findStateByName(name).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/state")
    private ResponseEntity<StateDto> saveState(@RequestBody StateDto stateDto) {
        return new ResponseEntity<>(service.saveState(stateDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/state/{id}")
    private ResponseEntity<String> deleteState (@PathVariable int id) {
        return new ResponseEntity<>(service.deleteStateById(id) ? "Deleted successfully" : "Not found", service.deleteStateById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping("/category")
    private ResponseEntity<List<CategoryDto>> getAllCategories() {
        return new ResponseEntity<>(service.getAllCategories(), HttpStatus.OK);
    }

    @GetMapping("/category/id/{id}")
    private ResponseEntity<CategoryDto> getCategoryByid(@PathVariable int id) {
        return service.findCategoryById(id).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/category/name/{name}")
    private ResponseEntity<CategoryDto> getCategoryByName(@PathVariable String name) {
        return service.findCategoryByName(name).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/category")
    private ResponseEntity<CategoryDto> saveCategory(@RequestBody CategoryDto categoryDto) {
        return new ResponseEntity<>(service.saveCategory(categoryDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/category/{id}")
    private ResponseEntity<String> deleteCategory (@PathVariable int id) {
        return new ResponseEntity<>(service.deleteCategoryById(id) ? "Deleted successfully" : "Not found", service.deleteTypeById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
