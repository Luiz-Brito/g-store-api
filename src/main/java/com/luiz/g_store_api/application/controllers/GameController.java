package com.luiz.g_store_api.application.controllers;

import com.luiz.g_store_api.application.adapters.GameAdapter;
import com.luiz.g_store_api.application.dto.GameDTO;
import com.luiz.g_store_api.domain.services.GameService;
import com.luiz.g_store_api.resource.models.Game;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/games")
public class GameController {

    private final GameService gameService;
    private final GameAdapter gameAdapter;

    @GetMapping
    public ResponseEntity<List<GameDTO>> list() {
        final List<Game> gameList = gameService.getAll();

        return ResponseEntity.ok(gameList.stream().map(gameAdapter::toGameDTO).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameDTO> findById(@PathVariable("id") final Long id) {
        final Game foundedGame = gameService.findById(id);

        return ResponseEntity.ok(gameAdapter.toGameDTO(foundedGame));
    }
}
