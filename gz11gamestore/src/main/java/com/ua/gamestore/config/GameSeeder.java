package com.ua.gamestore.config;

import com.ua.gamestore.domain.Game;
import com.ua.gamestore.repository.GameRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class GameSeeder implements ApplicationRunner {

    private final GameRepository repository;

    public GameSeeder(GameRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(ApplicationArguments args) {
        repository.save(new Game(null, "The Witcher 3: Wild Hunt", "CD Projekt Red",
                new BigDecimal("499.00"), 2015, "/covers/witcher3.jpg",
                "Рольова гра з відкритим світом, де ви граєте мисливцем на монстрів Геральтом.",
                "RPG"));
        repository.save(new Game(null, "S.T.A.L.K.E.R.: Shadow of Chernobyl", "GSC Game World",
                new BigDecimal("299.00"), 2007, "/covers/stalker.jpg",
                "Шутер від першої особи в Зоні відчуження з елементами виживання.",
                "Шутер"));
        repository.save(new Game(null, "Hollow Knight", "Team Cherry",
                new BigDecimal("215.00"), 2017, "/covers/hollow-knight.jpg",
                "Платформер у стилі метроїдванії про подорож підземним королівством жуків.",
                "Метроїдванія"));
        repository.save(new Game(null, "Portal 2", "Valve",
                new BigDecimal("175.00"), 2011, "/covers/portal2.jpg",
                "Головоломка з порталами.",
                "Головоломка"));
    }
}
