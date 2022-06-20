package br.com.andre.hrpayroll.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	@Bean //para criar componente a partir de uma chamada de método
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
		
	}
	
}
