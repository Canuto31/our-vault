package com.entertainment.ourvault.repository.others.gameStore;

import com.entertainment.ourvault.mapper.GameStoreMapper;
import com.entertainment.ourvault.model.dto.GameStoreDto;
import com.entertainment.ourvault.model.entity.GameStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GameStoreRepositoryImpl implements GameStoreRepository{

    @Autowired
    private GameStoreCrudRepository repository;
    @Autowired
    private GameStoreMapper mapper;

    @Override
    public List<GameStoreDto> getAllGameStores() {
        List<GameStore> gameStores = (List<GameStore>) repository.findAll();
        return mapper.entitiesToDtos(gameStores);
    }

    @Override
    public Optional<GameStoreDto> GetGameStroreById(int idGameStore) {
        return repository.findById(idGameStore).map(gameStore -> mapper.entityToDto(gameStore));
    }

    @Override
    public Optional<GameStoreDto> getGameStoreByName(String name) {
        return repository.findGameStoreByName(name).map(gameStore -> mapper.entityToDto(gameStore));
    }

    @Override
    public GameStoreDto saveGameStore(GameStoreDto gameStoreDto) {
        GameStore gameStore = mapper.dtoToEntity(gameStoreDto)
;        return mapper.entityToDto(repository.save(gameStore));
    }

    @Override
    public void deleteGameStore(int idGameStore) {
        repository.deleteById(idGameStore);
    }
}
