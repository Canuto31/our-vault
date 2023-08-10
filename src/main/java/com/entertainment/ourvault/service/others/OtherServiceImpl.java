package com.entertainment.ourvault.service.others;

import com.entertainment.ourvault.model.dto.TypeDto;
import com.entertainment.ourvault.repository.others.type.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OtherServiceImpl implements OtherService{

    @Autowired
    private TypeRepository typeRepository;

    @Override
    public List<TypeDto> getAllTypes() {
        return typeRepository.getAll();
    }

    @Override
    public Optional<TypeDto> findTypeById(int idType) {
        return typeRepository.GetTypeById(idType);
    }

    @Override
    public Optional<TypeDto> findTypeByName(String typename) {
        return typeRepository.getTypeByName(typename);
    }

    @Override
    public TypeDto saveType(TypeDto typeDto) {
        return typeRepository.saveType(typeDto);
    }

    @Override
    public boolean deleteTypeById(int idType) {
        return this.findTypeById(idType).map(type -> {
            typeRepository.delete(idType);
            return true;
        }).orElse(false);
    }
}
