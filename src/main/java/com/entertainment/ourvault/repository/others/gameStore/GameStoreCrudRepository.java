package com.entertainment.ourvault.repository.others.gameStore;

import com.entertainment.ourvault.model.entity.GameStore;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GameStoreCrudRepository extends CrudRepository<GameStore, Integer> {

    Optional<GameStore> findGameStoreByName(String name);
}
