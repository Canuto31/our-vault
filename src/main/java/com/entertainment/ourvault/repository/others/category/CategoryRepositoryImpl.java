package com.entertainment.ourvault.repository.others.category;

import com.entertainment.ourvault.model.dto.CategoryDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository{
    @Override
    public List<CategoryDto> getAllCategories() {
        return null;
    }

    @Override
    public Optional<CategoryDto> GetCategoryById(int idCategory) {
        return Optional.empty();
    }

    @Override
    public Optional<CategoryDto> getCategoryByName(String name) {
        return Optional.empty();
    }

    @Override
    public CategoryDto saveCategory(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public void deleteCategory(int idCategory) {

    }
}
