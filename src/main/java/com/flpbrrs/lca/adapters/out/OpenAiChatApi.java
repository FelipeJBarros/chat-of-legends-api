package com.flpbrrs.lca.adapters.out;

import com.flpbrrs.lca.domain.ports.GenerativeAIApi;
import feign.FeignException;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@ConditionalOnProperty(name = "generative-ai.provider", havingValue = "GEMINI", matchIfMissing = true)
@FeignClient(name = "geminiApi", url = "${gemini.base-url}", configuration = OpenAiChatApi.Config.class)
public interface OpenAiChatApi extends GenerativeAIApi {

    @PostMapping("/v1beta/models/gemini-pro:generateContent")
    GoogleGeminiResp textOnlyInput(GoogleGeminiReq req);

    @Override
    default String generateContent(String objective, String context) {
        String prompt = """
                %s
                %s
                """.formatted(objective, context);

        GoogleGeminiReq req = new GoogleGeminiReq(
                List.of(new Content(List.of(new Part(prompt))))
        );
        try {
            GoogleGeminiResp resp = textOnlyInput(req);
            return resp.candidates().get(0).content().parts().get(0).text();
        } catch (FeignException httpErrors) {
            return "Não estou conseguindo responder agora, tente novamente mais tarde.";
        } catch (Exception unexpectedError) {
            return "Algo está errado aqui, pergunte outra coisa ou volte mais tarde";
        }
    }

    record GoogleGeminiReq(List<Content> contents) { }
    record Content(List<Part> parts) { }
    record Part(String text) { }
    record GoogleGeminiResp(List<Candidate> candidates) { }
    record Candidate(Content content) { }

    class Config {
        @Bean
        public RequestInterceptor apiKeyRequestInterceptor(@Value("${gemini.api-key}") String apiKey) {
            return requestTemplate -> requestTemplate.query("key", apiKey);
        }
    }
}
