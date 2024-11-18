package com.luiz.g_store_api.resource.repositories;

import com.luiz.g_store_api.resource.models.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
