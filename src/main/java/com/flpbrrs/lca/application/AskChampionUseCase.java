package com.flpbrrs.lca.application;

import com.flpbrrs.lca.domain.exceptions.ChampionNotFoundException;
import com.flpbrrs.lca.domain.models.Champion;
import com.flpbrrs.lca.domain.ports.ChampionsRepository;

public record AskChampionUseCase(ChampionsRepository repository) {
    public String askChampion(Long id, String question) {
        Champion champion = repository.findById(id)
                .orElseThrow(() -> new ChampionNotFoundException(id));

        // TODO: Improve domain logic with generative AI

        return champion.generateQuestionContext(question);
    }
}
