package com.entertainment.ourvault.repository.others.type;

import com.entertainment.ourvault.model.dto.TypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TypeRepositoryImpl implements TypeRepository{

    @Autowired
    private TypeCrudRepository repository;

    @Override
    public List<TypeDto> getAll() {
        return null;
    }

    @Override
    public Optional<TypeDto> GetTypeById(int idType) {
        return Optional.empty();
    }

    @Override
    public Optional<TypeDto> getTypeByName(String typeName) {
        return Optional.empty();
    }

    @Override
    public TypeDto saveType(TypeDto typeDto) {
        return null;
    }

    @Override
    public void delete(int idType) {

    }
}
