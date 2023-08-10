package com.entertainment.ourvault.repository.others.category;

import com.entertainment.ourvault.mapper.CategoryMapper;
import com.entertainment.ourvault.model.dto.CategoryDto;
import com.entertainment.ourvault.model.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository{

    @Autowired
    private CategoryCrudRepository repository;
    @Autowired
    private CategoryMapper mapper;

    @Override
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = (List<Category>) repository.findAll();
        return mapper.entitiesToDtos(categories);
    }

    @Override
    public Optional<CategoryDto> GetCategoryById(int idCategory) {
        return repository.findById(idCategory).map(category -> mapper.entityToDto(category));
    }

    @Override
    public Optional<CategoryDto> getCategoryByName(String name) {
        return repository.findCategoryByName(name).map(category -> mapper.entityToDto(category));
    }

    @Override
    public CategoryDto saveCategory(CategoryDto categoryDto) {
        Category category = mapper.dtoToEntity(categoryDto);
        return mapper.entityToDto(repository.save(category));
    }

    @Override
    public void deleteCategory(int idCategory) {
        repository.deleteById(idCategory);
    }
}
