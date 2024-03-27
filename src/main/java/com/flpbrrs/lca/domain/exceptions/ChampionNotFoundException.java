package com.flpbrrs.lca.domain.exceptions;

public class ChampionNotFoundException extends RuntimeException {
    public ChampionNotFoundException(Long id) {
        super("Champion %d not found".formatted(id));
    }
}
