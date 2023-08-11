package com.entertainment.ourvault.service.others;

import com.entertainment.ourvault.model.dto.*;
import com.entertainment.ourvault.repository.others.author.AuthorRepository;
import com.entertainment.ourvault.repository.others.book.BookRepository;
import com.entertainment.ourvault.repository.others.state.StateRepository;
import com.entertainment.ourvault.repository.others.category.CategoryRepository;
import com.entertainment.ourvault.repository.others.type.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OtherServiceImpl implements OtherService{

    @Autowired
    private TypeRepository typeRepository;
    @Autowired
    private StateRepository stateRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<TypeDto> getAllTypes() {
        return typeRepository.getAll();
    }

    @Override
    public Optional<TypeDto> findTypeById(int idType) {
        return typeRepository.GetTypeById(idType);
    }

    @Override
    public Optional<TypeDto> findTypeByName(String typename) {
        return typeRepository.getTypeByName(typename);
    }

    @Override
    public TypeDto saveType(TypeDto typeDto) {
        return typeRepository.saveType(typeDto);
    }

    @Override
    public boolean deleteTypeById(int idType) {
        return this.findTypeById(idType).map(type -> {
            typeRepository.delete(idType);
            return true;
        }).orElse(false);
    }

    @Override
    public List<StateDto> getAllStates() {
        return stateRepository.getAll();
    }

    @Override
    public Optional<StateDto> findStateById(int idState) {
        return stateRepository.GetStateById(idState);
    }

    @Override
    public Optional<StateDto> findStateByName(String name) {
        return stateRepository.getStateByName(name);
    }

    @Override
    public StateDto saveState(StateDto stateDto) {
        return stateRepository.saveType(stateDto);
    }

    @Override
    public boolean deleteStateById(int idState) {
        return this.findStateById(idState).map(type -> {
            stateRepository.delete(idState);
            return true;
        }).orElse(false);
    }

    @Override
    public List<CategoryDto> getAllCategories() {
        return categoryRepository.getAllCategories();
    }

    @Override
    public Optional<CategoryDto> findCategoryById(int idCategory) {
        return categoryRepository.GetCategoryById(idCategory);
    }

    @Override
    public Optional<CategoryDto> findCategoryByName(String name) {
        return categoryRepository.getCategoryByName(name);
    }

    @Override
    public CategoryDto saveCategory(CategoryDto categoryDto) {
        return categoryRepository.saveCategory(categoryDto);
    }

    @Override
    public boolean deleteCategoryById(int idCategory) {
        return findCategoryById(idCategory).map(type -> {
            categoryRepository.deleteCategory(idCategory);
            return true;
        }).orElse(false);
    }

    @Override
    public List<AuthorDto> getAllAuthors() {
        return authorRepository.getAllAuthors();
    }

    @Override
    public Optional<AuthorDto> findAuthorById(int idAuthor) {
        return authorRepository.GetAuthorById(idAuthor);
    }

    @Override
    public Optional<AuthorDto> findAuthorByName(String name) {
        return authorRepository.getAuthorByName(name);
    }

    @Override
    public AuthorDto saveAuthor(AuthorDto authorDto) {
        return authorRepository.saveAuthor(authorDto);
    }

    @Override
    public boolean deleteAuthorById(int idAuthor) {
        return findAuthorById(idAuthor).map(author -> {
            authorRepository.deleteAuthor(idAuthor);
            return true;
        }).orElse(false);
    }

    @Override
    public List<BookDto> getAllBooks() {
        return bookRepository.getAllBooks();
    }

    @Override
    public Optional<BookDto> findBookById(int idBook) {
        return bookRepository.GetBookById(idBook);
    }

    @Override
    public Optional<BookDto> findBookByName(String name) {
        return bookRepository.getBookByName(name);
    }

    @Override
    public BookDto saveBook(BookDto bookDto) {
        return bookRepository.saveBook(bookDto);
    }

    @Override
    public boolean deleteBookById(int idBook) {
        return findBookById(idBook).map(book -> {
            bookRepository.deleteBook(idBook);
            return true;
        }).orElse(false);
    }
}
