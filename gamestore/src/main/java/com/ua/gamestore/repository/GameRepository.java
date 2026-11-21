package com.ua.gamestore.repository;

import com.ua.gamestore.domain.Game;

import java.util.List;
import java.util.Optional;

public interface GameRepository {
    List<Game> findAll();

    Optional<Game> findById(Long id);

    List<Game> findByGenre(String genre);

    Game save(Game game);

    boolean deleteById(Long id);
}
