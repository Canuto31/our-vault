package com.entertainment.ourvault.service.others;

import com.entertainment.ourvault.model.dto.CategoryDto;
import com.entertainment.ourvault.model.dto.TypeDto;
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
    private CategoryRepository categoryRepository;

    @Override
    public List<TypeDto> getAll() {
        return typeRepository.getAll();
    }

    @Override
    public Optional<TypeDto> findById(int idType) {
        return typeRepository.GetTypeById(idType);
    }

    @Override
    public Optional<TypeDto> findByName(String typename) {
        return typeRepository.getTypeByName(typename);
    }

    @Override
    public TypeDto saveType(TypeDto typeDto) {
        return typeRepository.saveType(typeDto);
    }

    @Override
    public boolean deleteTypeById(int idType) {
        return findById(idType).map(type -> {
            typeRepository.delete(idType);
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
}
