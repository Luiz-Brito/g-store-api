package com.luiz.g_store_api.application.controllers;

import com.luiz.g_store_api.application.adapters.GameListAdapter;
import com.luiz.g_store_api.application.dto.GameListDTO;
import com.luiz.g_store_api.domain.services.GameListService;
import com.luiz.g_store_api.resource.models.GameList;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/lists")
public class GameListController {

    private final GameListService gameListService;
    private final GameListAdapter gameListAdapter;

    @GetMapping
    public ResponseEntity<List<GameListDTO>> list() {
        final List<GameList> list = gameListService.findAll();

        return ResponseEntity.ok(list.stream().map(gameListAdapter::toGameListDTO).toList());
    }
}
