package com.entertainment.ourvault.repository.others.gameStore;

import com.entertainment.ourvault.model.dto.GameStoreDto;

import java.util.List;
import java.util.Optional;

public interface GameStoreRepository {

    List<GameStoreDto> getAllGameStores();

    Optional<GameStoreDto> GetGameStoreById(int idGameStore);

    Optional<GameStoreDto> getGameStoreByName(String name);

    GameStoreDto saveGameStore(GameStoreDto gameStoreDto);

    void deleteGameStore(int idGameStore);
}
