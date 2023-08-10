package com.entertainment.ourvault.repository.others.type;

import com.entertainment.ourvault.mapper.TypeMapper;
import com.entertainment.ourvault.model.dto.TypeDto;
import com.entertainment.ourvault.model.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TypeRepositoryImpl implements TypeRepository{

    @Autowired
    private TypeCrudRepository repository;
    @Autowired
    private TypeMapper mapper;

    @Override
    public List<TypeDto> getAll() {
        List<Type> types = (List<Type>) repository.findAll();
        return mapper.entitiesToDtos(types);
    }

    @Override
    public Optional<TypeDto> GetTypeById(int idType) {
        return repository.findById(idType).map(type -> mapper.entityToDto(type));
    }

    @Override
    public Optional<TypeDto> getTypeByName(String typeName) {
        return repository.findByName(typeName).map(type -> mapper.entityToDto(type));
    }

    @Override
    public TypeDto saveType(TypeDto typeDto) {
        Type type = mapper.dtoToEntity(typeDto);
        return mapper.entityToDto(repository.save(type));
    }

    @Override
    public void delete(int idType) {
        repository.deleteById(idType);
    }
}
