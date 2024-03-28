package com.flpbrrs.lca;

import com.flpbrrs.lca.application.AskChampionUseCase;
import com.flpbrrs.lca.application.ListChampionUseCase;
import com.flpbrrs.lca.domain.ports.ChampionsRepository;
import com.flpbrrs.lca.domain.ports.GenerativeAIApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ListChampionUseCase provideListChampionsUseCase(ChampionsRepository repository) {
		return new ListChampionUseCase(repository);
	}

	@Bean
	AskChampionUseCase provideAskChampionUseCase(ChampionsRepository repository, GenerativeAIApi genAiApi) {
		return new AskChampionUseCase(repository, genAiApi);
	}
}
