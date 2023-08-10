package com.entertainment.ourvault.service.others;

import com.entertainment.ourvault.model.dto.CategoryDto;
import com.entertainment.ourvault.model.dto.TypeDto;

import java.util.List;
import java.util.Optional;

public interface OtherService {

    List<TypeDto> getAll();

    Optional<TypeDto> findById(int idType);

    Optional<TypeDto> findByName(String typename);

    TypeDto saveType(TypeDto typeDto);

    boolean deleteTypeById(int idType);





























    List<CategoryDto> getAllCategories();

    Optional<CategoryDto> findCategoryById(int idCategory);

    Optional<CategoryDto> findCategoryByName(String name);

    CategoryDto saveCategory(CategoryDto categoryDto);

    boolean deleteCategoryById(int idCategory);
}
