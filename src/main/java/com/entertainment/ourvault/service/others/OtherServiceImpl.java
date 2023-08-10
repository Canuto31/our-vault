package com.entertainment.ourvault.service.others;

import com.entertainment.ourvault.model.dto.StateDto;
import com.entertainment.ourvault.model.dto.TypeDto;
import com.entertainment.ourvault.repository.others.state.StateRepository;
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
    private StateRepository stateRepository;

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

    @Override
    public List<StateDto> getAllStates() {
        return stateRepository.getAll();
    }

    @Override
    public Optional<StateDto> findStateById(int idState) {
        return stateRepository.GetStateById(idState);
    }

    @Override
    public Optional<StateDto> findStateByName(String name) {
        return stateRepository.getStateByName(name);
    }

    @Override
    public StateDto saveState(StateDto stateDto) {
        return stateRepository.saveType(stateDto);
    }

    @Override
    public boolean deleteStateById(int idState) {
        return this.findStateById(idState).map(type -> {
            stateRepository.delete(idState);
            return true;
        }).orElse(false);
    }
}
