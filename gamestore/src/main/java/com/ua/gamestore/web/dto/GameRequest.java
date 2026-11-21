package com.ua.gamestore.web.dto;

import java.math.BigDecimal;

public record GameRequest(String title, String developer, BigDecimal price,
                          Integer year, String genre, String coverUrl, String description) {
}
