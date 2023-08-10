package com.entertainment.ourvault.repository.others.type;

import com.entertainment.ourvault.model.entity.Type;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TypeCrudRepository extends CrudRepository<Type, Integer> {

    Optional<Type> findByName(String typeName);
}
