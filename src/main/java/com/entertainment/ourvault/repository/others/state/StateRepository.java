package com.entertainment.ourvault.repository.others.state;

import com.entertainment.ourvault.model.dto.StateDto;

import java.util.List;
import java.util.Optional;

public interface StateRepository {

    List<StateDto> getAll();

    Optional<StateDto> GetStateById(int idState);

    Optional<StateDto> getStateByName(String name);

    StateDto saveType(StateDto stateDto);

    void delete(int idState);
}
