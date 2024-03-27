package com.flpbrrs.lca.adapters.in;

import com.flpbrrs.lca.application.AskChampionUseCase;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name="Champions", description = "Endpoints of league of legends champions domain")
@RestController
@RequestMapping("/champions")
public record AskChampionRestController(AskChampionUseCase useCase) {
    @PostMapping("/{id}/ask")
    public AskChampionResponse askChampion(@PathVariable Long id, @RequestBody AskChampionRequest request) {
        String answer = useCase.askChampion(id, request.question);
        return new AskChampionResponse(answer);
    }

    public record AskChampionRequest(String question) { };

    public record AskChampionResponse(String answer) { };
}
