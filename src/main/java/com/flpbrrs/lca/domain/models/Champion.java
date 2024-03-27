package com.flpbrrs.lca.domain.models;

public record Champion (
    Long id,
    String name,
    String role,
    String lore,
    String imageUrl
) {
    public String generateQuestionContext(String question) {
        return """
               Pergunta: %s
               Nome do campeão: %s
               Função: %s
               Lore (História): %s
               Imagem: %s
               """
                .formatted(question, this.name, this.role, this.lore, this.imageUrl);
    }
}
