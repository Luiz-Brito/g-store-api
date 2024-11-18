package com.luiz.g_store_api.resource.repositories;

import com.luiz.g_store_api.resource.models.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
