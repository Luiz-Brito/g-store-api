package com.luiz.g_store_api.application.dto;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Builder
public class GameDTO {

    private Long id;

    private String title;

    private Integer year;

    private String genre;

    private Double score;

    private String platforms;

    private String imgUrl;

    private String shortDescription;

    private String longDescription;

}
