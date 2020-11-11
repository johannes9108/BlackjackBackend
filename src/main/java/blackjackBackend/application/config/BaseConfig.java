package blackjackBackend.application.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import blackjackBackend.application.model.Card;
import blackjackBackend.application.model.Rank;
import blackjackBackend.application.model.Suit;

@Configuration
public class BaseConfig {

	
	
	@Bean
	public CommandLineRunner runner() {
		return (args)->{
			
			
			
		};
	}
}
