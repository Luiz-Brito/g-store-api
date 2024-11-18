package com.luiz.g_store_api.application.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GameListDTO {

    private Long id;

    private String name;
}
