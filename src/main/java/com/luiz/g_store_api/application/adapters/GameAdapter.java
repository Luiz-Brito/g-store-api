package com.luiz.g_store_api.application.adapters;

import com.luiz.g_store_api.application.dto.GameDTO;
import com.luiz.g_store_api.resource.models.Game;
import org.springframework.stereotype.Component;

@Component
public class GameAdapter {

    public GameDTO toGameDTO(Game game) {
        return GameDTO.builder()
                .id(game.getId())
                .title(game.getTitle())
                .year(game.getYear())
                .genre(game.getGenre())
                .score(game.getScore())
                .platforms(game.getPlatforms())
                .imgUrl(game.getImgUrl())
                .shortDescription(game.getShortDescription())
                .longDescription(game.getLongDescription())
                .build();
    }
}
