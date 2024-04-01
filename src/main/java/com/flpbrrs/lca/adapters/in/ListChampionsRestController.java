package com.flpbrrs.lca.adapters.in;

import com.flpbrrs.lca.application.ListChampionUseCase;
import com.flpbrrs.lca.domain.models.Champion;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name="Champions", description = "Endpoints of league of legends champions domain")
@RestController
@RequestMapping("/champions")
public record ListChampionsRestController(ListChampionUseCase useCase) {
    @GetMapping
    public List<Champion> findAllChampions() {
        return useCase.findAll();
    }

    @GetMapping("/{id}")
    public Champion findByChampionId(@PathVariable Long id) {
        return useCase.findById(id);
    }
}
