package com.entertainment.ourvault.repository.others.state;

import com.entertainment.ourvault.model.entity.State;

import java.util.Optional;

public interface StateCrudRepository {

    Optional<State> findByName(String name);
}
