package com.entertainment.ourvault.repository.others.state;

import com.entertainment.ourvault.model.entity.State;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StateCrudRepository extends CrudRepository<State, Integer> {

    Optional<State> findByName(String name);
}
