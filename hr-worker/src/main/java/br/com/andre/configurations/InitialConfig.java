package br.com.andre.configurations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.andre.entities.Worker;
import br.com.andre.repositories.WorkerRepository;

@Configuration
@Profile("local")
public class InitialConfig {

	@Autowired
	private WorkerRepository workerRepository;;
	
	@Bean
	public void inititalSetup() {
		
		Worker k1 = new Worker(null, "André", 200.0);
		Worker k2 = new Worker(null, "Pedro", 200.0);
		Worker k3 = new Worker(null, "Pamela", 200.0);
		
		workerRepository.saveAll(List.of(k1, k2, k3));
		
	}

}
