package com.entertainment.ourvault.controller;

import com.entertainment.ourvault.model.dto.*;
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
        return new ResponseEntity<>(service.deleteCategoryById(id) ? "Deleted successfully" : "Not found", service.deleteCategoryById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping("/author")
    private ResponseEntity<List<AuthorDto>> getAllAuthors() {
        return new ResponseEntity<>(service.getAllAuthors(), HttpStatus.OK);
    }

    @GetMapping("/author/id/{id}")
    private ResponseEntity<AuthorDto> getAuthorByid(@PathVariable int id) {
        return service.findAuthorById(id).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/author/name/{name}")
    private ResponseEntity<AuthorDto> getAuthorByName(@PathVariable String name) {
        return service.findAuthorByName(name).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/author")
    private ResponseEntity<AuthorDto> saveAuthor(@RequestBody AuthorDto authorDto) {
        return new ResponseEntity<>(service.saveAuthor(authorDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/author/{id}")
    private ResponseEntity<String> deleteAuthor (@PathVariable int id) {
        return new ResponseEntity<>(service.deleteAuthorById(id) ? "Deleted successfully" : "Not found", service.deleteAuthorById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping("/game-store")
    private ResponseEntity<List<GameStoreDto>> getAllGameStores() {
        return new ResponseEntity<>(service.getAllGameStores(), HttpStatus.OK);
    }

    @GetMapping("/game-store/id/{id}")
    private ResponseEntity<GameStoreDto> getGameStoreByid(@PathVariable int id) {
        return service.findGameStoreById(id).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/game-store/name/{name}")
    private ResponseEntity<GameStoreDto> getGameStoreByName(@PathVariable String name) {
        return service.findGameStoreByName(name).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/game-store")
    private ResponseEntity<GameStoreDto> saveGameStore(@RequestBody GameStoreDto gameStoreDto) {
        return new ResponseEntity<>(service.saveGameStore(gameStoreDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/game-store/{id}")
    private ResponseEntity<String> deleteGameStore (@PathVariable int id) {
        return new ResponseEntity<>(service.deleteGameStoreById(id) ? "Deleted successfully" : "Not found", service.deleteGameStoreById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }

    @GetMapping("/stream-page")
    private ResponseEntity<List<StreamPageDto>> getAllStreamPages() {
        return new ResponseEntity<>(service.getAllStreamPages(), HttpStatus.OK);
    }

    @GetMapping("/stream-page/id/{id}")
    private ResponseEntity<StreamPageDto> getStreamPageByid(@PathVariable int id) {
        return service.findStreamPageById(id).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/stream-page/name/{name}")
    private ResponseEntity<StreamPageDto> getStreamPageByName(@PathVariable String name) {
        return service.findStreamPageByName(name).map(type -> new ResponseEntity<>(type, HttpStatus.OK)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/stream-page")
    private ResponseEntity<StreamPageDto> saveStreamPage(@RequestBody StreamPageDto streamPageDto) {
        return new ResponseEntity<>(service.saveStreamPage(streamPageDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/stream-page/{id}")
    private ResponseEntity<String> deleteStreamPage (@PathVariable int id) {
        return new ResponseEntity<>(service.deleteStreamPageById(id) ? "Deleted successfully" : "Not found", service.deleteStreamPageById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
    }
}
