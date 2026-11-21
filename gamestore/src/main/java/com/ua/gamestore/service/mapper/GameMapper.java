package com.ua.gamestore.service.mapper;

import com.ua.gamestore.domain.Game;
import com.ua.gamestore.web.dto.GameCardDto;
import com.ua.gamestore.web.dto.GameDetailDto;
import com.ua.gamestore.web.dto.GameRequest;
import org.springframework.stereotype.Component;

@Component
public class GameMapper {

    public GameCardDto toCard(Game g) {
        return new GameCardDto(g.getId(), g.getTitle(), g.getDeveloper(),
                g.getPrice(), g.getCoverUrl());
    }

    public GameDetailDto toDetail(Game g) {
        return new GameDetailDto(g.getId(), g.getTitle(), g.getDeveloper(), g.getPrice(),
                g.getYear(), g.getCoverUrl(), g.getDescription(), g.getGenre());
    }

    public Game toDomain(GameRequest r) {
        Game g = new Game();
        g.setTitle(r.title());
        g.setDeveloper(r.developer());
        g.setPrice(r.price());
        g.setYear(r.year());
        g.setGenre(r.genre());
        g.setCoverUrl(r.coverUrl());
        g.setDescription(r.description());
        return g;
    }
}
