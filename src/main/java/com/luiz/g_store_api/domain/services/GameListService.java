package com.luiz.g_store_api.domain.services;

import com.luiz.g_store_api.resource.models.GameList;
import com.luiz.g_store_api.resource.repositories.GameListRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GameListService {

    private final GameListRepository gameListRepository;

    public List<GameList> findAll() {
        return gameListRepository.findAll();
    }
}
