package com.entertainment.ourvault.repository.others.category;

import com.entertainment.ourvault.model.dto.CategoryDto;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository {

    List<CategoryDto> getAllCategories();

    Optional<CategoryDto> GetCategoryById(int idCategory);

    Optional<CategoryDto> getCategoryByName(String name);

    CategoryDto saveCategory(CategoryDto categoryDto);

    void deleteCategory(int idCategory);
}
