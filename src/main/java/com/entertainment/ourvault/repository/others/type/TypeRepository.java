package com.entertainment.ourvault.repository.others.type;

import com.entertainment.ourvault.model.dto.TypeDto;

import java.util.List;
import java.util.Optional;

public interface TypeRepository {

    List<TypeDto> getAll();

    Optional<TypeDto> GetTypeById(int idType);

    Optional<TypeDto> getTypeByName(String typeName);

    TypeDto saveType(TypeDto typeDto);

    void delete(int idType);

}
