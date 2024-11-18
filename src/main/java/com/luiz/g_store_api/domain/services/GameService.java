package com.luiz.g_store_api.domain.services;

import com.luiz.g_store_api.resource.models.Game;
import com.luiz.g_store_api.resource.repositories.GameRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    public List<Game> getAll() {
        return gameRepository.findAll();
    }

    public Game findById(final Long id) {
        return gameRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
