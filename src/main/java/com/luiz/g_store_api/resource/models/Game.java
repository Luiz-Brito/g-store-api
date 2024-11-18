package com.luiz.g_store_api.resource.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column(name = "game_year")
    private Integer year;

    @Column
    private String genre;

    @Column
    private String platforms;

    @Column
    private Double score;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "short_description", columnDefinition = "TEXT", length = 1000000)
    private String shortDescription;

    @Column(name = "long_description", columnDefinition = "TEXT", length = 1000000)
    private String longDescription;
}
