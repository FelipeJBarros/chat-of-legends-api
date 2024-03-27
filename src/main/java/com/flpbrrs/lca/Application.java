package com.flpbrrs.lca;

import com.flpbrrs.lca.application.ListChampionUseCase;
import com.flpbrrs.lca.domain.ports.ChampionsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ListChampionUseCase provideListChampionsUseCase(ChampionsRepository repository) {
		return new ListChampionUseCase(repository);
	}
}
