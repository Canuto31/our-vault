package com.entertainment.ourvault.repository.others.state;

import com.entertainment.ourvault.model.dto.StateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StateRepositoryImpl implements StateRepository{

    @Autowired
    private StateCrudRepository repository;

    @Override
    public List<StateDto> getAll() {
        return null;
    }

    @Override
    public Optional<StateDto> GetStateById(int idState) {
        return Optional.empty();
    }

    @Override
    public Optional<StateDto> getStateByName(String name) {
        return Optional.empty();
    }

    @Override
    public StateDto saveType(StateDto stateDto) {
        return null;
    }

    @Override
    public void delete(int idState) {

    }
}
