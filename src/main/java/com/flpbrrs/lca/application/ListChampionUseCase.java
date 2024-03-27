package com.flpbrrs.lca.application;

import com.flpbrrs.lca.domain.models.Champion;
import com.flpbrrs.lca.domain.ports.ChampionsRepository;

import java.util.List;

public record ListChampionUseCase(ChampionsRepository repository) {
    public List<Champion> findAll() {
        return repository.findAll();
    }
}
