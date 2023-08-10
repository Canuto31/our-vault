package com.entertainment.ourvault.repository.others.state;

import com.entertainment.ourvault.mapper.StateMapper;
import com.entertainment.ourvault.model.dto.StateDto;
import com.entertainment.ourvault.model.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StateRepositoryImpl implements StateRepository{

    @Autowired
    private StateCrudRepository repository;
    @Autowired
    private StateMapper mapper;

    @Override
    public List<StateDto> getAll() {
        List<State> states = (List<State>) repository.findAll();
        return mapper.entitiesToDtos(states);
    }

    @Override
    public Optional<StateDto> GetStateById(int idState) {
        return repository.findById(idState).map(state -> mapper.entityToDto(state));
    }

    @Override
    public Optional<StateDto> getStateByName(String name) {
        return repository.findByName(name).map(state -> mapper.entityToDto(state));
    }

    @Override
    public StateDto saveType(StateDto stateDto) {
        State state = mapper.dtoToEntity(stateDto);
        return mapper.entityToDto(repository.save(state));
    }

    @Override
    public void delete(int idState) {
        repository.deleteById(idState);
    }
}
