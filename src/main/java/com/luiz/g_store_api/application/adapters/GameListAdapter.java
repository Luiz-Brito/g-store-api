package com.luiz.g_store_api.application.adapters;

import com.luiz.g_store_api.application.dto.GameListDTO;
import com.luiz.g_store_api.resource.models.GameList;
import org.springframework.stereotype.Component;

@Component
public class GameListAdapter {

    public GameListDTO toGameListDTO(GameList gameList) {
        return GameListDTO.builder()
                .id(gameList.getId())
                .name(gameList.getName())
                .build();
    }

}
