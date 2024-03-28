package com.flpbrrs.lca.adapters.out;

import com.flpbrrs.lca.domain.ports.GenerativeAIApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "openAiChatApi", url = "${openai.base-url}")
public interface OpenAiChatApi extends GenerativeAIApi {

    @PostMapping("/v1/chat/completions")
    OpenAIChatCompletionResponse chatCompletion(OpenAIChatCompletionRequest request);

    @Override
    default String generateContent(String objective, String context) {
        String model = "gpt-3.5-turbo";
        List<Message> messages = List.of(
                new Message("system", objective),
                new Message("user", context)
        );
        OpenAIChatCompletionRequest request = new OpenAIChatCompletionRequest(model, messages);

        OpenAIChatCompletionResponse response = chatCompletion(request);
        return response.choices.getFirst().message().content;
    }

    record OpenAIChatCompletionRequest(String model, List<Message> messages) {};
    record OpenAIChatCompletionResponse(List<Choice> choices) {};
    record Message(String role, String content) {};
    record Choice(Message message) {};
}
