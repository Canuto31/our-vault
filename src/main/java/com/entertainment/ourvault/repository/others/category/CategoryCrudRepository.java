package com.entertainment.ourvault.repository.others.category;

import com.entertainment.ourvault.model.entity.Category;
import com.entertainment.ourvault.model.entity.Type;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {

    Optional<Category> findCategoryByName(String name);
}
