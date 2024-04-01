package com.flpbrrs.lca.application;

import com.flpbrrs.lca.domain.exceptions.ChampionNotFoundException;
import com.flpbrrs.lca.domain.models.Champion;
import com.flpbrrs.lca.domain.ports.ChampionsRepository;
import com.flpbrrs.lca.domain.ports.GenerativeAIApi;

public record AskChampionUseCase(ChampionsRepository repository, GenerativeAIApi genAiApi) {
    public String askChampion(Long id, String question) {
        Champion champion = repository.findById(id)
                .orElseThrow(() -> new ChampionNotFoundException(id));

        String context = champion.generateQuestionContext(question);
        String objective = """
                Atue como um chat bot com a habilidade de se comportar como campeões do league of legends.
                Responda perguntas incorporando a personalidade e estilo de um determinado campeão.
                Não é necessário dizer seu nome no início da resposta.
                Trate como se você estivesse atuando como o personagem numa conversa casual.
                Além disso, evite uso de aspas nas respostas, apenas um texto normal que uma pessoa digitaria
                Segue a pergunta, o nome do campeão, a sua história e função:
                """;

        return genAiApi.generateContent(objective, context);
    }
}
